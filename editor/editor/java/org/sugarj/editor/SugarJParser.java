package org.sugarj.editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.KeywordRecognizer;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.Token;
import org.spoofax.jsglr.client.imploder.Tokenizer;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.spoofax.terms.attachments.ParentAttachment;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.imp.runtime.services.ContentProposer;
import org.strategoxt.lang.Context;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.CommandExecution;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.FileCommands;
import org.sugarj.driver.Log;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Result;
import org.sugarj.driver.RetractableTreeBuilder;
import org.sugarj.driver.STRCommands;
import org.sugarj.driver.caching.DependentCacheValue;
import org.sugarj.driver.path.AbsolutePath;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativeSourceLocationPath;
import org.sugarj.stdlib.StdLib;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class SugarJParser extends JSGLRI {

  private Environment environment;
  
  private static Map<String, Result> results = new HashMap<String, Result>();
  private static Set<String> pending = new HashSet<String>();
  
  private Result result;
//  private JSGLRI parser;
//  private Path parserTable;
  
  public SugarJParser(JSGLRI parser) {
    super(parser.getParseTable(), parser.getStartSymbol(), parser.getController());
  }
  
  
  @Override
  protected IStrategoTerm doParse(String input, String filename)
      throws TokenExpectedException, BadTokenException, SGLRException, IOException {
    
    assert environment != null;
    

    this.result = null;
    Result result = getResult(filename);

    if (result == null)
      result = parseFailureResult();

    if (input.contains(ContentProposer.COMPLETION_TOKEN) && result != null && result.getParseTable() != null) {
      this.result = result;
      return parseCompletionTree(input, filename, result);
    }

    if (result.isUpToDateShallow(input.hashCode(), environment)) {
      this.result = result;
      return result.getSugaredSyntaxTree();
    }
    
    if (!isPending(filename)) 
      scheduleParse(input, filename);
        
//    Path lastParseTable;
//    
//    if (result instanceof PendingResult)
//      lastParseTable = ((PendingResult) result).getResult().getLastParseTable();
//    else
//      lastParseTable = result.getLastParseTable();
//  
//    if (lastParseTable != null && lastParseTable.equals(parserTable))
//      return parser.parse(input, filename);
//    
//    if (lastParseTable != null) {
//      try {
//        ParseTable parseTable = org.strategoxt.imp.runtime.Environment.loadParseTable(lastParseTable.getAbsolutePath());
//        ITreeBuilder builder = new TreeBuilder(new TermTreeFactory(ATermCommands.factory));
//        
//        parser = new JSGLRI(parseTable, "SugarCompilationUnit");
//        parserTable = lastParseTable;
//        parser.getParser().setTreeBuilder(builder);
//        return parser.parse(input, filename);
//      } catch (Exception e) {
//      }
//    }
    
    return result.getSugaredSyntaxTree();
  }
  
  private synchronized void scheduleParse(final String input, final String filename) {
    SugarJParser.setPending(filename, true);

    final RelativeSourceLocationPath sourceFile = ModuleSystemCommands.locateSourceFile(FileCommands.dropExtension(filename), environment.getSourcePath());

    
    Job parseJob = new Job("SugarJ parser: " + sourceFile == null ? null : sourceFile.getRelativePath()) {
      @Override
      protected IStatus run(IProgressMonitor monitor) {
        monitor.beginTask("parse " + sourceFile == null ? null : sourceFile.getRelativePath(), IProgressMonitor.UNKNOWN);
        Result result = null;
        boolean ok = false;
        try {
          sourceFile.getSourceLocation().getEnvironment().getRenamings().clear();
          result = runParser(input, sourceFile, monitor);
          ok = true;
        } catch (InterruptedException e) {
          result = null;
        } catch (Exception e) {
          org.strategoxt.imp.runtime.Environment.logException(e);
        } finally {
          monitor.done();
          SugarJParser.this.result = result;
          SugarJParser.putResult(filename, result);
          SugarJParser.setPending(filename, false);
          if (ok)
            getController().scheduleParserUpdate(0, false);
        }
        return Status.OK_STATUS;
      }
    };
    parseJob.schedule();
  }
  
  private Result runParser(String input, RelativeSourceLocationPath sourceFile, IProgressMonitor monitor) throws InterruptedException {
    CommandExecution.SILENT_EXECUTION = false;
    CommandExecution.SUB_SILENT_EXECUTION = false;
    CommandExecution.FULL_COMMAND_LINE = true;
    
    Log.out = SugarJConsole.getOutputPrintStream();
    Log.err = SugarJConsole.getErrorPrintStream();
    SugarJConsole.activateConsoleOnce();
    
    try {
      return Driver.parse(input, sourceFile, monitor, new LinkedHashMap<Path, Driver>());
    } catch (InterruptedException e) {
      throw e;
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException("parsing " + FileCommands.fileName(sourceFile) + " failed", e);
    }
  }
  
  
  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }
  
  @Override
  public Set<BadTokenException> getCollectedErrors() {
    final Set<BadTokenException> empty = Collections.emptySet();
    return result == null ? empty : result.getParseErrors();
  }


  public List<IStrategoTerm> getEditorServices() {
    final List<IStrategoTerm> empty = Collections.emptyList();
    return result == null ? empty : new ArrayList<IStrategoTerm>(result.getEditorServices());
  }

  private static Result getResult(String file) {
    synchronized (results) {
      return results.get(file);
    }
  }
  
  public static void putResult(String file, Result result) {
    synchronized (results) {
      results.put(file, result);
    }
  }
  
  private static boolean isPending(String file) {
    synchronized (pending) {
      return pending.contains(file);      
    }
  }
  
  private static void setPending(String file, boolean isPending) {
    synchronized (pending) {
      if (isPending)
        pending.add(file);
      else
        pending.remove(file);
    }
  }
  
  private Result parseFailureResult() throws TokenExpectedException, BadTokenException, FileNotFoundException, IOException, SGLRException {
    Tokenizer tokenizer = new Tokenizer(" ", " ", new KeywordRecognizer(null) {});
    Token tok = tokenizer.makeToken(0, IToken.TK_UNKNOWN, true);
    IStrategoTerm term = ATermCommands.makeList("SugarCompilationUnit", tok);
    
    Result r = Result.OUTDATED_RESULT;
    r.setSugaredSyntaxTree(term);
    r.setDesugaring(getInitialTrans());
    return r;
  }
  
  private IStrategoTerm parseCompletionTree(String input, String filename, Result result) throws IOException, TokenExpectedException, BadTokenException, SGLRException {
    JSGLRI jsglri = null;
    try {
      jsglri = new JSGLRI(org.strategoxt.imp.runtime.Environment.loadParseTable(result.getParseTable().getAbsolutePath()), "NextToplevelDeclaration");
    } catch (InvalidParseTableException e) {
      e.printStackTrace();
    }
    
    if (jsglri == null)
      return null;
    
    jsglri.setUseRecovery(true);
    jsglri.getParser().setUseStructureRecovery(true);
    RetractableTreeBuilder treeBuilder = new RetractableTreeBuilder();
    jsglri.getParser().setTreeBuilder(treeBuilder);
    
    
    String remainingInput = input;
    List<IStrategoTerm> list = new LinkedList<IStrategoTerm>();
    
    while (true) {
      if (remainingInput.isEmpty())
        return null;

      IStrategoTerm term = jsglri.parse(remainingInput, filename);
      if (!ATermCommands.isApplication(term, "NextToplevelDeclaration"))
        return null;
      
      IStrategoTerm nextDecl = ATermCommands.getApplicationSubterm(term, "NextToplevelDeclaration", 0);
      list.add(nextDecl);
      if (nextDecl.toString().contains(ContentProposer.COMPLETION_TOKEN)) {
        IStrategoList termList = ATermCommands.makeList("NextToplevelDeclaration", list);
        
        IStrategoList listIt = termList;
        while (!listIt.isEmpty()) {
          ParentAttachment.putParent(listIt.head(), termList, listIt);
          listIt = listIt.tail();
        }
        
        return termList;
      }
        
      IStrategoTerm remainingInputTerm = ATermCommands.getApplicationSubterm(term, "NextToplevelDeclaration", 1);
      treeBuilder.retract(remainingInputTerm);
      remainingInput = ((IStrategoString) remainingInputTerm).stringValue();
    }
  }
  
  
  private Path initialTrans = null;
  private Path getInitialTrans() throws TokenExpectedException, BadTokenException, FileNotFoundException, IOException, SGLRException {
    if (initialTrans != null && FileCommands.exists(initialTrans))
      return initialTrans;
    
    Path strCachePath = environment.new RelativePathCache("strCache");
    Map<String, List<DependentCacheValue<Path>>> strCache = null;
    try {
      strCache = (Map<String, List<DependentCacheValue<Path>>>) new ObjectInputStream(new FileInputStream(strCachePath.getFile())).readObject();
    }
    catch (Exception e) {
      strCache = new HashMap<String, List<DependentCacheValue<Path>>>();
      if (environment.getCacheDir().getFile() != null && environment.getCacheDir().getFile().exists()) 
        for (File f : environment.getCacheDir().getFile().listFiles())
          if (f.getPath().endsWith(".jar"))
            f.delete();
    }
    
    try {
      Context context = null;
      synchronized (SugarJParser.class) {
        context = org.strategoxt.strj.strj.init();
      }
      
      initialTrans = STRCommands.compile(
          new AbsolutePath(StdLib.initTrans.getPath()), 
          "main", 
          new LinkedList<Path>(),
          new JSGLRI(org.strategoxt.imp.runtime.Environment.loadParseTable(StdLib.strategoTbl.getPath()), "StrategoModule"),
          context,
          strCache, 
          environment);
    } catch (InvalidParseTableException e) {
      throw new RuntimeException(e);
    }
    return initialTrans;
  }
}
