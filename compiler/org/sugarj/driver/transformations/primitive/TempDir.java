package org.sugarj.driver.transformations.primitive;

import java.io.IOException;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.FileCommands;
import org.sugarj.driver.path.Path;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
class TempDir extends AbstractPrimitive {

  public TempDir() {
    super("SUGARJ_temp_dir", 0, 0);
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    try {
      Path p = FileCommands.newTempDir();
      context.setCurrent(ATermCommands.makeString(p.getAbsolutePath(), null));
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }
  
}