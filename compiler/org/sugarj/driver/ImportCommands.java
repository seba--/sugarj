package org.sugarj.driver;

import java.io.IOException;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr_layout.client.InvalidParseTableException;
import org.spoofax.jsglr_layout.shared.BadTokenException;
import org.spoofax.jsglr_layout.shared.SGLRException;
import org.spoofax.jsglr_layout.shared.TokenExpectedException;
import org.strategoxt.lang.StrategoException;
import org.sugarj.LanguageLib;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.util.Pair;

/**
 * @author seba
 */
public class ImportCommands {
  /**
   * Transforms the given model with the given transformation.
   * 
   * @param model AST part of the import that denotes the model.
   * @param transformation AST part of the import that denotes the transformation.
   * @param toplevelDecl
   * @param environment
   * @param driver
   * @return a pair consisting of the path to the transformed model and a flag indicating a circular import (if true). 
   */
  public static Pair<String, Boolean> transformModel(IStrategoTerm model, IStrategoTerm transformation, IStrategoTerm toplevelDecl, Environment environment, Result driverResult, STRCommands str, Driver driver) {
    RelativePath modelPath = resolveModule(model, toplevelDecl, true);
    RelativePath transformationPath = resolveModule(transformation, toplevelDecl, false);
    
    Log.log.beginTask("Transform model " + FileCommands.fileName(modelPath) + " with transformation " + FileCommands.fileName(transformationPath), Log.TRANSFORM);
    try {
      RelativePath transformedModelSourceFile = getTransformedModelSourceFilePath(modelPath, transformationPath, environment);
      String transformedModelPath = FileCommands.dropExtension(transformedModelSourceFile.getRelativePath());
      Result transformedModelResult = ModuleSystemCommands.locateResult(transformedModelPath, environment);
  
      if (modelPath == null) {
        // something's wrong
        driver.setErrorMessage(toplevelDecl, "model not found " + modelPath);
        return null;
      }
      else if (transformedModelResult.isUpToDate(environment)) {
        // result of transformation is already up-to-date, nothing to do here.
        driverResult.addDependency(transformedModelResult);
        return Pair.create(transformedModelPath, false);
      }
      else {
        // transform the model, prepare the import of the resulting code.
        IStrategoTerm transformedModel = executeTransformation(modelPath, transformationPath, toplevelDecl, environment, str, driver);
        String transformedModelText = ATermCommands.atermToString(transformedModel);
        driverResult.generateFile(transformedModelSourceFile, transformedModelText);
        
        boolean isCircularImport = driver.prepareImport(toplevelDecl, transformedModelPath);
        return Pair.create(transformedModelPath, isCircularImport);
      }
    } finally {
      Log.log.endTask();
    }
  }
  
  /**
   * Apply the transformation to the model and return the result.
   * 
   * @param model Path to the *.model file that contains the Aterm model.
   * @param transformationPath Path to the *.str transformation.
   */
  private static IStrategoTerm executeTransformation(RelativePath model, RelativePath transformationPath, IStrategoTerm toplevelDecl, Environment environment, STRCommands str, Driver driver) throws IOException, TokenExpectedException, BadTokenException, InvalidParseTableException, SGLRException {
    IStrategoTerm modelTerm = ATermCommands.atermFromFile(model.getAbsolutePath());
    String strat = "main-" + FileCommands.dropExtension(transformationPath.getRelativePath()).replace('/', '_');
    Result transformationResult = ModuleSystemCommands.locateResult(transformationPath.getRelativePath(), environment);
    
    Path trans = str.compile(transformationPath, strat, transformationResult.getFileDependencies());
    
    IStrategoTerm transformationInput = 
        ATermCommands.makeTuple(
            modelTerm, 
            ATermCommands.makeString(FileCommands.dropExtension(model.getRelativePath()), null),
            ATermCommands.makeString(FileCommands.dropExtension(transformationPath.getRelativePath()), null));

    IStrategoTerm transformedTerm = str.assimilate(strat, trans, transformationInput);
    
    if (transformedTerm == null) {
      String msg = "Failed to apply transformation " + transformationPath.getRelativePath() + " to model " + model.getRelativePath() + ".";
      driver.setErrorMessage(toplevelDecl, msg);
      throw new StrategoException(msg);
    }
    
    return transformedTerm;
  }
  
  /**
   * Computes the path of the model file generated from the given model path by the given transformation path.
   * 
   * @param modelPath
   * @param transformationPath
   * @param environment
   * @return
   */
  public static RelativePath getTransformedModelSourceFilePath(RelativePath modelPath, RelativePath transformationPath, Environment environment) {
    if (modelPath == null)
      return null;
    if (transformationPath == null)
      return environment.createBinPath(modelPath + ".model");
    
    String transformationPathString = transformationPath.getRelativePath();
    String transformedModelPath = modelPath.getRelativePath() + "__" + transformationPathString.replace('/', '_');
    return environment.createBinPath(transformedModelPath + ".model");
  }
  
  /**
   * Retrieves the right-most model in the given transformation application and returns the model's name.
   * 
   * @param appl
   * @param langLib
   * @return
   */
  public static String getTransformationApplicationModelPath(IStrategoTerm appl, LanguageLib langLib) {
    if (ATermCommands.isApplication(appl, "TransApp"))
      return getTransformationApplicationModelPath(appl.getSubterm(1), langLib);
    return langLib.getModulePath(appl);
  }

  /**
   * Finds the compilation result of the given module and checks if its up-to-date.
   * 
   * @param modulePath
   * @param environment
   * @return true iff found result is up-to-date.
   * @throws IOException
   */
  private static boolean isModuleCompilationUpToDate(String modulePath, Environment environment) throws IOException {
    Path dep = ModuleSystemCommands.searchFile(modulePath, "dep", environment, null);
    if (dep != null) {
      Result res = Result.readDependencyFile(dep);
      return res != null && res.isUpToDate(res.getSourceFile(), environment);
    }
    return false;
  }

}
