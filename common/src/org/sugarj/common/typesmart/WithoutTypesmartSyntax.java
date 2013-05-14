package org.sugarj.common.typesmart;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;

/**
 * Looks up a typesmart sort attachment.
 * 
 * @author seba
 */
public class WithoutTypesmartSyntax extends AbstractPrimitive {

  private WithoutTypesmartSyntax() {
    super("SUGARJ_without_typesmart_syntax", 1, 0);
  }
  
  public static WithoutTypesmartSyntax instance = new WithoutTypesmartSyntax();

  @Override
  public boolean call(IContext ctx, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    ITermFactory oldFactory = ctx.getFactory();
    try {
      if (oldFactory instanceof TypesmartTermFactory) {
        ctx.setFactory(((TypesmartTermFactory) ctx.getFactory()).getBaseFactory());
      }
      return svars[0].evaluate(ctx);
    } finally {
      ctx.setFactory(oldFactory);
    }
  }
  
  public static IStrategoTerm invoke(Context ctx, org.strategoxt.lang.Strategy s, IStrategoTerm current, IStrategoTerm... targs) {
    ITermFactory oldFactory = ctx.getFactory();
    try {
      if (oldFactory instanceof TypesmartTermFactory) {
        ctx.setFactory(((TypesmartTermFactory) ctx.getFactory()).getBaseFactory());
      }
      if (targs.length == 0)
        return s.invoke(ctx, current);
      if (targs.length == 1)
        return s.invoke(ctx, current, targs[0]);
      if (targs.length == 2)
        return s.invoke(ctx, current, targs[0], targs[1]);
      if (targs.length == 3)
        return s.invoke(ctx, current, targs[0], targs[1], targs[2]);
      if (targs.length == 4)
        return s.invoke(ctx, current, targs[0], targs[1], targs[2], targs[3]);
      if (targs.length == 5)
        return s.invoke(ctx, current, targs[0], targs[1], targs[2], targs[3], targs[4]);
      throw new IllegalArgumentException("Too many term arguments provided: " + targs);
    } finally {
      ctx.setFactory(oldFactory);
    }
  }
}