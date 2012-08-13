package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Abstract$Method$Dec_6_0 extends Strategy 
{ 
  public static $Abstract$Method$Dec_6_0 instance = new $Abstract$Method$Dec_6_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_22, Strategy n_22, Strategy o_22, Strategy p_22, Strategy q_22, Strategy r_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AbstractMethodDec_6_0");
    Fail94:
    { 
      IStrategoTerm s_118 = null;
      IStrategoTerm m_118 = null;
      IStrategoTerm n_118 = null;
      IStrategoTerm o_118 = null;
      IStrategoTerm p_118 = null;
      IStrategoTerm q_118 = null;
      IStrategoTerm r_118 = null;
      IStrategoTerm t_118 = null;
      IStrategoTerm u_118 = null;
      IStrategoTerm v_118 = null;
      IStrategoTerm w_118 = null;
      IStrategoTerm x_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAbstractMethodDec_6 != ((IStrategoAppl)term).getConstructor())
        break Fail94;
      m_118 = term.getSubterm(0);
      n_118 = term.getSubterm(1);
      o_118 = term.getSubterm(2);
      p_118 = term.getSubterm(3);
      q_118 = term.getSubterm(4);
      r_118 = term.getSubterm(5);
      IStrategoList annos75 = term.getAnnotations();
      s_118 = annos75;
      term = m_22.invoke(context, m_118);
      if(term == null)
        break Fail94;
      t_118 = term;
      term = n_22.invoke(context, n_118);
      if(term == null)
        break Fail94;
      u_118 = term;
      term = o_22.invoke(context, o_118);
      if(term == null)
        break Fail94;
      v_118 = term;
      term = p_22.invoke(context, p_118);
      if(term == null)
        break Fail94;
      w_118 = term;
      term = q_22.invoke(context, q_118);
      if(term == null)
        break Fail94;
      x_118 = term;
      term = r_22.invoke(context, r_118);
      if(term == null)
        break Fail94;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAbstractMethodDec_6, new IStrategoTerm[]{t_118, u_118, v_118, w_118, x_118, term}), checkListAnnos(termFactory, s_118));
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