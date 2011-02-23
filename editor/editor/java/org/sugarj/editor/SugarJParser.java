package org.sugarj.editor;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.spoofax.interpreter.core.Interpreter;
import org.spoofax.interpreter.library.jsglr.JSGLRLibrary;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.SGLR;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.spoofax.terms.Term;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.strj.strj;
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
    
    Environment.includePath.add(getJarPath(SGLR.class));
    Environment.includePath.add(getJarPath(strj.class));
    Environment.includePath.add(getJarPath(Interpreter.class));
    Environment.includePath.add(getJarPath(JSGLRLibrary.class));
    Environment.includePath.add(getJarPath(Term.class));

    assert projectPath != null;
    Environment.srcPath.add(projectPath);
    Environment.bin = projectPath;
    Environment.src = projectPath;
    
    Environment.atomicImportParsing = true;
    Environment.generateJavaFile = true;

    // use this to temporarily deactivate caching
    // Environment.wocache = true;
    
//    String result = org.strategoxt.stratego_lib.Main.class.getProtectionDomain().getCodeSource().getLocation().getFile();
//            if (Platform.getOS().equals(Platform.OS_WIN32)) {
//                // FIXME: proper paths on Windows
//                result = result.substring(1);
//            }
    
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
  
  private String getJarPath(Class<?> aClass) {
    String result = aClass.getProtectionDomain().getCodeSource().getLocation().getFile();
    if (Platform.getOS().equals(Platform.OS_WIN32)) {
        // FIXME: proper paths on Windows
        result = result.substring(1);
    }
    return result;
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
