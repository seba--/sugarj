package org.sugarj.driver;

import static org.sugarj.driver.ATermCommands.isApplication;
import static org.sugarj.driver.Log.log;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.driver.path.AbsolutePath;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.driver.path.RelativeSourceLocationPath;
import org.sugarj.driver.path.SourceLocation;

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
  public static RelativePath importClass(String modulePath, Environment environment) throws IOException {
    RelativePath clazz = searchFile(modulePath, ".class", environment);
    
    if (clazz == null)
      return null;
    
    log.log("Found class file for " + modulePath);
    return clazz;
  }
  
  public static void registerSearchedClassFiles(String modulePath, Result driverResult, Environment environment) throws IOException {
    registerSearchedFiles(modulePath, ".class", driverResult, environment);
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
    RelativePath sdf = searchFile(modulePath.replace("$", "-"), ".sdf", environment);
    
    if (sdf == null)
      return null;
    
    log.log("Found syntax definition for " + modulePath);
    return sdf;
  }
  
  public static void registerSearchedSdfFiles(String modulePath, Result driverResult, Environment environment) throws IOException {
    registerSearchedFiles(modulePath, ".sdf", driverResult, environment);
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
    RelativePath str = searchFile(modulePath.replace("$", "-"), ".str", environment);
    
    if (str == null)
      return null;

    log.log("Found desugaring for " + modulePath);
    return str;
  }
  
  public static void registerSearchedStrategoFiles(String modulePath, Result driverResult, Environment environment) throws IOException {
    registerSearchedFiles(modulePath, ".str", driverResult, environment);
  }

  
  /**
   * 
   * @param modulePath
   * @param driverResult
   * @return true iff a serv file existed.
   * @throws IOException
   */
  public static RelativePath importEditorServices(String modulePath, Result driverResult, Environment environment) throws IOException {
    RelativePath serv = searchFile(modulePath, ".serv", environment);
    
    if (serv == null)
      return null;
    
    log.log("Found editor services for " + modulePath);
    return serv;
  }
  

  public static RelativePath importModel(String modulePath, Environment environment) throws IOException {
    RelativePath model = searchFile(modulePath, ".model", environment);
    
    if (model == null)
      return null;

    log.log("Found model for " + modulePath);
    return model;
  }
  

  public static void registerSearchedEditorServicesFiles(String modulePath, Result driverResult, Environment environment) throws IOException {
    registerSearchedFiles(modulePath, ".serv", driverResult, environment);
  }

  public static void registerSearchedModelFiles(String modulePath, Result driverResult, Environment environment) throws IOException {
    registerSearchedFiles(modulePath, ".model", driverResult, environment);
  }


  public static RelativeSourceLocationPath locateSourceFile(String modulePath, Set<SourceLocation> sourcePath) {
    if (modulePath.startsWith("org/sugarj"))
      return null;
    
    RelativeSourceLocationPath result = searchFileInSourceLocationPath(modulePath, ".sugj", sourcePath);
    if (result == null)
      result = searchFileInSourceLocationPath(modulePath, ".model", sourcePath);
    if (result == null)
      result = searchFileInSourceLocationPath(modulePath, ".java", sourcePath);
    
    return result;
  }
  
  public static RelativeSourceLocationPath locateCompilableFile(String modulePath, Environment environment) {
    if (modulePath.startsWith("org/sugarj"))
      return null;
    
    RelativeSourceLocationPath result = locateSourceFile(modulePath, environment.getSourcePath());
    if (result == null) {
      RelativePath p = searchBinFile(modulePath, ".model", environment);
      if (p != null)
        result = new RelativeSourceLocationPath(p, environment);
    }
    
    return result;
  }
  
  public static String extractImportedModuleName(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException {
    String name = null;
    log.beginTask("Extracting", "Extract name of imported module");
    try {
      if (isApplication(toplevelDecl, "TypeImportDec"))
        name = SDFCommands.prettyPrintJava(toplevelDecl.getSubterm(0), interp);
      if (isApplication(toplevelDecl, "TypeAsImportDec"))
        name = SDFCommands.prettyPrintJava(toplevelDecl.getSubterm(0), interp);
      else if (isApplication(toplevelDecl, "TypeImportOnDemandDec"))
        name = SDFCommands.prettyPrintJava(toplevelDecl.getSubterm(0), interp) + ".*";
      else if (isApplication(toplevelDecl, "TransImportDec"))
        name = extractTransImportedModuleName(toplevelDecl.getSubterm(1), interp);
    } finally {
      log.endTask(name);
    }
    return name;
  }

  private static String extractTransImportedModuleName(IStrategoTerm term, HybridInterpreter interp) throws IOException {
    if (isApplication(term, "TransApp"))
      return extractTransImportedModuleName(term.getSubterm(1), interp);
    return SDFCommands.prettyPrintJava(term, interp);
  }
  
  public static IStrategoTerm getTransImportModel(IStrategoTerm term) {
    return ATermCommands.getApplicationSubterm(term, "TransImportDec", 1).getSubterm(1);
  }

  public static IStrategoTerm getTransImportTrans(IStrategoTerm term) {
    return ATermCommands.getApplicationSubterm(term, "TransImportDec", 1).getSubterm(0);
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
    RelativePath result = environment.new RelativePathBin(relativePath + extension);
    if (result.getFile().exists())
      return result;
    
    return null;
  }
  
  private static RelativePath searchFileInSearchPath(String relativePath, String extension, Set<Path> searchPath) {
    for (Path base : searchPath) {
      if (!base.getFile().exists() || !base.getFile().isDirectory())
        continue;
      
      RelativePath p = searchFile(base, relativePath, extension);
      if (p != null)
        return p;
    }
    
    return null;
  }

  private static RelativeSourceLocationPath searchFileInSourceLocationPath(String relativePath, String extension, Set<SourceLocation> searchPath) {
    for (SourceLocation loc : searchPath) {
      RelativePath p = searchFile(loc.getPath(), relativePath, extension);
      if (p != null)
        return new RelativeSourceLocationPath(loc, p);
    }
    
    return null;
  }

  private static RelativePath searchFile(Path base, String relativePath, String extension) {
    if (relativePath.startsWith(base.getAbsolutePath())) {
      int sepOffset = relativePath.endsWith(Environment.sep) ? 0 : 1;
      relativePath = relativePath.substring(base.getAbsolutePath().length() + sepOffset);
    }
    
    RelativePath p = new RelativePath(base, relativePath + extension);
    if (p.getFile().exists())
      return p;
    
    URLClassLoader cl = null;
    try {
      cl = new URLClassLoader(new URL[] {base.getFile().toURI().toURL()}, null);
      if (cl.getResource(relativePath + extension) != null)
        return new RelativePath(base, relativePath + extension);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } finally {
//      if (cl != null)
//        try {
//          cl.close();
//        } catch (IOException e) {
//        }
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
    RelativePath binFile = environment.new RelativePathBin(relativePath + extension);
    driverResult.addFileDependency(binFile);
    
    for (Path searchPath : environment.getIncludePath()) {
      if (!searchPath.getFile().exists() || !searchPath.getFile().isDirectory())
        continue;
      
      String relPath = relativePath;
      if (relPath.startsWith(searchPath.getAbsolutePath())) {
        int sepOffset = relativePath.endsWith(Environment.sep) ? 0 : 1;
        relPath = relPath.substring(searchPath.getAbsolutePath().length() + sepOffset);
      }
      
      RelativePath p = new RelativePath(searchPath, relPath + extension);
      driverResult.addFileDependency(p);
    }
  }

  public static RelativeSourceLocationPath getTransformedModelSourceFilePath(String modelPath, RelativePath transformationPaths, Environment environment) {
    if (transformationPaths == null)
      return new RelativeSourceLocationPath(new SourceLocation(environment.bin, environment), modelPath + ".model");
    
    String transformationPathString = StringCommands.makeTransformationPathString(transformationPaths);
    
    String transformedModelPath = modelPath + "$" + transformationPathString.replace('-', '$');
    return new RelativeSourceLocationPath(new SourceLocation(environment.bin, environment), transformedModelPath + ".model");
  }

  public static RelativeSourceLocationPath getTransformedModelSourceFilePath(RelativePath modelPath, RelativePath transformationPaths, Environment environment) {
    if (modelPath == null)
      return null;
    if (transformationPaths == null)
      return new RelativeSourceLocationPath(new SourceLocation(environment.bin, environment), modelPath + ".model");
    
    String transformationPathString = StringCommands.makeTransformationPathString(transformationPaths);
    
    String transformedModelPath = modelPath.getRelativePath() + "$" + transformationPathString.replace('-', '$');
    return new RelativeSourceLocationPath(new SourceLocation(environment.bin, environment), transformedModelPath + ".model");
  }
  
  public static RelativePath transformedModelPath(RelativePath modelPath, RelativePath transformationPath) {
    String newModuleName = transformedModuleName(FileCommands.dropExtension(modelPath.getRelativePath()), transformationPath);
    String extension = FileCommands.getExtension(modelPath);
    return new RelativePath(modelPath.getBasePath(), newModuleName + (extension == null ? "" : ("." + extension)));
  }
  
  public static String transformedModuleName(String moduleName, RelativePath transformationPath) {
    String dollar = moduleName.endsWith("$") ? "" : "$";
    return moduleName + dollar + transformedPathSuffix(transformationPath);
  }
  
  public static String transformedPathSuffix(RelativePath transformationPath) {
    return FileCommands.dropExtension(transformationPath.getRelativePath().replace('/', '_'));
  }
  
  public static Origin markGenerated(RelativePath generatedModel, Environment env, RelativePath model, RelativePath transformation) throws IOException, ClassNotFoundException {
    return markGenerated(generatedModel, null, env, model, transformation);
  }
  
  public static List<Path> getDependencies(Environment env, RelativePath model, RelativePath transformation) throws IOException {
    List<Path> deps = new LinkedList<Path>();
    
    String modelPath = FileCommands.dropExtension(model.getRelativePath());
    Path modelDep = searchFile(modelPath, ".dep", env);
    if (modelDep == null)
      throw new FileNotFoundException("Could not locate model dependency file " + modelPath + ".");
    deps.add(modelDep);
    
    String transPath = FileCommands.dropExtension(transformation.getRelativePath()).replace('-', '$');
    Path transDep = searchFile(transPath, ".dep", env);
    if (transDep == null)
      throw new FileNotFoundException("Could not locate transformation dependency file " + transPath + ".");
    deps.add(transDep);
    
    return deps;
  }

  public static Origin markGenerated(RelativePath generatedModel, Result res, Environment env, RelativePath model, RelativePath transformation) throws IOException, ClassNotFoundException {
    String modelPath = FileCommands.dropExtension(model.getRelativePath());
    Path modelDep = searchFile(modelPath, ".dep", env);
    if (modelDep == null)
      throw new FileNotFoundException("Could not locate model dependency file " + modelPath + ".");
    
    List<Path> transformationDeps = new LinkedList<Path>();
    String transPath = FileCommands.dropExtension(transformation.getRelativePath()).replace('-', '$');
    Path transDep = searchFile(transPath, ".dep", env);
    if (transDep == null)
      throw new FileNotFoundException("Could not locate transformation dependency file " + transPath + ".");
    transformationDeps.add(transDep);
    
    Origin origin = new Origin(modelDep, transformationDeps);
    
    if (res != null) {
      Path p = new AbsolutePath(FileCommands.dropExtension(generatedModel.getAbsolutePath()) + ".origin");
      res.generateFile(p, origin.writeString());
      registerDependency(res, p, env);
    }
    
    return origin;
  }
  
  private static void registerDependency(Result result, Path dep, Environment env) throws ClassNotFoundException, IOException {
    Path originPath = new AbsolutePath(FileCommands.dropExtension(dep.getAbsolutePath()) + ".origin");
    if (FileCommands.exists(originPath)) {
      Origin origin = Origin.read(originPath);
      if (origin != null && origin.isGenerated()) {
        result.addDependency(origin.getOriginalModel(), env);
        registerDependency(result, origin.getOriginalModel(), env);
        for (Path transPath : origin.getUsedTransformations()) {
          result.addDependency(transPath, env);
          registerDependency(result, transPath, env);
        }
      }
    }
  }
  
  public static Origin getOrigin(RelativePath model, Environment environment) throws ClassNotFoundException, IOException {
    Path p = searchFile(model.getRelativePath(), ".origin", environment);
    if (p != null)
      return Origin.read(p);
    return null;
  }

  public static String getModulePath(RelativePath p) {
    if (p == null)
      return null;
    return FileCommands.dropExtension(p.getRelativePath());
  }
  
  public static boolean isModuleCompilationUpToDate(String modulePath, Environment environment) throws IOException {
    Path dep = ModuleSystemCommands.searchFile(modulePath, ".dep", environment);
    if (dep != null) {
      Result res = Result.readDependencyFile(dep, environment);
      return res != null && res.isUpToDate(res.getSourceFile(), environment);
    }
    return false;
  }

  public static void registerGeneratedFiles(String modulePath, Result res, Environment environment) throws IOException {
    Path dep = searchFile(modulePath.replace('-', '$'), ".dep", environment);
    if (dep != null)
      res.addDependency(dep, environment);
  }
}
