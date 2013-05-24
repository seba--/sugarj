package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$L$Choice_0_2 extends Strategy 
{ 
  public static smart_$L$Choice_0_2 instance = new smart_$L$Choice_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_208, IStrategoTerm ref_x_208)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_208 = new TermReference(ref_w_208);
    TermReference x_208 = new TermReference(ref_x_208);
    context.push("smart_LChoice_0_2");
    Fail510:
    { 
      IStrategoTerm y_208 = null;
      IStrategoTerm k_209 = null;
      IStrategoTerm m_209 = null;
      term = extraction.constNil0;
      lifted269 lifted2690 = new lifted269();
      lifted2690.w_208 = w_208;
      lifted2690.x_208 = x_208;
      term = try_1_0.instance.invoke(context, term, lifted2690);
      if(term == null)
        break Fail510;
      y_208 = term;
      if(w_208.value == null || x_208.value == null)
        break Fail510;
      term = (IStrategoTerm)termFactory.makeListCons(w_208.value, termFactory.makeListCons(x_208.value, (IStrategoList)extraction.constNil0));
      k_209 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_209, NO_STRATEGIES, new IStrategoTerm[]{extraction.const475});
      if(term == null)
        break Fail510;
      m_209 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_208);
      if(term == null)
        break Fail510;
      term = put_syntax_sort_0_1.instance.invoke(context, m_209, term);
      if(term == null)
        break Fail510;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}