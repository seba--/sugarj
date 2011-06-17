package org.sugarj.editor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.ITreeBuilder;
import org.spoofax.jsglr.client.KeywordRecognizer;
import org.spoofax.jsglr.client.ParseTable;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.TermTreeFactory;
import org.spoofax.jsglr.client.imploder.Token;
import org.spoofax.jsglr.client.imploder.Tokenizer;
import org.spoofax.jsglr.client.imploder.TreeBuilder;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.strategoxt.eclipse.ant.StrategoJarAntPropertyProvider;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.CommandExecution;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.FileCommands;
import org.sugarj.driver.Log;
import org.sugarj.driver.Result;
import org.sugarj.driver.path.AbsolutePath;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class SugarJParser extends JSGLRI {

  private String projectPath;
  private String outputPath;
  private List<String> includePath;
  private List<String> sourcePath;
  
  private static Map<String, Result> results = new HashMap<String, Result>();
  private Result result;
  private JSGLRI parser;
  private Path parserTable;
  
  public SugarJParser(JSGLRI parser) {
    super(parser.getParseTable(), parser.getStartSymbol(), parser.getController());
  }
  
  
  @Override
  protected IStrategoTerm doParse(String input, String filename)
      throws TokenExpectedException, BadTokenException, SGLRException, IOException {
    
    Environment environment = new Environment();
    
    Environment.wocache = false;

    assert includePath != null;
    environment.getIncludePath().addAll(includePath);
    environment.getIncludePath().add(new StrategoJarAntPropertyProvider().getAntPropertyValue(""));
    
    assert sourcePath != null;
    environment.getSourcePath().addAll(sourcePath);
    
    assert projectPath != null;
    environment.setRoot(projectPath);
    environment.setBin(outputPath != null ? outputPath : projectPath);

    if (environment.getCacheDir() == null)
      environment.setCacheDir(projectPath + "/.sugarjcache");
    
    environment.setAtomicImportParsing(true);
    environment.setGenerateJavaFile(true);

    // use this to temporarily deactivate caching
    // Environment.wocache = true;
    
    environment.setNoChecking(true);

    result = getResult(filename);
    if (result == null) {
      result = parseFailureResult();
      putResult(filename, result);
    }

    if (result != null && result.isUpToDate(input.hashCode(), environment))
      return result.getSugaredSyntaxTree();
    else if (result == null || !(result instanceof PendingResult)) 
      scheduleParse(input, filename, environment);
        
    Path lastParseTable;
    
    if (result instanceof PendingResult)
      lastParseTable = ((PendingResult) result).getResult().getLastParseTable();
    else
      lastParseTable = result.getLastParseTable();
  
    if (lastParseTable != null && lastParseTable.equals(parserTable))
      return parser.parse(input, filename);
    
    if (lastParseTable != null) {
      try {
        ParseTable parseTable = org.strategoxt.imp.runtime.Environment.loadParseTable(lastParseTable.getAbsolutePath());
        ITreeBuilder builder = new TreeBuilder(new TermTreeFactory(ATermCommands.factory));
        
        parser = new JSGLRI(parseTable, "SugarCompilationUnit");
        parserTable = lastParseTable;
        parser.getParser().setTreeBuilder(builder);
        return parser.parse(input, filename);
      } catch (Exception e) {
      }
    }
    
    if (result instanceof PendingResult)
      return ((PendingResult) result).getResult().getSugaredSyntaxTree();
    
    return result.getSugaredSyntaxTree();
  }
  
  private synchronized void scheduleParse(final String input, final String filename, final Environment environment) {
    final Result oldResult = getResult(filename);
    putResult(filename, new PendingResult(oldResult));
    
    Job parseJob = new Job("SugarJ parser: " + projectRelativePath(filename).getRelativePath()) {
      @Override
      protected IStatus run(IProgressMonitor monitor) {
        monitor.beginTask("parse " + projectRelativePath(filename).getRelativePath(), IProgressMonitor.UNKNOWN);
        Result result = null;
        try {
          result = runParser(input, filename, monitor, environment);
          putResult(filename, result);
        } catch (InterruptedException e) {
          result = null;
        } catch (Exception e) {
          org.strategoxt.imp.runtime.Environment.logException(e);
        } finally {
          monitor.done();
          if (result != null)
            getController().scheduleParserUpdate(0, false);
          else
            putResult(filename, oldResult);
        }
        return Status.OK_STATUS;
      }
    };
    parseJob.schedule();
  }
  
  private Result runParser(String input, String filename, IProgressMonitor monitor, Environment environment) throws InterruptedException {
    CommandExecution.SILENT_EXECUTION = false;
    CommandExecution.SUB_SILENT_EXECUTION = false;
    CommandExecution.FULL_COMMAND_LINE = true;
    
    Log.out = SugarJConsole.getOutputPrintStream();
    Log.err = SugarJConsole.getErrorPrintStream();
    SugarJConsole.activateConsoleOnce();
    
    try {
      return Driver.compile(input, projectRelativePath(filename), monitor, environment);
    } catch (InterruptedException e) {
      throw e;
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException("parsing " + FileCommands.fileName(new AbsolutePath(filename)) + " failed", e);
    }
  }
  

  public void setProjectPath(String projectPath) {
    this.projectPath = projectPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }
  
  public void setIncludePath(List<String> includePath) {
    this.includePath = includePath;
  }

  public void setSourcePath(List<String> sourcePath) {
    this.sourcePath = sourcePath;
  }

  @Override
  public Set<BadTokenException> getCollectedErrors() {
    final Set<BadTokenException> empty = Collections.emptySet();
    return result == null ? empty : result.getCollectedErrors();
  }


  public List<IStrategoTerm> getEditorServices() {
    final List<IStrategoTerm> empty = Collections.emptyList();
    return result == null ? empty : new ArrayList<IStrategoTerm>(result.getEditorServices());
  }

  private static synchronized Result getResult(String file) {
    return results.get(file);
  }
  
  private static synchronized void putResult(String file, Result result) {
    results.put(file, result);
  }
  
  private RelativePath projectRelativePath(String filename) {
    RelativePath path = null;
    for (String s : sourcePath) {
      if (filename.startsWith(s)) {
        int sepOffset = s.endsWith(Environment.sep) ? 0 : 1;
        RelativePath newPath = new RelativePath(new AbsolutePath(s), filename.substring(s.length() + sepOffset));
        if (path == null || newPath.getBasePath().getAbsolutePath().length() < path.getBasePath().getAbsolutePath().length())
          path = newPath;
      }
    }
    
    if (path != null)
      return path;
    
    throw new IllegalStateException("Ressource " + filename + " not inside any source folder.");
  }
  
  private Result parseFailureResult() {
    Tokenizer tokenizer = new Tokenizer(" ", " ", new KeywordRecognizer(null) {});
    Token tok = tokenizer.makeToken(0, IToken.TK_UNKNOWN, true);
    IStrategoTerm term = ATermCommands.makeList("SugarCompilationUnit", tok);
    
    Result r = new Result() {
      public boolean isUpToDate(int h, Environment env) { return false; }
    };
    r.setSugaredSyntaxTree(term);
    return r;
  }
}
