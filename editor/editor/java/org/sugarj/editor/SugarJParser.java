package org.sugarj.editor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

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
import org.sugarj.driver.Result;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class SugarJParser extends JSGLRI {

  private String projectPath;
  private String outputPath;
  private Result result;
  private List<String> includePath;

  public SugarJParser(JSGLRI parser) {
    super(parser.getParseTable(), parser.getStartSymbol(), parser.getController());
  }
  
  
  @Override
  protected IStrategoTerm doParse(String input, String filename)
      throws TokenExpectedException, BadTokenException, SGLRException, IOException {
    
    Environment.wocache = false;
    if (Environment.cacheDir == null)
      Environment.cacheDir = System.getProperty("user.home") + "/.sugarj/cache";
    
    Environment.includePath.addAll(includePath);
    Environment.includePath.add(new StrategoJarAntPropertyProvider().getAntPropertyValue(""));
    
    assert projectPath != null;
    Environment.src = projectPath;
    Environment.bin = outputPath != null ? outputPath : projectPath;

    
    Environment.atomicImportParsing = true;
    Environment.generateJavaFile = true;

    // use this to temporarily deactivate caching
    // Environment.wocache = true;
    
    Environment.noChecking = true;
    
    CommandExecution.SILENT_EXECUTION = false;
    CommandExecution.SUB_SILENT_EXECUTION = false;
    CommandExecution.FULL_COMMAND_LINE = true;
    
    try {
      result = Driver.compile(input, FileCommands.fileName(filename), filename);
    } catch (Throwable e) {
      throw new RuntimeException("parsing " + FileCommands.fileName(filename) + " failed", e);
    }
    
    return result.getSugaredSyntaxTree();
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
    return result.getCollectedErrors();
  }


  public List<IStrategoTerm> getEditorServices() {
    final List<IStrategoTerm> empty = Collections.emptyList();
    return result == null ? empty : new ArrayList<IStrategoTerm>(result.getEditorServices());
  }
  
}
