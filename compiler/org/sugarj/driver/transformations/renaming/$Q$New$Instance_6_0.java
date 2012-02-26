package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$New$Instance_6_0 extends Strategy 
{ 
  public static $Q$New$Instance_6_0 instance = new $Q$New$Instance_6_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_24, Strategy o_24, Strategy p_24, Strategy q_24, Strategy r_24, Strategy s_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QNewInstance_6_0");
    Fail147:
    { 
      IStrategoTerm z_126 = null;
      IStrategoTerm t_126 = null;
      IStrategoTerm u_126 = null;
      IStrategoTerm v_126 = null;
      IStrategoTerm w_126 = null;
      IStrategoTerm x_126 = null;
      IStrategoTerm y_126 = null;
      IStrategoTerm b_127 = null;
      IStrategoTerm c_127 = null;
      IStrategoTerm e_127 = null;
      IStrategoTerm g_127 = null;
      IStrategoTerm h_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQNewInstance_6 != ((IStrategoAppl)term).getConstructor())
        break Fail147;
      t_126 = term.getSubterm(0);
      u_126 = term.getSubterm(1);
      v_126 = term.getSubterm(2);
      w_126 = term.getSubterm(3);
      x_126 = term.getSubterm(4);
      y_126 = term.getSubterm(5);
      IStrategoList annos129 = term.getAnnotations();
      z_126 = annos129;
      term = n_24.invoke(context, t_126);
      if(term == null)
        break Fail147;
      b_127 = term;
      term = o_24.invoke(context, u_126);
      if(term == null)
        break Fail147;
      c_127 = term;
      term = p_24.invoke(context, v_126);
      if(term == null)
        break Fail147;
      e_127 = term;
      term = q_24.invoke(context, w_126);
      if(term == null)
        break Fail147;
      g_127 = term;
      term = r_24.invoke(context, x_126);
      if(term == null)
        break Fail147;
      h_127 = term;
      term = s_24.invoke(context, y_126);
      if(term == null)
        break Fail147;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQNewInstance_6, new IStrategoTerm[]{b_127, c_127, e_127, g_127, h_127, term}), checkListAnnos(termFactory, z_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 6 || targs.length != 0)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, sargs[0], sargs[1], sargs[2], sargs[3], sargs[4], sargs[5]);
  }
}