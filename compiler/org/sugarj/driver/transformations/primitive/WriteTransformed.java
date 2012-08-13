package org.sugarj.driver.transformations.primitive;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Result;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.driver.path.RelativeSourceLocationPath;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
class WriteTransformed extends AbstractPrimitive {

  private Driver driver;
  private Environment environment;
  
  public WriteTransformed(Driver driver, Environment environment) {
    super("SUGARJ_write", 0, 2);
    this.driver = driver;
    this.environment = environment;
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
      ATermCommands.atermToFile(generatedModel, source);
    } catch (IOException e) {
      driver.setErrorMessage(e.getLocalizedMessage());
    }
    
    try {
      RelativePath model = ModuleSystemCommands.searchFile(modelPath, ".model", environment);
      ModuleSystemCommands.markGenerated(source, environment, model, transformationPaths);
    } catch (IOException e) {
      driver.setErrorMessage(e.getLocalizedMessage());
    } catch (ClassNotFoundException e) {
      driver.setErrorMessage(e.getLocalizedMessage());
    }
    
    return true;
  }
  
}