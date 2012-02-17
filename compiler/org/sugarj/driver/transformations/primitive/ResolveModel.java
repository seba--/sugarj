package org.sugarj.driver.transformations.primitive;

import java.io.IOException;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.Environment;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.path.Path;

class ResolveModel extends AbstractPrimitive {

  private Environment env;
  
  public ResolveModel(Environment env) {
    super("SUGARJ_resolve_model", 0, 1);
    this.env = env;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    String modelPath = ATermCommands.getString(tvars[0]);
    try {
      Path p = ModuleSystemCommands.importModel(modelPath, env);
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