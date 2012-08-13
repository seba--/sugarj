package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Depr$Method$Dec$Head_7_0 extends Strategy 
{ 
  public static $Depr$Method$Dec$Head_7_0 instance = new $Depr$Method$Dec$Head_7_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_24, Strategy g_24, Strategy h_24, Strategy i_24, Strategy j_24, Strategy k_24, Strategy l_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DeprMethodDecHead_7_0");
    Fail114:
    { 
      IStrategoTerm p_123 = null;
      IStrategoTerm i_123 = null;
      IStrategoTerm j_123 = null;
      IStrategoTerm k_123 = null;
      IStrategoTerm l_123 = null;
      IStrategoTerm m_123 = null;
      IStrategoTerm n_123 = null;
      IStrategoTerm o_123 = null;
      IStrategoTerm q_123 = null;
      IStrategoTerm r_123 = null;
      IStrategoTerm s_123 = null;
      IStrategoTerm t_123 = null;
      IStrategoTerm u_123 = null;
      IStrategoTerm v_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDeprMethodDecHead_7 != ((IStrategoAppl)term).getConstructor())
        break Fail114;
      i_123 = term.getSubterm(0);
      j_123 = term.getSubterm(1);
      k_123 = term.getSubterm(2);
      l_123 = term.getSubterm(3);
      m_123 = term.getSubterm(4);
      n_123 = term.getSubterm(5);
      o_123 = term.getSubterm(6);
      IStrategoList annos93 = term.getAnnotations();
      p_123 = annos93;
      term = f_24.invoke(context, i_123);
      if(term == null)
        break Fail114;
      q_123 = term;
      term = g_24.invoke(context, j_123);
      if(term == null)
        break Fail114;
      r_123 = term;
      term = h_24.invoke(context, k_123);
      if(term == null)
        break Fail114;
      s_123 = term;
      term = i_24.invoke(context, l_123);
      if(term == null)
        break Fail114;
      t_123 = term;
      term = j_24.invoke(context, m_123);
      if(term == null)
        break Fail114;
      u_123 = term;
      term = k_24.invoke(context, n_123);
      if(term == null)
        break Fail114;
      v_123 = term;
      term = l_24.invoke(context, o_123);
      if(term == null)
        break Fail114;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDeprMethodDecHead_7, new IStrategoTerm[]{q_123, r_123, s_123, t_123, u_123, v_123, term}), checkListAnnos(termFactory, p_123));
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