package org.sugarj.driver;

import static org.sugarj.common.Log.log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

import org.sugarj.AbstractBaseProcessor;
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
    public static RelativePath importBinFile(String modulePath, Environment environment, AbstractBaseProcessor baseProcessor, Result driverResult) throws IOException {
      String ext = baseProcessor.getLanguage().getBinaryFileExtension();
      if (ext != null)
        // language is interpreted
        ext = baseProcessor.getLanguage().getBaseFileExtension();
      RelativePath clazz = searchFile(modulePath, ext, environment, driverResult);
      if (clazz == null)
        return null;
      
      log.log("Found language-specific declaration for " + modulePath, Log.IMPORT);
      return clazz;
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
  public static RelativePath importSdf(String modulePath, Environment environment, Result driverResult) {
    RelativePath sdf = searchFile(modulePath, "sdf", environment, driverResult);
    
    if (sdf == null)
      return null;
    
    log.log("Found syntax definition for " + modulePath, Log.IMPORT);
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
  public static RelativePath importStratego(String modulePath, Environment environment, Result driverResult) {
    RelativePath str = searchFile(modulePath, "str", environment, driverResult);
    
    if (str == null)
      return null;

    log.log("Found desugaring for " + modulePath, Log.IMPORT);
    return str;
  }
  
  /**
   * 
   * @param modulePath
   * @param driverResult
   * @return true iff a serv file existed.
   * @throws IOException
   */
  public static boolean importEditorServices(String modulePath, Environment environment, Result driverResult) throws IOException {
    RelativePath serv = searchFile(modulePath, "serv", environment, driverResult);
    
    if (serv == null)
      return false;
    
    BufferedReader reader = null;
    
    log.beginTask("Incorporation", "Found editor services for " + modulePath, Log.IMPORT);
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
  
  public static RelativePath importModel(String modulePath, Environment environment, Result driverResult) {
    RelativePath model = searchFile(modulePath, "model", environment, driverResult);
    
    if (model == null)
      return null;

    log.log("Found model for " + modulePath, Log.IMPORT);
    return model;
  }
  
  public static RelativePath locateSourceFile(String path, List<Path> sourcePath) {
    return locateSourceFile (FileCommands.dropExtension(path), FileCommands.getExtension(path), sourcePath);
  }

  public static RelativePath locateSourceFileOrModel(String modulePath, List<Path> sourcePath, AbstractBaseProcessor baseProcessor, Environment environment) {
    RelativePath result = locateSourceFile(modulePath, baseProcessor.getLanguage().getSugarFileExtension(), sourcePath);
    if (result == null)
      result = searchFile(modulePath, "model", environment, null);
    if (result == null && baseProcessor.getLanguage().getBaseFileExtension() != null)
      result = locateSourceFile(modulePath, baseProcessor.getLanguage().getBaseFileExtension(), sourcePath);
    return result;
  }

  public static RelativePath locateSourceFile(String modulePath, String extension, List<Path> sourcePath) {
    if (modulePath.startsWith("org/sugarj"))
      return null;
    
    return searchFileInSourceLocationPath(modulePath, extension, sourcePath, null);
  }
  
  /**
   * Registers searched files in the driverResult. Existing and non-existent files are registers,
   * so that the emergence of a file triggers recompilation.
   * 
   * @param relativePath without extension
   * @param fileExtension without leading "."
   * @return RelativePath or null.
   * @throws IOException 
   */
  public static RelativePath searchFile(String relativePath, String fileExtension, Environment environment, Result driverResult) {
    RelativePath p;
    
    p = searchFile(environment.createOutPath(relativePath + "." + fileExtension), driverResult);
    if (p == null) {
      p = searchFile(environment.createOutPath(relativePath + "." + fileExtension), driverResult);
      if (p == null)
          p = searchFileInSearchPath(relativePath, fileExtension, environment.getIncludePath(), driverResult);
    }
    return p;
  }

  private static RelativePath searchFile(RelativePath file, Result driverResult) {
    if (driverResult != null)
      driverResult.addFileDependency(file);
    if (file.getFile().exists())
      return file;
    
    return null;
  }
	  
  private static RelativePath searchFileInSearchPath(String relativePath, String extension, List<Path> searchPath, Result driverResult) {
    for (Path base : searchPath) {
      RelativePath p = searchFile(base, relativePath, extension, driverResult);
      if (p != null)
        return p;
    }
    
    return null;
  }

  private static RelativePath searchFileInSourceLocationPath(String relativePath, String extension, List<Path> searchPath, Result driverResult) {
    for (Path loc : searchPath) {
      RelativePath p = searchFile(loc, relativePath, extension, driverResult);
      if (p != null)
        return p;
    }
    
    return null;
  }

  private static RelativePath searchFile(Path base, String relativePath, String extension, Result driverResult) {
    if (relativePath.startsWith(base.getAbsolutePath())) {
      int sepOffset = relativePath.endsWith(Environment.sep) ? 0 : 1;
      relativePath = relativePath.substring(base.getAbsolutePath().length() + sepOffset);
    }
    
    RelativePath p = new RelativePath(base, relativePath + "." + extension);
    if (driverResult != null)
      driverResult.addFileDependency(p);
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
  
  public static Result locateResult(String modulePath, Environment environment) {
    Path dep = ModuleSystemCommands.searchFile(modulePath, "dep", environment, null);
    Result res = null;
    
    if (dep != null)
      try {
        res = Result.readDependencyFile(dep);
      } catch (IOException e) {
        log.logErr("could not read dependency file " + dep, Log.DETAIL);
      }
    
    return res;
  }
}
