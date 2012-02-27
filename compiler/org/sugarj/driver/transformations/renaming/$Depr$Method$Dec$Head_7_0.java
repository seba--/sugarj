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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_19, Strategy d_19, Strategy e_19, Strategy f_19, Strategy g_19, Strategy h_19, Strategy i_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DeprMethodDecHead_7_0");
    Fail68:
    { 
      IStrategoTerm j_111 = null;
      IStrategoTerm b_111 = null;
      IStrategoTerm d_111 = null;
      IStrategoTerm e_111 = null;
      IStrategoTerm f_111 = null;
      IStrategoTerm g_111 = null;
      IStrategoTerm h_111 = null;
      IStrategoTerm i_111 = null;
      IStrategoTerm k_111 = null;
      IStrategoTerm l_111 = null;
      IStrategoTerm m_111 = null;
      IStrategoTerm p_111 = null;
      IStrategoTerm q_111 = null;
      IStrategoTerm r_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDeprMethodDecHead_7 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      b_111 = term.getSubterm(0);
      d_111 = term.getSubterm(1);
      e_111 = term.getSubterm(2);
      f_111 = term.getSubterm(3);
      g_111 = term.getSubterm(4);
      h_111 = term.getSubterm(5);
      i_111 = term.getSubterm(6);
      IStrategoList annos52 = term.getAnnotations();
      j_111 = annos52;
      term = c_19.invoke(context, b_111);
      if(term == null)
        break Fail68;
      k_111 = term;
      term = d_19.invoke(context, d_111);
      if(term == null)
        break Fail68;
      l_111 = term;
      term = e_19.invoke(context, e_111);
      if(term == null)
        break Fail68;
      m_111 = term;
      term = f_19.invoke(context, f_111);
      if(term == null)
        break Fail68;
      p_111 = term;
      term = g_19.invoke(context, g_111);
      if(term == null)
        break Fail68;
      q_111 = term;
      term = h_19.invoke(context, h_111);
      if(term == null)
        break Fail68;
      r_111 = term;
      term = i_19.invoke(context, i_111);
      if(term == null)
        break Fail68;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDeprMethodDecHead_7, new IStrategoTerm[]{k_111, l_111, m_111, p_111, q_111, r_111, term}), checkListAnnos(termFactory, j_111));
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