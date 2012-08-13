package org.sugarj.driver.transformations.primitive;

import java.io.IOException;
import java.util.Collection;
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
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.shared.BadTokenException;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.FileCommands;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Origin;
import org.sugarj.driver.Result;
import org.sugarj.driver.path.AbsolutePath;
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

  private Driver driver;
  private boolean generateFiles;
  private Environment environment;
  private IProgressMonitor monitor;
  
  public CompileTransformed(Driver driver, boolean generateFiles, Environment environment, IProgressMonitor monitor) {
    super("SUGARJ_compile", 0, 2);
    this.driver = driver;
    this.environment = environment;
    this.monitor = monitor;
    this.generateFiles = generateFiles;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
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
      Renaming ren = new Renaming(modelPath, source.getRelativePath());
      environment.getRenamings().add(0, ren);
      generatedModel = ATermCommands.renameDeclarations(generatedModel, ren, driver.getRenamingContext());

      ATermCommands.atermToFile(generatedModel, source);
    } catch (IOException e) {
      driver.setErrorMessage(e.getLocalizedMessage());
    } catch (InvalidParseTableException e) {
      driver.setErrorMessage(e.getLocalizedMessage());
    }
    
    Result res;
    try {
      if (generateFiles)
        res = Driver.compile(generatedModel, source, monitor, new LinkedHashMap<Path, Driver>());
      else
        res = Driver.parse(generatedModel, source, monitor, new LinkedHashMap<Path, Driver>());
    } catch (Exception e) {
      driver.setErrorMessage(e.getMessage());
      return false;
    } finally {
      environment.getRenamings().remove(0);
    }
    
    if (res == null)
      return false;
    
    try {
      RelativePath model = ModuleSystemCommands.searchFile(modelPath, ".model", environment);
      ModuleSystemCommands.markGenerated(source, res, environment, model, transformationPaths);
      res.rewriteDependencyFile();
      
      if (res.hasFailed()) {
        for (BadTokenException e : res.getParseErrors())
          driver.setErrorMessage("line " + e.getLineNumber() + ": " + e.getLocalizedMessage());
        for (String err : res.getCollectedErrors())
          driver.setErrorMessage(err);
        return false;
      }
    
      checkCommunicationIntegrity(modelPath, transformationPaths, source, res);
    } catch (IOException e) {
      e.printStackTrace();
      driver.setErrorMessage(e.getMessage());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      driver.setErrorMessage(e.getMessage());
    }
    
    return true;
  }
  
  private void checkCommunicationIntegrity(String modelPath, List<RelativePath> transformationPaths, Path source, Result res) throws IOException, ClassNotFoundException {
    Path modelDep = ModuleSystemCommands.searchFile(FileCommands.dropExtension(modelPath), ".dep", environment);
    Collection<Path> modelDeps = new HashSet<Path>();
    if (modelDep != null) {
      Result modelResult = Result.readDependencyFile(modelDep, environment);
      modelDeps.addAll(modelResult.getFileDependencies(environment));
      modelDeps.addAll(modelResult.getDirectlyGeneratedFiles()); 
    }

    Collection<Path> transDeps = new HashSet<Path>();
    for (RelativePath transPath : transformationPaths) {
      Path transDep = ModuleSystemCommands.searchFile(FileCommands.dropExtension(transPath.getRelativePath().replace('-', '$')), ".dep", environment);
      if (transDep != null) {
        Result transResult = Result.readDependencyFile(transDep, environment);
        transDeps.addAll(transResult.getFileDependencies(environment));
        transDeps.addAll(transResult.getDirectlyGeneratedFiles()); 
      }
    }

    Collection<Path> transformedModelDeps = res.getFileDependencies(environment);
    TreeSet<String> failed = new TreeSet<String>();
    
    for (Path p : transformedModelDeps)
      if (FileCommands.exists(p)) {
        boolean ok = false || 
            source.equals(p) ||
            res.getDirectlyGeneratedFiles().contains(p) ||
            modelDeps.contains(p) || 
            transDeps.contains(p);
        if (!ok) {
          // transformations may generated other artifacts, given that their dependencies are marked in the current result
          Path dep = new AbsolutePath(FileCommands.dropExtension(p.getAbsolutePath()) + ".dep");
          if (FileCommands.exists(dep) && res.hasDependency(dep, environment)) {
            Path originFile = new AbsolutePath(FileCommands.dropExtension(p.getAbsolutePath()) + ".origin");
            Origin origin = FileCommands.readObjectFromFile(originFile);
            ok = origin != null && origin.isGenerated();
          }
        }
        if (!ok)
          failed.add(FileCommands.dropExtension(p.getAbsolutePath()));
      }

    if (!failed.isEmpty()) {
      StringBuilder b = new StringBuilder("Violation of communication integrity: Generated model refers to the following artifacts, which neither the model nor the transformation refers to.\n");
      for (String p : failed)
        b.append("  ").append(p).append('\n');
      driver.setErrorMessage(b.toString());
    }
  }
}