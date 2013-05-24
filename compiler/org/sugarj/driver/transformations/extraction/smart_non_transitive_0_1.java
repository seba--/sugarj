package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_non_transitive_0_1 extends Strategy 
{ 
  public static smart_non_transitive_0_1 instance = new smart_non_transitive_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_303)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_303 = new TermReference(ref_m_303);
    context.push("smart_non_transitive_0_1");
    Fail648:
    { 
      IStrategoTerm n_303 = null;
      IStrategoTerm v_303 = null;
      IStrategoTerm x_303 = null;
      term = extraction.constNil0;
      lifted429 lifted4290 = new lifted429();
      lifted4290.m_303 = m_303;
      term = try_1_0.instance.invoke(context, term, lifted4290);
      if(term == null)
        break Fail648;
      n_303 = term;
      if(m_303.value == null)
        break Fail648;
      term = (IStrategoTerm)termFactory.makeListCons(m_303.value, (IStrategoList)extraction.constNil0);
      v_303 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_303, NO_STRATEGIES, new IStrategoTerm[]{extraction.const598});
      if(term == null)
        break Fail648;
      x_303 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_303);
      if(term == null)
        break Fail648;
      term = put_syntax_sort_0_1.instance.invoke(context, x_303, term);
      if(term == null)
        break Fail648;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}