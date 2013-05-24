package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_parameterized_sort_0_2 extends Strategy 
{ 
  public static smart_parameterized_sort_0_2 instance = new smart_parameterized_sort_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_281, IStrategoTerm ref_w_281)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_281 = new TermReference(ref_v_281);
    TermReference w_281 = new TermReference(ref_w_281);
    context.push("smart_parameterized_sort_0_2");
    Fail624:
    { 
      IStrategoTerm x_281 = null;
      IStrategoTerm j_283 = null;
      IStrategoTerm m_283 = null;
      term = extraction.constNil0;
      lifted401 lifted4010 = new lifted401();
      lifted4010.v_281 = v_281;
      lifted4010.w_281 = w_281;
      term = try_1_0.instance.invoke(context, term, lifted4010);
      if(term == null)
        break Fail624;
      x_281 = term;
      if(v_281.value == null || w_281.value == null)
        break Fail624;
      term = (IStrategoTerm)termFactory.makeListCons(v_281.value, termFactory.makeListCons(w_281.value, (IStrategoList)extraction.constNil0));
      j_283 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_283, NO_STRATEGIES, new IStrategoTerm[]{extraction.const575});
      if(term == null)
        break Fail624;
      m_283 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_281);
      if(term == null)
        break Fail624;
      term = put_syntax_sort_0_1.instance.invoke(context, m_283, term);
      if(term == null)
        break Fail624;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}