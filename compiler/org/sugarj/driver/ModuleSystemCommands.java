package org.sugarj.driver;

import static org.sugarj.common.Log.log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.LanguageLib;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;

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
    public static boolean importBinFile(String modulePath, IStrategoTerm toplevelDecl, Environment environment, LanguageLib langLib) throws IOException {
      RelativePath clazz = searchFile(modulePath, langLib.getGeneratedFileExtension(), environment);
      if (clazz == null && !langLib.isModuleResolvable(modulePath))
        return false;
      
      langLib.addImportModule(toplevelDecl, true);
      return true;
    }
    
    public static void registerSearchedClassFiles(String modulePath, Result driverResult, Environment environment, LanguageLib langLib) throws IOException {
      registerSearchedFiles(modulePath, langLib.getGeneratedFileExtension(), driverResult, environment);
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
  public static RelativePath importSdf(String modulePath, Environment environment) throws IOException {
    RelativePath sdf = searchFile(modulePath, "sdf", environment);
    
    if (sdf == null)
      return null;
    
    log.log("Found syntax definition for " + modulePath, Log.IMPORT);
    return sdf;
  }
  
  public static void registerSearchedSdfFiles(String modulePath, Result driverResult, Environment environment) throws IOException {
    registerSearchedFiles(modulePath, "sdf", driverResult, environment);
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
  public static RelativePath importStratego(String modulePath, Environment environment) throws IOException {
    RelativePath str = searchFile(modulePath, "str", environment);
    
    if (str == null)
      return null;

    log.log("Found desugaring for " + modulePath, Log.IMPORT);
    return str;
  }
  
  public static void registerSearchedStrategoFiles(String modulePath, Result driverResult, Environment environment) throws IOException {
    registerSearchedFiles(modulePath, "str", driverResult, environment);
  }

  
  /**
   * 
   * @param modulePath
   * @param driverResult
   * @return true iff a serv file existed.
   * @throws IOException
   */
  public static boolean importEditorServices(String modulePath, Result driverResult, Environment environment) throws IOException {
    RelativePath serv = searchFile(modulePath, "serv", environment);
    
    if (serv == null)
      return false;
    
    BufferedReader reader = null;
    
    log.beginTask("Incorporation", "Incorporate the imported editor services " + modulePath, Log.IMPORT);
    try {
      reader = new BufferedReader(new FileReader(serv.getFile()));
      String line;
      
      while ((line = reader.readLine()) != null)
        driverResult.addEditorService(ATermCommands.atermFromString(line));
      
      return true;
    } finally {
      if (reader != null)
        reader.close();
      
      log.endTask();
    }
  }
  
  public static void registerSearchedEditorServicesFiles(String modulePath, Result driverResult, Environment environment) throws IOException {
    registerSearchedFiles(modulePath, "serv", driverResult, environment);
  }


  public static RelativePath locateSourceFile(String path, Set<Path> sourcePath) {
    if (path.startsWith("org/sugarj"))
      return null;
    
    RelativePath result = searchFileInSourceLocationPath(FileCommands.dropExtension(path), FileCommands.getExtension(path), sourcePath);
        
    return result;
  }

  public static RelativePath locateSourceFile(String modulePath, String extension, Set<Path> sourcePath) {
    if (modulePath.startsWith("org/sugarj"))
      return null;
    
    RelativePath result = searchFileInSourceLocationPath(modulePath, extension, sourcePath);
        
    return result;
  }
  
  public static RelativePath locateSourceFile(String modulePath, Set<Path> sourcePath, LanguageLib langLib) {
    if (modulePath.startsWith("org/sugarj"))
      return null;
    
    RelativePath result = searchFileInSourceLocationPath(modulePath, langLib.getSugarFileExtension(), sourcePath);
    if (result == null && langLib.getOriginalFileExtension() != null)
      result = searchFileInSourceLocationPath(modulePath, langLib.getOriginalFileExtension(), sourcePath);
        
    return result;
  }
  
  
  /**
   * 
   * @param relativePath
   * @param fileExtension including leading "."
   * @return URI or null.
   */
  public static RelativePath searchFile(String relativePath, String fileExtension, Environment environment) {
    RelativePath p = searchBinFile(relativePath, fileExtension, environment);
    if (p != null)
      return p;
    
    return searchFileInSearchPath(relativePath, fileExtension, environment.getIncludePath());
  }

  private static RelativePath searchBinFile(String relativePath, String extension, Environment environment) {
    RelativePath result = environment.createBinPath(relativePath + "." + extension);
    if (result.getFile().exists())
      return result;
    
    return null;
  }
  
  private static RelativePath searchFileInSearchPath(String relativePath, String extension, Set<Path> searchPath) {
    for (Path base : searchPath) {
      RelativePath p = searchFile(base, relativePath, extension);
      if (p != null)
        return p;
    }
    
    return null;
  }

  private static RelativePath searchFileInSourceLocationPath(String relativePath, String extension, Set<Path> searchPath) {
    for (Path loc : searchPath) {
      RelativePath p = searchFile(loc, relativePath, extension);
      if (p != null)
        return p;
    }
    
    return null;
  }

  @SuppressWarnings("resource")
  private static RelativePath searchFile(Path base, String relativePath, String extension) {
    if (relativePath.startsWith(base.getAbsolutePath())) {
      int sepOffset = relativePath.endsWith(Environment.sep) ? 0 : 1;
      relativePath = relativePath.substring(base.getAbsolutePath().length() + sepOffset);
    }
    
    RelativePath p = new RelativePath(base, relativePath + "." + extension);
    if (p.getFile().exists())
      return p;
    
    URLClassLoader cl = null;
    try {
      cl = new URLClassLoader(new URL[] {base.getFile().toURI().toURL()}, null);
      if (cl.getResource(relativePath + "." + extension) != null)
        return new RelativePath(base, relativePath + "." + extension);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } finally {
      /* URLClassLoader.close() is only available in Java 1.7.
      if (cl != null)
        try {
          cl.close();
        } catch (IOException e) {
        }
      */
    }
    
    return null;
  }
  
  
  /**
   * Registers searched files in the driverResult. Existing as well as non-existent files are registers,
   * so that the emergence of a file triggers recompilation.
   * 
   * @param relativePath
   * @param extension
   * @param driverResult
   * @param environment
   * @throws IOException
   */
  public static void registerSearchedFiles(String relativePath, String extension, Result driverResult, Environment environment) throws IOException {
    RelativePath binFile = environment.createBinPath(relativePath + "." + extension);
    driverResult.addFileDependency(binFile);
    
    for (Path searchPath : environment.getIncludePath()) {
      String relPath = relativePath;
      if (relPath.startsWith(searchPath.getAbsolutePath())) {
        int sepOffset = relativePath.endsWith(Environment.sep) ? 0 : 1;
        relPath = relPath.substring(searchPath.getAbsolutePath().length() + sepOffset);
      }
      
      RelativePath p = new RelativePath(searchPath, relPath + "." + extension);
      driverResult.addFileDependency(p);
    }
  }
}
