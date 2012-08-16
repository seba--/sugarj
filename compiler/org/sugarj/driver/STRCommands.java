package org.sugarj.driver;

import static org.sugarj.driver.Environment.sep;
import static org.sugarj.driver.FileCommands.toWindowsPath;
import static org.sugarj.driver.Log.log;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.spoofax.interpreter.library.IOAgent;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoException;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.strj.main_strj_0_0;
import org.sugarj.driver.caching.DependentCacheValue;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.stdlib.StdLib;
import org.sugarj.util.Pair;

/**
 * This class provides methods for various SDF commands. Each
 * SDF command is represented by a separate method of a similar
 * name.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class STRCommands {
  
  
  private final static Pattern STR_FILE_PATTERN = Pattern.compile(".*\\.str");

  /**
   *  Compiles a {@code *.str} file to a single {@code *.java} file. 
   */
  private static void strj(Path str, Path java, String main, Context strjContext, Collection<Path> paths) throws IOException {
    
    /*
     * We can include as many paths as we want here, checking the
     * adequacy of the occurring imports is done elsewhere.
     */
    
    
    List<String> cmd = new ArrayList<String>(Arrays.asList(new String[] {
        "-i", toWindowsPath(str.getAbsolutePath()),
        "-o", toWindowsPath(java.getAbsolutePath()),
        "-m", main,
        "-I", StdLib.stdLibDir.getPath(),
        "-p", "sugarj",
        "--library",
        "-O", "0"
    }));
    
    for (Path path : paths)
      if (path.getFile().isDirectory()){
        cmd.add("-I");
        cmd.add(path.getAbsolutePath());
      }

    final ByteArrayOutputStream log = new ByteArrayOutputStream();

    try {
      // XXX strj does not create Java file with non-fresh context
      Context c = org.strategoxt.strj.strj.init();
      
      c.setIOAgent(new IOAgent() {
        private final PrintStream err = new PrintStream(log, true);
        private final Writer errWriter = new org.sugarj.util.PrintStreamWriter(err);
        
        public Writer getWriter(int fd) {
            if (fd == CONST_STDERR)
              return errWriter; 
            else 
              return super.getWriter(fd);
        }
        
        public OutputStream internalGetOutputStream(int fd) {
            if (fd == CONST_STDERR)
              return err; 
            else 
              return super.internalGetOutputStream(fd);
        }
      });
      
      c.invokeStrategyCLI(main_strj_0_0.instance, "strj", cmd.toArray(new String[cmd.size()]));
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0)
        throw new StrategoException("STRJ failed", e);
    } finally {
      if (log.size() > 0 && !log.toString().contains("Compilation succeeded"))
        throw new StrategoException(log.toString());

    }
  }
  
  
  public static Path compile(Path str, String main, Collection<Path> dependentFiles, JSGLRI strParser, Context strjContext, Map<String, List<DependentCacheValue<Path>>> strCache, Environment environment) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    Pair<String, ? extends Collection<Path>> key = getModuleKeyForAssimilation(str, main, dependentFiles, strParser);
    Path prog = lookupAssimilationInCache(strCache, key);
    
    if (prog == null) {
      prog = generateAssimilator(str, main, strjContext, environment.getIncludePath());
      prog = cacheAssimilator(strCache, key, prog, environment);
    }
    return prog;
  }
    
  private static Path generateAssimilator(Path str,
                                          String main,
                                          Context strjContext,
                                          Collection<Path> paths) throws IOException {
    boolean success = false;
    log.beginTask("Generating", "Generate the assimilator");
    try {
      Path dir = FileCommands.newTempDir();
      FileCommands.createDir(new RelativePath(dir, "sugarj"));
      String javaFilename = FileCommands.fileName(str).replace("-", "_");
      Path java = new RelativePath(dir, "sugarj" + sep + javaFilename + ".java");
      log.log("calling STRJ");
      strj(str, java, main, strjContext, paths);
      
      if (!JavaCommands.javac(java, dir, paths))
        throw new RuntimeException("java compilation failed");
        
      Path jarfile = FileCommands.newTempFile("jar");
      JavaCommands.jar(dir, jarfile);

      FileCommands.deleteTempFiles(dir);
      FileCommands.deleteTempFiles(java);

      success = jarfile != null;
      return jarfile;
    } finally {
      log.endTask(success);
    }
  }
    
  private static Path cacheAssimilator(Map<String, List<DependentCacheValue<Path>>> strCache, Pair<String, ? extends Collection<Path>> key, Path prog, Environment environment) throws IOException {
    if (strCache == null)
      return prog;
    

    log.beginTask("Caching", "Cache assimilator");
    try {
      Path cacheProg = environment.new RelativePathCache(prog.getFile().getName());
      FileCommands.moveFile(prog, cacheProg);
      
      if (!Environment.rocache) {
        List<DependentCacheValue<Path>> list = strCache.get(key.a);
        if (list == null) {
          list = new LinkedList<DependentCacheValue<Path>>();
          strCache.put(key.a, list);
        }
        list.add(new DependentCacheValue<Path>(key.b, cacheProg));
      }

      if (CommandExecution.CACHE_INFO)
        log.log("Cache Location: " + cacheProg);
      
      return cacheProg;
    } finally {
      log.endTask();
    }
  }
  
  private static Path lookupAssimilationInCache(Map<String, List<DependentCacheValue<Path>>> strCache, Pair<String, ? extends Collection<Path>> key) throws IOException {
    if (strCache == null)
      return null;
    
    Path result = null;
    
    log.beginTask("Searching", "Search assimilator in cache");
    try {
      List<DependentCacheValue<Path>> list = null;
      
      if (!Environment.wocache)
        list = strCache.get(key.a);
      
      if (list != null)
        result = DependentCacheValue.lookupPathInList(list);
      
      if (CommandExecution.CACHE_INFO && result != null)
        log.log("Cache location: '" + result + "'");
      
      return result;
    } finally {
      log.endTask(result != null);
    }
  }


  private static Pair<String, ? extends Collection<Path>> getModuleKeyForAssimilation(Path str, String main, Collection<Path> dependentFiles, JSGLRI strParser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    log.beginTask("Generating", "Generate module key for current assimilation");
    try {
      IStrategoTerm aterm = strParser.parse(new BufferedInputStream(new FileInputStream(str.getFile())), str.getAbsolutePath());

      aterm = ATermCommands.getApplicationSubterm(aterm, "Module", 1);

      LinkedList<Path> depList = new LinkedList<Path>();
      for (Path file : dependentFiles)
        if (STR_FILE_PATTERN.matcher(file.getAbsolutePath()).matches() && FileCommands.exists(file))
          depList.add(file);
      
      return Pair.create(ATermCommands.atermToString(aterm), depList);
    } catch (Exception e) {
      throw new SGLRException(strParser.getParser(), "could not parse STR file " + str, e);
    } finally {
      log.endTask();
    }
    
  }

  public static IStrategoTerm assimilate(Path jarfile, IStrategoTerm in, HybridInterpreter interp) throws IOException {
    return assimilate("internal-main", jarfile, in, interp);
  }
  
  public static IStrategoTerm assimilate(String strategy, Path jarfile, IStrategoTerm in, HybridInterpreter interp) throws IOException {
    try {
      HybridInterpreter newInterp = new HybridInterpreter(interp);
      newInterp.loadJars(jarfile.getFile().toURI().toURL());
      newInterp.setCurrent(in);
      
      if (newInterp.invoke(strategy)) {
        IStrategoTerm term = newInterp.current();
        
        // XXX does this improve memory consumption?
        newInterp.reset();
        
        IToken left = ImploderAttachment.getLeftToken(in);
        IToken right = ImploderAttachment.getRightToken(in);
        String sort = ImploderAttachment.getSort(in);
        
        try {
          term = ATermCommands.makeMutable(term);
          if (left != null && right != null && sort != null)
            ImploderAttachment.putImploderAttachment(term, false, sort, left, right);
        } catch (Exception e) {
          log.log("origin annotation failed");
        }
        return term;
      }
    }
    catch (Exception e) {
      throw new StrategoException("desugaring failed", e);
    }
    throw new StrategoException("desugaring failed");
  }
}
