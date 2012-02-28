package org.sugarj.driver.transformations.primitive;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.Driver;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
class CurrentPackage extends AbstractPrimitive {

  private Driver driver;
  
  public CurrentPackage(Driver driver) {
    super("SUGARJ_current_package", 0, 0);
    this.driver = driver;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    String name = driver.getRelPackageName();
    
    if (name == null)
      return false;
    context.setCurrent(ATermCommands.makeString(name, ImploderAttachment.getLeftToken(driver.getPackageDec())));
    return true;
  }
  
}