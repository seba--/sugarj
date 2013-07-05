package org.sugarj.driver.transformations.primitive;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.shared.BadTokenException;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.driver.Driver;
import org.sugarj.driver.ImportCommands;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Result;
import org.sugarj.util.Renaming;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
class CompileTransformed extends AbstractPrimitive {

  private Driver driver;
  private Environment environment;
  
  public CompileTransformed(Driver driver, Environment environment) {
    super("SUGARJ_compile", 0, 2);
    this.driver = driver;
    this.environment = environment;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    try {
      IStrategoTerm generatedModel = context.current();
      
      if (!ATermCommands.isString(tvars[0]) || !ATermCommands.isString(tvars[1]))
        return false;
      
      String modelPath = ATermCommands.getString(tvars[0]);
      RelativePath modelRelativePath = new RelativePath(modelPath);
      
      IStrategoTerm transformationsTerm = tvars[1];
      RelativePath transformationPath = new RelativePath(ATermCommands.getString(transformationsTerm)); 
      
      RelativePath source = ImportCommands.getTransformedModelSourceFilePath(modelRelativePath, transformationPath, environment);
      
      try {
        Renaming ren = new Renaming(modelPath, source.getRelativePath());
        environment.getRenamings().add(0, ren);
//        generatedModel = driver.currentRename(generatedModel);
        
        driver.getCurrentResult().generateFile(source, ATermCommands.atermToString(generatedModel));
      } catch (IOException e) {
        driver.setErrorMessage(e.getLocalizedMessage());
      }
      
      Result res;
      try {
        res = driver.subcompile(driver.getTreeForErrorMarking(), source);
        
        if (res != null) {
          context.setCurrent(ATermCommands.atermFromFile(source.getAbsolutePath()));
          
          Result modelResult = ModuleSystemCommands.locateResult(FileCommands.dropExtension(modelPath), environment);
          if (modelResult != null)
            res.addDependency(modelResult);
          Result transformationResult = ModuleSystemCommands.locateResult(FileCommands.dropExtension(transformationPath.getRelativePath()), environment);
          if (transformationResult != null)
            res.addDependency(transformationResult);
        }
      } catch (Exception e) {
        e.printStackTrace();
        driver.setErrorMessage(e.getMessage());
        return false;
      } finally {
        environment.getRenamings().remove(0);
      }
      
      if (res == null)
        return false;
      
      try {
        if (res.hasFailed()) {
          for (BadTokenException e : res.getParseErrors())
            driver.setErrorMessage("line " + e.getLineNumber() + ": " + e.getLocalizedMessage());
          for (String err : res.getCollectedErrors())
            driver.setErrorMessage(err);
          return false;
        }
      
        checkCommunicationIntegrity(modelPath, transformationPath, source, res);
      } catch (IOException e) {
        e.printStackTrace();
        driver.setErrorMessage(e.getMessage());
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
        driver.setErrorMessage(e.getMessage());
      } catch (Exception e) {
        e.printStackTrace();
        driver.setErrorMessage(e.getMessage());
      }
    } catch (Exception e) {
      e.printStackTrace();
      driver.setErrorMessage(e.getMessage());
    }
    
    return true;
  }
  
  private void checkCommunicationIntegrity(String modelPath, RelativePath transformationPath, RelativePath source, Result res) throws IOException, ClassNotFoundException {
    String error = null;
    
    Log.log.beginTask("Check communication integrity", Log.CORE);
    try {
      Collection<Path> modelDeps = new HashSet<Path>();
      Result modelResult = ModuleSystemCommands.locateResult(FileCommands.dropExtension(modelPath), environment);
      if (modelResult != null) {
        modelDeps.addAll(modelResult.getCircularFileDependencies(environment));
        modelDeps.addAll(modelResult.getDirectlyGeneratedFiles()); 
      }
  
      Collection<Path> transDeps = new HashSet<Path>();
      Result transResult = ModuleSystemCommands.locateResult(FileCommands.dropExtension(transformationPath.getRelativePath()), environment);
      if (transResult != null) {
        transDeps.addAll(transResult.getCircularFileDependencies(environment));
        transDeps.addAll(transResult.getDirectlyGeneratedFiles()); 
      }
  
      if (res.getPersistentPath() == null)
        res.writeDependencyFile(FileCommands.newTempFile("dep"));
      Collection<Path> transformedModelDeps = res.getCircularFileDependencies(environment);
      TreeSet<String> failed = new TreeSet<String>();
      
      for (Path p : transformedModelDeps) {
        boolean ok = false || 
            source.equals(p) ||
            res.getDirectlyGeneratedFiles().contains(p) ||
            modelDeps.contains(p) || 
            transDeps.contains(p);
        Result pRes = null;
        if (!ok) {
          // transformations may generate other artifacts, given that their dependencies in turn are marked in the current result
          Path dep = new AbsolutePath(FileCommands.dropExtension(p.getAbsolutePath()) + ".dep");
          if (FileCommands.exists(dep)) {
            pRes = Result.readDependencyFile(dep);
            if (pRes != null && pRes.isGenerated()) {
              boolean isContained = transformedModelDeps.containsAll(pRes.getCircularFileDependencies(environment));
              ok = isContained;
            }
          }
        }
        if (!ok)
          failed.add(FileCommands.dropExtension(p.getAbsolutePath()));
      }
  
      if (!failed.isEmpty()) {
        StringBuilder b = new StringBuilder("Violation of communication integrity in " + source.getRelativePath() + ": Generated model refers to the following artifacts, which neither the model nor the transformation refers to.\n");
        for (String p : failed)
          b.append("  ").append(p).append('\n');
        error = b.toString();
        driver.setErrorMessage(error);
      }
    } finally {
      if (error == null)
        Log.log.endTask(true);
      else
        Log.log.endTask(error);
    }
  }
}