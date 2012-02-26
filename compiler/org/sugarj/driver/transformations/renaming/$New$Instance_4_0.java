package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $New$Instance_4_0 extends Strategy 
{ 
  public static $New$Instance_4_0 instance = new $New$Instance_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_24, Strategy u_24, Strategy v_24, Strategy w_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NewInstance_4_0");
    Fail148:
    { 
      IStrategoTerm n_127 = null;
      IStrategoTerm j_127 = null;
      IStrategoTerm k_127 = null;
      IStrategoTerm l_127 = null;
      IStrategoTerm m_127 = null;
      IStrategoTerm o_127 = null;
      IStrategoTerm p_127 = null;
      IStrategoTerm q_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNewInstance_4 != ((IStrategoAppl)term).getConstructor())
        break Fail148;
      j_127 = term.getSubterm(0);
      k_127 = term.getSubterm(1);
      l_127 = term.getSubterm(2);
      m_127 = term.getSubterm(3);
      IStrategoList annos130 = term.getAnnotations();
      n_127 = annos130;
      term = t_24.invoke(context, j_127);
      if(term == null)
        break Fail148;
      o_127 = term;
      term = u_24.invoke(context, k_127);
      if(term == null)
        break Fail148;
      p_127 = term;
      term = v_24.invoke(context, l_127);
      if(term == null)
        break Fail148;
      q_127 = term;
      term = w_24.invoke(context, m_127);
      if(term == null)
        break Fail148;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNewInstance_4, new IStrategoTerm[]{o_127, p_127, q_127, term}), checkListAnnos(termFactory, n_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}