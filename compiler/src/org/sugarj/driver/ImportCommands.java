package org.sugarj.driver;

import java.io.IOException;
import java.text.ParseException;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.strategoxt.lang.StrategoException;
import org.sugarj.AbstractBaseProcessor;
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
  
  private AbstractBaseProcessor baseProcessor;
  private Environment environment;
  private Driver driver;
  private Result driverResult;
  private STRCommands str; 
  
  public ImportCommands(AbstractBaseProcessor baseProcessor, Environment environment, Driver driver, Result driverResult, STRCommands str) {
    this.baseProcessor = baseProcessor;
    this.environment = environment;
    this.driver = driver;
    this.driverResult = driverResult;
    this.str = str;
  }

  /**
   * Resolve module
   * 
   * @param term 
   * @param toplevelDecl
   * @param asModel If true, looks for models. If false, looks for transformations.
   * @return
   */
  private RelativePath resolveModule(IStrategoTerm term, IStrategoTerm toplevelDecl, boolean asModel) throws TokenExpectedException, IOException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    if (ATermCommands.isApplication(term, "TransApp")) {
      IStrategoTerm model = ATermCommands.getApplicationSubterm(term, "TransApp", 1);
      IStrategoTerm transformation = ATermCommands.getApplicationSubterm(term, "TransApp", 0);
      Pair<String, Boolean> transformedModel = transformModel(model, transformation, toplevelDecl);
      if (transformedModel != null) {
        if (asModel)
          return ModuleSystemCommands.importModel(transformedModel.a, environment, driverResult);
        else
          return ModuleSystemCommands.importStratego(transformedModel.a, environment, driverResult);
      }
      return null;
    }
    
    String path = baseProcessor.getModulePath(term);
    if (path.contains("/")) {
      boolean isCircularImport = driver.prepareImport(toplevelDecl, path);
      if (isCircularImport)
        return null;
      
      if (asModel)
        return ModuleSystemCommands.importModel(path, environment, driverResult);
      else
        return ModuleSystemCommands.importStratego(path, environment, driverResult);
    }
    
    throw new RuntimeException("TODO support non-qualifed transformations and model paths");
    // TODO support non-qualifed transformations and model paths
    
//    return null;
  }

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
  public Pair<String, Boolean> transformModel(IStrategoTerm model, IStrategoTerm transformation, IStrategoTerm toplevelDecl) throws TokenExpectedException, IOException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    RelativePath modelPath = resolveModule(model, toplevelDecl, true);
    RelativePath transformationPath = resolveModule(transformation, toplevelDecl, false);
    
    if (modelPath == null) {
      // something's wrong
      String name;
      try {
        name = baseProcessor.getModulePath(model);
      } catch (Exception e) {
        name = model.toString();
      }
      driver.setErrorMessage(toplevelDecl, "model not found " + name);
      return null;
    }
    if (transformationPath == null) {
      // something's wrong
      String name;
      try {
        name = baseProcessor.getModulePath(transformation);
      } catch (Exception e) {
        name = transformation.toString();
      }
      driver.setErrorMessage(toplevelDecl, "transformation not found " + name);
      return null;
    }

    Log.log.beginTask("Transform model " + FileCommands.fileName(modelPath) + " with transformation " + FileCommands.fileName(transformationPath), Log.TRANSFORM);
    try {
      RelativePath transformedModelSourceFile = getTransformedModelSourceFilePath(modelPath, transformationPath, environment);
      String transformedModelPath = FileCommands.dropExtension(transformedModelSourceFile.getRelativePath());
      Result transformedModelResult = ModuleSystemCommands.locateResult(transformedModelPath, environment);
  
      if (transformedModelResult != null && transformedModelResult.isUpToDate(environment)) {
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
   * Assumes that the model and transformation are already registered as dependencies with the current driver result.
   * 
   * @param model Path to the *.model file that contains the Aterm model.
   * @param transformationPath Path to the *.str transformation.
   */
  private static IStrategoTerm executeTransformation(RelativePath model, RelativePath transformationPath, IStrategoTerm toplevelDecl, Environment environment, STRCommands str, Driver driver) throws IOException, TokenExpectedException, BadTokenException, InvalidParseTableException, SGLRException {
    IStrategoTerm modelTerm = ATermCommands.atermFromFile(model.getAbsolutePath());
    String strat = "main-" + FileCommands.dropExtension(transformationPath.getRelativePath()).replace('/', '_');
    Result transformationResult = ModuleSystemCommands.locateResult(FileCommands.dropExtension(transformationPath.getRelativePath()), environment);
    
    Path trans = str.compile(transformationPath, strat, transformationResult.getTransitiveFileDependencies());
    
    IStrategoTerm transformationInput = 
        ATermCommands.makeTuple(
            modelTerm, 
            ATermCommands.makeString(FileCommands.dropExtension(model.getRelativePath()), null),
            ATermCommands.makeString(FileCommands.dropExtension(transformationPath.getRelativePath()), null));

    try {
      IStrategoTerm transformedTerm = str.assimilate(strat, trans, transformationInput);
      return transformedTerm;
    } catch (StrategoException e) {
      String msg = "Failed to apply transformation " + transformationPath.getRelativePath() + " to model " + model.getRelativePath() + ": " + e.getMessage();
      driver.setErrorMessage(toplevelDecl, msg);
      throw new StrategoException(msg);
    }
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
      return environment.createOutPath(modelPath + ".model");
    
    String transformationPathString = FileCommands.dropExtension(transformationPath.getRelativePath());
    String transformedModelPath = FileCommands.dropExtension(modelPath.getRelativePath()) + "__" + transformationPathString.replace('/', '_');
    return environment.createOutPath(transformedModelPath + ".model");
  }
  
  /**
   * Retrieves the right-most model in the given transformation application and returns the model's name.
   * 
   * @param appl
   * @param base processor
   * @return
   */
  public static String getTransformationApplicationModelPath(IStrategoTerm appl, AbstractBaseProcessor baseProcessor) {
    if (ATermCommands.isApplication(appl, "TransApp"))
      return getTransformationApplicationModelPath(appl.getSubterm(1), baseProcessor);
    return baseProcessor.getModulePath(appl);
  }
}
