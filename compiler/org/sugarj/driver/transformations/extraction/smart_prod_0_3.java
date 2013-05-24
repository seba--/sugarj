package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_prod_0_3 extends Strategy 
{ 
  public static smart_prod_0_3 instance = new smart_prod_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_328, IStrategoTerm ref_k_328, IStrategoTerm ref_l_328)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_328 = new TermReference(ref_j_328);
    TermReference k_328 = new TermReference(ref_k_328);
    TermReference l_328 = new TermReference(ref_l_328);
    context.push("smart_prod_0_3");
    Fail696:
    { 
      IStrategoTerm m_328 = null;
      IStrategoTerm a_329 = null;
      IStrategoTerm c_329 = null;
      term = extraction.constNil0;
      lifted477 lifted4770 = new lifted477();
      lifted4770.j_328 = j_328;
      lifted4770.k_328 = k_328;
      lifted4770.l_328 = l_328;
      term = try_1_0.instance.invoke(context, term, lifted4770);
      if(term == null)
        break Fail696;
      m_328 = term;
      if(j_328.value == null || (k_328.value == null || l_328.value == null))
        break Fail696;
      term = (IStrategoTerm)termFactory.makeListCons(j_328.value, termFactory.makeListCons(k_328.value, termFactory.makeListCons(l_328.value, (IStrategoList)extraction.constNil0)));
      a_329 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_329, NO_STRATEGIES, new IStrategoTerm[]{extraction.const644});
      if(term == null)
        break Fail696;
      c_329 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, m_328);
      if(term == null)
        break Fail696;
      term = put_syntax_sort_0_1.instance.invoke(context, c_329, term);
      if(term == null)
        break Fail696;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}