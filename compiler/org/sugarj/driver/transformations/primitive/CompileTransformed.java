package org.sugarj.driver.transformations.primitive;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.shared.BadTokenException;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.FileCommands;
import org.sugarj.driver.Log;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Result;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.driver.path.RelativeSourceLocationPath;
import org.sugarj.util.Renaming;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
class CompileTransformed extends AbstractPrimitive {

  private boolean generateFiles;
  private Environment environment;
  private IProgressMonitor monitor;
  
  public CompileTransformed(boolean generateFiles, Environment environment, IProgressMonitor monitor) {
    super("SUGARJ_compile", 0, 2);
    this.environment = environment;
    this.monitor = monitor;
    this.generateFiles = generateFiles;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    if (!generateFiles)
      return false;
    
    IStrategoTerm generatedModel = context.current();
    
    String modelPath = ATermCommands.getString(tvars[0]);
    
    IStrategoTerm transformationsTerm = tvars[1];
    List<RelativePath> transformationPaths = new LinkedList<RelativePath>(); 
    if (ATermCommands.isString(transformationsTerm))
      transformationPaths.add(new RelativePath(ATermCommands.getString(transformationsTerm)));
    else
      for (IStrategoTerm pathTerm : ATermCommands.getList(transformationsTerm)) {
        String transPath = ATermCommands.getString(pathTerm);
        transformationPaths.add(new RelativePath(transPath));
      }
    
    RelativeSourceLocationPath source = ModuleSystemCommands.getTransformedModelSourceFilePath(modelPath, transformationPaths, environment);
    try {
      ATermCommands.atermToFile(generatedModel, source);
    } catch (IOException e) {
    }
    
    Result res;
    try {
      environment.getRenamings().add(0, new Renaming(modelPath, source.getRelativePath()));
      res = Driver.compile(generatedModel, source, monitor, new LinkedHashMap<Path, Driver>());
    } catch (Exception e) {
      Log.log.logErr(e.getMessage());
      return false;
    } finally {
      environment.getRenamings().remove(0);
    }
    
    if (res == null)
      return false;
    
    try {
      ModuleSystemCommands.registerResults(res, environment, modelPath);
      ModuleSystemCommands.registerResults(res, environment, transformationPaths);
      res.rewriteDependencyFile();
      
      if (!res.getParseErrors().isEmpty() || !res.getCollectedErrors().isEmpty()) {
        for (BadTokenException e : res.getParseErrors())
          Log.log.logErr("line " + e.getLineNumber() + ": " + e.getLocalizedMessage());
        for (String err : res.getCollectedErrors())
          Log.log.logErr(err);
        return false;
      }
    
      Path modelDep = ModuleSystemCommands.searchFile(FileCommands.dropExtension(modelPath), ".dep", environment);
      Collection<Path> modelDeps = 
          modelDep == null ? 
          Collections.<Path>emptyList() : 
          Result.readDependencyFile(modelDep, environment).getFileDependencies(environment);

      Collection<Path> transDeps = new HashSet<Path>();
      for (RelativePath transPath : transformationPaths) {
        Path transDep = ModuleSystemCommands.searchFile(FileCommands.dropExtension(transPath.getRelativePath()), ".dep", environment);
        if (transDep != null)
          transDeps.addAll(Result.readDependencyFile(transDep, environment).getFileDependencies(environment));
      }

      Collection<Path> transformedModelDeps = res.getFileDependencies(environment);
      TreeSet<String> failed = new TreeSet<String>();
      
      for (Path p : transformedModelDeps)
        if (FileCommands.exists(p)) {
          boolean ok = 
              source.equals(p) ||
              res.getDirectlyGeneratedFiles().contains(p) ||
              modelDeps.contains(p) || 
              transDeps.contains(p);
          if (!ok)
            failed.add(FileCommands.dropExtension(p.getAbsolutePath()));
        }

      if (!failed.isEmpty()) {
        Log.log.logErr("Violation of communication integrity: Generated model refers to the following artifacts, which neither the model nor the transformation refers to.");
        for (String p : failed)
          Log.log.logErr("  " + p);
      }
    } catch (IOException e) {
      Log.log.logErr(e.getMessage());
    }
    
    return true;
  }
  
}