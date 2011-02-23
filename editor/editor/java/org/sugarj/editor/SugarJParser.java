package org.sugarj.editor;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
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
  private Driver driver;

  public SugarJParser(JSGLRI parser) {
    super(parser.getParseTable(), parser.getStartSymbol(), parser.getController());
  }
  
  
  @Override
  protected IStrategoTerm doParse(String input, String filename)
      throws TokenExpectedException, BadTokenException, SGLRException, IOException {
    
    Environment.wocache = false;
    if (Environment.cacheDir == null)
      Environment.cacheDir = System.getProperty("user.home") + "/.sugarj/cache";
    
    Driver.initialize();
    driver = new Driver();
    
    Environment.includePath.add("/Users/seba/Library/Eclipse/plugins/org.spoofax.jsglr_0.3.0.201102091215.jar");
    Environment.includePath.add("/Users/seba/Library/Eclipse/plugins/org.strategoxt.strj_0.17.92.201102091215/java/strategoxt.jar");
    Environment.includePath.add("/Users/seba/Library/Eclipse/plugins/org.spoofax.interpreter.core_0.4.0.201102091215.jar");
    Environment.includePath.add("/Users/seba/Library/Eclipse/plugins/org.spoofax.interpreter.library.jsglr_0.3.9.201102091215.jar");
    Environment.includePath.add("/Users/seba/Library/Eclipse/plugins/org.spoofax.terms_1.0.0.201102091215.jar");

    assert projectPath != null;
    Environment.srcPath.add(projectPath);
    Environment.bin = projectPath;
    
    Environment.atomicImportParsing = true;

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
      driver.process(uri);
    } catch (Throwable e) {
      org.strategoxt.imp.runtime.Environment.logException(e);
      return super.doParse(input, filename);
    }
    
    try {
      Driver.storeCaches();
    }
    catch (Exception e) {
      // XXX ignore errors in cache storing
      e.printStackTrace();
    }
    
    IStrategoTerm term = driver.getSugaredSyntaxTree();
    
    return term;
  }


  public void setProjectPath(String projectPath) {
    this.projectPath = projectPath;
  }
  
  @Override
  public Set<BadTokenException> getCollectedErrors() {
    return driver.getCollectedErrors();
  }


  public List<IStrategoTerm> getEditorServices() {
    return driver.getEditorServices();
  }
  
}
