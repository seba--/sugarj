package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Depr$Abstract$Method$Dec_7_0 extends Strategy 
{ 
  public static $Depr$Abstract$Method$Dec_7_0 instance = new $Depr$Abstract$Method$Dec_7_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_30, Strategy o_30, Strategy p_30, Strategy q_30, Strategy r_30, Strategy s_30, Strategy t_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DeprAbstractMethodDec_7_0");
    Fail83:
    { 
      IStrategoTerm z_138 = null;
      IStrategoTerm p_138 = null;
      IStrategoTerm q_138 = null;
      IStrategoTerm r_138 = null;
      IStrategoTerm s_138 = null;
      IStrategoTerm w_138 = null;
      IStrategoTerm x_138 = null;
      IStrategoTerm y_138 = null;
      IStrategoTerm a_139 = null;
      IStrategoTerm b_139 = null;
      IStrategoTerm c_139 = null;
      IStrategoTerm d_139 = null;
      IStrategoTerm e_139 = null;
      IStrategoTerm f_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDeprAbstractMethodDec_7 != ((IStrategoAppl)term).getConstructor())
        break Fail83;
      p_138 = term.getSubterm(0);
      q_138 = term.getSubterm(1);
      r_138 = term.getSubterm(2);
      s_138 = term.getSubterm(3);
      w_138 = term.getSubterm(4);
      x_138 = term.getSubterm(5);
      y_138 = term.getSubterm(6);
      IStrategoList annos59 = term.getAnnotations();
      z_138 = annos59;
      term = n_30.invoke(context, p_138);
      if(term == null)
        break Fail83;
      a_139 = term;
      term = o_30.invoke(context, q_138);
      if(term == null)
        break Fail83;
      b_139 = term;
      term = p_30.invoke(context, r_138);
      if(term == null)
        break Fail83;
      c_139 = term;
      term = q_30.invoke(context, s_138);
      if(term == null)
        break Fail83;
      d_139 = term;
      term = r_30.invoke(context, w_138);
      if(term == null)
        break Fail83;
      e_139 = term;
      term = s_30.invoke(context, x_138);
      if(term == null)
        break Fail83;
      f_139 = term;
      term = t_30.invoke(context, y_138);
      if(term == null)
        break Fail83;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDeprAbstractMethodDec_7, new IStrategoTerm[]{a_139, b_139, c_139, d_139, e_139, f_139, term}), checkListAnnos(termFactory, z_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 7 || targs.length != 0)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, sargs[0], sargs[1], sargs[2], sargs[3], sargs[4], sargs[5], sargs[6]);
  }
}