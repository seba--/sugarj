package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_diff_0_2 extends Strategy 
{ 
  public static smart_diff_0_2 instance = new smart_diff_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_298, IStrategoTerm ref_b_298)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_298 = new TermReference(ref_a_298);
    TermReference b_298 = new TermReference(ref_b_298);
    context.push("smart_diff_0_2");
    Fail637:
    { 
      IStrategoTerm c_298 = null;
      IStrategoTerm m_298 = null;
      IStrategoTerm o_298 = null;
      term = extraction.constNil0;
      lifted416 lifted4160 = new lifted416();
      lifted4160.a_298 = a_298;
      lifted4160.b_298 = b_298;
      term = try_1_0.instance.invoke(context, term, lifted4160);
      if(term == null)
        break Fail637;
      c_298 = term;
      if(a_298.value == null || b_298.value == null)
        break Fail637;
      term = (IStrategoTerm)termFactory.makeListCons(a_298.value, termFactory.makeListCons(b_298.value, (IStrategoList)extraction.constNil0));
      m_298 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_298, NO_STRATEGIES, new IStrategoTerm[]{extraction.const588});
      if(term == null)
        break Fail637;
      o_298 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, c_298);
      if(term == null)
        break Fail637;
      term = put_syntax_sort_0_1.instance.invoke(context, o_298, term);
      if(term == null)
        break Fail637;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}