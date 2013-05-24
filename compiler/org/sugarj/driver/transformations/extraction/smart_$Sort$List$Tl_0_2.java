package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Sort$List$Tl_0_2 extends Strategy 
{ 
  public static smart_$Sort$List$Tl_0_2 instance = new smart_$Sort$List$Tl_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_239, IStrategoTerm ref_x_239)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_239 = new TermReference(ref_w_239);
    TermReference x_239 = new TermReference(ref_x_239);
    context.push("smart_SortListTl_0_2");
    Fail556:
    { 
      IStrategoTerm y_239 = null;
      IStrategoTerm k_240 = null;
      IStrategoTerm m_240 = null;
      term = extraction.constNil0;
      lifted324 lifted3240 = new lifted324();
      lifted3240.w_239 = w_239;
      lifted3240.x_239 = x_239;
      term = try_1_0.instance.invoke(context, term, lifted3240);
      if(term == null)
        break Fail556;
      y_239 = term;
      if(w_239.value == null || x_239.value == null)
        break Fail556;
      term = (IStrategoTerm)termFactory.makeListCons(w_239.value, termFactory.makeListCons(x_239.value, (IStrategoList)extraction.constNil0));
      k_240 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_240, NO_STRATEGIES, new IStrategoTerm[]{extraction.const516});
      if(term == null)
        break Fail556;
      m_240 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_239);
      if(term == null)
        break Fail556;
      term = put_syntax_sort_0_1.instance.invoke(context, m_240, term);
      if(term == null)
        break Fail556;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}