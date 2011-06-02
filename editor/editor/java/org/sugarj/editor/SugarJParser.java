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
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.strategoxt.eclipse.ant.StrategoJarAntPropertyProvider;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.sugarj.driver.CommandExecution;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.FileCommands;
import org.sugarj.driver.Log;
import org.sugarj.driver.Result;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class SugarJParser extends JSGLRI {

  private String projectPath;
  private String outputPath;
  private List<String> includePath;
  private boolean justReturn;
  
  private static Map<String, Result> results = new HashMap<String, Result>();
  private Result result;
  
  public SugarJParser(JSGLRI parser) {
    super(parser.getParseTable(), parser.getStartSymbol(), parser.getController());
  }
  
  
  @Override
  protected IStrategoTerm doParse(String input, String filename)
      throws TokenExpectedException, BadTokenException, SGLRException, IOException {
    
    result = getResult(filename);

    if (result instanceof PendingResult || (doJustReturn() && result.isUpToDate(filename)))
      setJustReturn(false);
    else 
      scheduleParse(input, filename);
        
    if (result == null)
      return null;
    
    if (result instanceof PendingResult)
      return ((PendingResult) result).getResult().getSugaredSyntaxTree();
    
    return result.getSugaredSyntaxTree();
  }
  
  private synchronized void scheduleParse(final String input, final String filename) {
    putResult(filename, new PendingResult(getResult(filename)));
    
    Job parseJob = new Job("SugarJ parser: " + projectRelativePath(filename)) {
      @Override
      protected IStatus run(IProgressMonitor monitor) {
        monitor.beginTask("parse " + projectRelativePath(filename), IProgressMonitor.UNKNOWN);
        try {
          Result result = runParser(input, filename, monitor);
          putResult(filename, result);
        } finally {
          monitor.done();
          setJustReturn(true);
          getController().scheduleParserUpdate(0, false);
        }
        return Status.OK_STATUS;
      }
    };
    
    parseJob.schedule();
  }
  
  private Result runParser(String input, String filename, IProgressMonitor monitor) {
    Environment.wocache = false;

    Environment.includePath.addAll(includePath);
    Environment.includePath.add(new StrategoJarAntPropertyProvider().getAntPropertyValue(""));
    
    assert projectPath != null;
    Environment.src = projectPath;
    Environment.bin = outputPath != null ? outputPath : projectPath;

    if (Environment.cacheDir == null)
      Environment.cacheDir = projectPath + "/.sugarjcache";
    
    Environment.atomicImportParsing = true;
    Environment.generateJavaFile = true;

    // use this to temporarily deactivate caching
    // Environment.wocache = true;
    
    Environment.noChecking = true;
    
    CommandExecution.SILENT_EXECUTION = false;
    CommandExecution.SUB_SILENT_EXECUTION = false;
    CommandExecution.FULL_COMMAND_LINE = true;
    
    Log.out = SugarJConsole.getOutputPrintStream();
    Log.err = SugarJConsole.getErrorPrintStream();
    SugarJConsole.activateConsoleOnce();
    
    try {
      return Driver.compile(input, FileCommands.fileName(filename), filename, monitor);
    } catch (Throwable e) {
      e.printStackTrace();
      throw new RuntimeException("parsing " + FileCommands.fileName(filename) + " failed", e);
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

  @Override
  public Set<BadTokenException> getCollectedErrors() {
    final Set<BadTokenException> empty = Collections.emptySet();
    return result == null ? empty : result.getCollectedErrors();
  }


  public List<IStrategoTerm> getEditorServices() {
    final List<IStrategoTerm> empty = Collections.emptyList();
    return result == null ? empty : new ArrayList<IStrategoTerm>(result.getEditorServices());
  }
  
  private synchronized boolean doJustReturn() {
    return justReturn;
  }
  
  private synchronized void setJustReturn(boolean justReturn) {
    this.justReturn = justReturn;
  }

  private static synchronized Result getResult(String file) {
    return results.get(file);
  }
  
  private static synchronized void putResult(String file, Result result) {
    results.put(file, result);
  }
  
  private String projectRelativePath(String filename) {
    if (filename.startsWith(projectPath))
      return filename.substring(projectPath.length() + 1);
    return filename;
  }
}
