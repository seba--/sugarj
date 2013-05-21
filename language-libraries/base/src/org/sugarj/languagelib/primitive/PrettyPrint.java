package org.sugarj.languagelib.primitive;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.ATermCommands;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
public class PrettyPrint extends AbstractPrimitive {

  private IPrettyPrint pp;
  private ATermCommands aterm;
  
  public PrettyPrint(IPrettyPrint pp, ATermCommands aterm) {
    super("SUGARJ_pretty_print_base", 0, 0);
    this.pp = pp;
    this.aterm = aterm;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    if (pp == null)
      return false; 
    
    String s = pp.prettyPrint(context.current());
    if (s != null) {
      context.setCurrent(aterm.makeString(s));
      return true;
    }
    
    return false;
  }
  
}