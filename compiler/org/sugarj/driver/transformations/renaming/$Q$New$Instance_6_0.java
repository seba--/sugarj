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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_38, Strategy h_38, Strategy i_38, Strategy j_38, Strategy k_38, Strategy l_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QNewInstance_6_0");
    Fail185:
    { 
      IStrategoTerm r_167 = null;
      IStrategoTerm k_167 = null;
      IStrategoTerm l_167 = null;
      IStrategoTerm n_167 = null;
      IStrategoTerm o_167 = null;
      IStrategoTerm p_167 = null;
      IStrategoTerm q_167 = null;
      IStrategoTerm s_167 = null;
      IStrategoTerm t_167 = null;
      IStrategoTerm v_167 = null;
      IStrategoTerm w_167 = null;
      IStrategoTerm x_167 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consQNewInstance_6 != ((IStrategoAppl)term).getConstructor())
        break Fail185;
      k_167 = term.getSubterm(0);
      l_167 = term.getSubterm(1);
      n_167 = term.getSubterm(2);
      o_167 = term.getSubterm(3);
      p_167 = term.getSubterm(4);
      q_167 = term.getSubterm(5);
      IStrategoList annos155 = term.getAnnotations();
      r_167 = annos155;
      term = g_38.invoke(context, k_167);
      if(term == null)
        break Fail185;
      s_167 = term;
      term = h_38.invoke(context, l_167);
      if(term == null)
        break Fail185;
      t_167 = term;
      term = i_38.invoke(context, n_167);
      if(term == null)
        break Fail185;
      v_167 = term;
      term = j_38.invoke(context, o_167);
      if(term == null)
        break Fail185;
      w_167 = term;
      term = k_38.invoke(context, p_167);
      if(term == null)
        break Fail185;
      x_167 = term;
      term = l_38.invoke(context, q_167);
      if(term == null)
        break Fail185;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consQNewInstance_6, new IStrategoTerm[]{s_167, t_167, v_167, w_167, x_167, term}), checkListAnnos(termFactory, r_167));
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