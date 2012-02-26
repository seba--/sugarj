package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Dec$Head_6_0 extends Strategy 
{ 
  public static $Method$Dec$Head_6_0 instance = new $Method$Dec$Head_6_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_19, Strategy c_19, Strategy d_19, Strategy e_19, Strategy f_19, Strategy g_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodDecHead_6_0");
    Fail67:
    { 
      IStrategoTerm r_111 = null;
      IStrategoTerm j_111 = null;
      IStrategoTerm k_111 = null;
      IStrategoTerm l_111 = null;
      IStrategoTerm m_111 = null;
      IStrategoTerm p_111 = null;
      IStrategoTerm q_111 = null;
      IStrategoTerm s_111 = null;
      IStrategoTerm t_111 = null;
      IStrategoTerm u_111 = null;
      IStrategoTerm v_111 = null;
      IStrategoTerm w_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      j_111 = term.getSubterm(0);
      k_111 = term.getSubterm(1);
      l_111 = term.getSubterm(2);
      m_111 = term.getSubterm(3);
      p_111 = term.getSubterm(4);
      q_111 = term.getSubterm(5);
      IStrategoList annos53 = term.getAnnotations();
      r_111 = annos53;
      term = b_19.invoke(context, j_111);
      if(term == null)
        break Fail67;
      s_111 = term;
      term = c_19.invoke(context, k_111);
      if(term == null)
        break Fail67;
      t_111 = term;
      term = d_19.invoke(context, l_111);
      if(term == null)
        break Fail67;
      u_111 = term;
      term = e_19.invoke(context, m_111);
      if(term == null)
        break Fail67;
      v_111 = term;
      term = f_19.invoke(context, p_111);
      if(term == null)
        break Fail67;
      w_111 = term;
      term = g_19.invoke(context, q_111);
      if(term == null)
        break Fail67;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodDecHead_6, new IStrategoTerm[]{s_111, t_111, u_111, v_111, w_111, term}), checkListAnnos(termFactory, r_111));
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