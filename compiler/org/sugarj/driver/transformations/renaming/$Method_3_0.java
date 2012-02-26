package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method_3_0 extends Strategy 
{ 
  public static $Method_3_0 instance = new $Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_15, Strategy h_15, Strategy i_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Method_3_0");
    Fail25:
    { 
      IStrategoTerm o_101 = null;
      IStrategoTerm j_101 = null;
      IStrategoTerm m_101 = null;
      IStrategoTerm n_101 = null;
      IStrategoTerm p_101 = null;
      IStrategoTerm q_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      j_101 = term.getSubterm(0);
      m_101 = term.getSubterm(1);
      n_101 = term.getSubterm(2);
      IStrategoList annos13 = term.getAnnotations();
      o_101 = annos13;
      term = g_15.invoke(context, j_101);
      if(term == null)
        break Fail25;
      p_101 = term;
      term = h_15.invoke(context, m_101);
      if(term == null)
        break Fail25;
      q_101 = term;
      term = i_15.invoke(context, n_101);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethod_3, new IStrategoTerm[]{p_101, q_101, term}), checkListAnnos(termFactory, o_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}