package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_lit_0_1 extends Strategy 
{ 
  public static smart_lit_0_1 instance = new smart_lit_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_277)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_277 = new TermReference(ref_o_277);
    context.push("smart_lit_0_1");
    Fail617:
    { 
      IStrategoTerm p_277 = null;
      IStrategoTerm y_277 = null;
      IStrategoTerm a_278 = null;
      term = extraction.constNil0;
      lifted394 lifted3940 = new lifted394();
      lifted3940.o_277 = o_277;
      term = try_1_0.instance.invoke(context, term, lifted3940);
      if(term == null)
        break Fail617;
      p_277 = term;
      if(o_277.value == null)
        break Fail617;
      term = (IStrategoTerm)termFactory.makeListCons(o_277.value, (IStrategoList)extraction.constNil0);
      y_277 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_277, NO_STRATEGIES, new IStrategoTerm[]{extraction.const568});
      if(term == null)
        break Fail617;
      a_278 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, p_277);
      if(term == null)
        break Fail617;
      term = put_syntax_sort_0_1.instance.invoke(context, a_278, term);
      if(term == null)
        break Fail617;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}