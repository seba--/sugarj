package org.sugarj.driver.transformations.primitive;

import java.io.IOException;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.path.Path;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Result;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
class ResolveModel extends AbstractPrimitive {

  private Environment env;
  private Result driverResult;
  
  public ResolveModel(Environment env, Result driverResult) {
    super("SUGARJ_resolve_model", 0, 0);
    this.env = env;
    this.driverResult = driverResult;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    String modelPath = ATermCommands.getString(context.current());
    try {
      Path p = ModuleSystemCommands.importModel(modelPath, env, driverResult);
      if (p == null)
        return false;
      IStrategoTerm model = ATermCommands.atermFromFile(p.getAbsolutePath());
      if (model == null)
        return false;
      context.setCurrent(model);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
  
}