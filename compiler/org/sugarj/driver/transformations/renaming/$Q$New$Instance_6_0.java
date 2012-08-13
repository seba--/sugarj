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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_29, Strategy z_29, Strategy a_30, Strategy b_30, Strategy c_30, Strategy d_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QNewInstance_6_0");
    Fail195:
    { 
      IStrategoTerm b_145 = null;
      IStrategoTerm t_144 = null;
      IStrategoTerm u_144 = null;
      IStrategoTerm v_144 = null;
      IStrategoTerm w_144 = null;
      IStrategoTerm x_144 = null;
      IStrategoTerm y_144 = null;
      IStrategoTerm c_145 = null;
      IStrategoTerm d_145 = null;
      IStrategoTerm h_145 = null;
      IStrategoTerm i_145 = null;
      IStrategoTerm p_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQNewInstance_6 != ((IStrategoAppl)term).getConstructor())
        break Fail195;
      t_144 = term.getSubterm(0);
      u_144 = term.getSubterm(1);
      v_144 = term.getSubterm(2);
      w_144 = term.getSubterm(3);
      x_144 = term.getSubterm(4);
      y_144 = term.getSubterm(5);
      IStrategoList annos170 = term.getAnnotations();
      b_145 = annos170;
      term = y_29.invoke(context, t_144);
      if(term == null)
        break Fail195;
      c_145 = term;
      term = z_29.invoke(context, u_144);
      if(term == null)
        break Fail195;
      d_145 = term;
      term = a_30.invoke(context, v_144);
      if(term == null)
        break Fail195;
      h_145 = term;
      term = b_30.invoke(context, w_144);
      if(term == null)
        break Fail195;
      i_145 = term;
      term = c_30.invoke(context, x_144);
      if(term == null)
        break Fail195;
      p_145 = term;
      term = d_30.invoke(context, y_144);
      if(term == null)
        break Fail195;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQNewInstance_6, new IStrategoTerm[]{c_145, d_145, h_145, i_145, p_145, term}), checkListAnnos(termFactory, b_145));
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