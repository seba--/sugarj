package org.sugarj.driver;

import static org.sugarj.driver.ATermCommands.isApplication;
import static org.sugarj.driver.Environment.includePath;
import static org.sugarj.driver.Log.log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.driver.path.AbsolutePath;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.driver.path.RelativePathBin;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class ModuleSystemCommands {
  
  /**
   * 
   * @param modulePath
   * @param importTerm
   * @param javaOutFile
   * @param interp
   * @param driverResult
   * @return true iff a class file existed.
   * @throws IOException
   */
  public static boolean importClass(String modulePath, IStrategoTerm importTerm, Path javaOutFile, HybridInterpreter interp, Result driverResult) throws IOException {
    RelativePath classUri = searchFile(modulePath, ".class");
    if (classUri == null)
      return false;
    
    log.beginTask("Generate Java code");
    try {
      driverResult.appendToFile(javaOutFile, SDFCommands.prettyPrintJava(importTerm, interp) + "\n");
    } finally {
      log.endTask();
    }
    
    return true;
  }
  
  /**
   * 
   * @param modulePath
   * @param currentGrammarModule
   * @param availableSDFImports
   * @param driverResult
   * @return path to new grammar or null if no sdf file existed.
   * @throws IOException 
   */
  public static RelativePath importSdf(String modulePath) throws IOException {
    RelativePath sdf = searchFile(modulePath, ".sdf");
    
    if (sdf == null)
      return null;
    
    log.log("Found syntax definition for " + modulePath);
    return sdf;
  }
  
  /**
   * 
   * @param modulePath
   * @param currentTransModule
   * @param availableSTRImports
   * @param driverResult
   * @return path to new Stratego module or null of no str file existed
   * @throws IOException 
   */
  public static RelativePath importStratego(String modulePath) throws IOException {
    RelativePath str = searchFile(modulePath, ".str");
    
    if (str == null)
      return null;

    log.log("Found desugaring for " + modulePath);
    return str;
  }
  
  /**
   * 
   * @param modulePath
   * @param driverResult
   * @return true iff a serv file existed.
   * @throws IOException
   */
  public static boolean importEditorServices(String modulePath, Result driverResult) throws IOException {
    RelativePath serv = searchFile(modulePath, ".serv");
    
    if (serv == null)
      return false;
    
    log.beginTask("Incorporation", "Incorporate the imported editor services " + modulePath);
    try {
      BufferedReader reader = new BufferedReader(new FileReader(serv.getFile()));
      String line;
      
      while ((line = reader.readLine()) != null)
        driverResult.addEditorService(ATermCommands.atermFromString(line));
      
      return true;
    } finally {
      log.endTask();
    }
  }
  
  public static RelativePath locateSourceFile(String modulePath) {
    if (modulePath.startsWith("org/sugarj"))
      return null;
    
    RelativePath result = searchFile(modulePath, ".sugj", Environment.sourcePath);
    
    if (result == null)
      result = searchFile(modulePath, ".java", Environment.sourcePath);
    
    return result;
  }
  
  
  
  public static String extractImportedModuleName(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException {
    String name = null;
    log.beginTask("Extracting", "Extract name of imported module");
    try {
      if (isApplication(toplevelDecl, "TypeImportDec"))
        name = SDFCommands.prettyPrintJava(toplevelDecl.getSubterm(0), interp);
      
      if (isApplication(toplevelDecl, "TypeImportOnDemandDec"))
        name = SDFCommands.prettyPrintJava(toplevelDecl.getSubterm(0), interp) + ".*";
    } finally {
      log.endTask(name);
    }
    return name;
  }

  
  /**
   * 
   * @param relativePath
   * @param fileExtension including leading "."
   * @return URI or null.
   */
  public static RelativePath searchFile(String relativePath, String fileExtension) {
    RelativePath p = searchBinFile(relativePath, fileExtension);
    if (p != null)
      return p;
    
    return searchFile(relativePath, fileExtension, includePath);
  }

  private static RelativePath searchBinFile(String relativePath, String extension) {
    RelativePath result = new RelativePathBin(relativePath + extension);
    if (result.getFile().exists())
      return result;
    
    return null;
  }
  
  private static RelativePath searchFile(String relativePath, String extension, Set<String> searchPath) {
    for (String base : searchPath) {
      RelativePath p = new RelativePath(new AbsolutePath(base), relativePath + extension);
      if (p.getFile().exists())
        return p;
    }
    
    return null;
  }
}
