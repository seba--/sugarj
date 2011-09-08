package org.sugarj.editor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.KeywordRecognizer;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.Token;
import org.spoofax.jsglr.client.imploder.Tokenizer;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.CommandExecution;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.FileCommands;
import org.sugarj.driver.Log;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Result;
import org.sugarj.driver.path.RelativeSourceLocationPath;

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
    
    result = getResult(filename);
    if (result == null)
      result = parseFailureResult();

    if (result.isUpToDateShallow(input.hashCode(), environment))
      return result.getSugaredSyntaxTree();
    else if (!isPending(filename)) 
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

    
    Job parseJob = new Job("SugarJ parser: " + sourceFile.getRelativePath()) {
      @Override
      protected IStatus run(IProgressMonitor monitor) {
        monitor.beginTask("parse " + sourceFile.getRelativePath(), IProgressMonitor.UNKNOWN);
        Result result = null;
        try {
          result = runParser(input, sourceFile, monitor);
        } catch (InterruptedException e) {
          result = null;
        } catch (Exception e) {
          org.strategoxt.imp.runtime.Environment.logException(e);
        } finally {
          monitor.done();
          if (result != null) {
            SugarJParser.putResult(filename, result);
            getController().scheduleParserUpdate(0, false);
          }
          SugarJParser.setPending(filename, false);
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
      return Driver.parse(input, sourceFile, monitor);
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
    return result == null ? empty : result.getCollectedErrors();
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
  
  private Result parseFailureResult() {
    Tokenizer tokenizer = new Tokenizer(" ", " ", new KeywordRecognizer(null) {});
    Token tok = tokenizer.makeToken(0, IToken.TK_UNKNOWN, true);
    IStrategoTerm term = ATermCommands.makeList("SugarCompilationUnit", tok);
    
    Result r = new Result(true) {
      public boolean isUpToDateShallow(int h, Environment env) { return false; }
      public boolean isUpToDate(int h, Environment env) { return false; }
    };
    r.setSugaredSyntaxTree(term);
    return r;
  }
}
