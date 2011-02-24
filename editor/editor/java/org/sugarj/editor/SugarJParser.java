package org.sugarj.editor;

import java.io.File;
import java.io.IOException;
import java.net.URI;
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

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class SugarJParser extends JSGLRI {

  private String projectPath;
  private Driver.Result result;

  public SugarJParser(JSGLRI parser) {
    super(parser.getParseTable(), parser.getStartSymbol(), parser.getController());
  }
  
  
  @Override
  protected IStrategoTerm doParse(String input, String filename)
      throws TokenExpectedException, BadTokenException, SGLRException, IOException {
    
    Environment.wocache = false;
    if (Environment.cacheDir == null)
      Environment.cacheDir = System.getProperty("user.home") + "/.sugarj/cache";
    
    //Environment.includePath.add(getJarPath(SGLR.class));
    Environment.includePath.add(new StrategoJarAntPropertyProvider().getAntPropertyValue(""));
    //Environment.includePath.add(getJarPath(Interpreter.class));
    //Environment.includePath.add(getJarPath(JSGLRLibrary.class));
    //Environment.includePath.add(getJarPath(Term.class));

    assert projectPath != null;
    Environment.srcPath.add(projectPath);
    Environment.bin = projectPath;
    Environment.src = projectPath;
    
    Environment.atomicImportParsing = true;
    Environment.generateJavaFile = true;

    // use this to temporarily deactivate caching
    // Environment.wocache = true;
    
    Environment.noChecking = true;
    
    CommandExecution.SILENT_EXECUTION = false;
    CommandExecution.SUB_SILENT_EXECUTION = false;
    CommandExecution.FULL_COMMAND_LINE = true;
    
    // TODO compile files into the project folder

    String dir = FileCommands.newTempDir();
    URI uri = new File(dir + Environment.sep + FileCommands.fileName(filename)).toURI();
    FileCommands.writeToFile(dir + Environment.sep + FileCommands.fileName(filename), input);

    try {
      result = Driver.compile(uri);
    } catch (Throwable e) {
      org.strategoxt.imp.runtime.Environment.logException(e);
      return super.doParse(input, filename);
    }
    
    IStrategoTerm term = result.getSugaredSyntaxTree();
    
    return term;
  }


  public void setProjectPath(String projectPath) {
    this.projectPath = projectPath;
  }
  
  @Override
  public Set<BadTokenException> getCollectedErrors() {
    return result.getCollectedErrors();
  }


  public List<IStrategoTerm> getEditorServices() {
    final List<IStrategoTerm> empty = Collections.emptyList();
    return result == null ? empty : result.getEditorServices();
  }
  
}
