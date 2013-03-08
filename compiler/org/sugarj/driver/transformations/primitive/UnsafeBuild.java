package org.sugarj.driver.transformations.primitive;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.terms.StrategoConstructor;
import org.spoofax.terms.StrategoList;
import org.sugarj.common.ATermCommands;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
class UnsafeBuild extends AbstractPrimitive {

  private ITermFactory factory;
  
  public UnsafeBuild(ITermFactory factory) {
    super("SUGARJ_unsafe_build", 0, 1);
    this.factory = factory;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    String ctr = ATermCommands.getString(tvars[0]);
    StrategoList args = (StrategoList) context.current();
    
    IStrategoTerm unsafeTerm = factory.makeAppl(factory.makeConstructor(ctr, args.size()), ATermCommands.getList(args).toArray(new IStrategoTerm[args.size()]));
    context.setCurrent(unsafeTerm);
    return true;
  }
}