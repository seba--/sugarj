package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Switch$Case_0_2 extends Strategy 
{ 
  public static smart_$Switch$Case_0_2 instance = new smart_$Switch$Case_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_226, IStrategoTerm ref_j_226)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_226 = new TermReference(ref_i_226);
    TermReference j_226 = new TermReference(ref_j_226);
    context.push("smart_SwitchCase_0_2");
    Fail539:
    { 
      IStrategoTerm k_226 = null;
      IStrategoTerm u_226 = null;
      IStrategoTerm w_226 = null;
      term = extraction.constNil0;
      lifted298 lifted2980 = new lifted298();
      lifted2980.i_226 = i_226;
      lifted2980.j_226 = j_226;
      term = try_1_0.instance.invoke(context, term, lifted2980);
      if(term == null)
        break Fail539;
      k_226 = term;
      if(i_226.value == null || j_226.value == null)
        break Fail539;
      term = (IStrategoTerm)termFactory.makeListCons(i_226.value, termFactory.makeListCons(j_226.value, (IStrategoList)extraction.constNil0));
      u_226 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_226, NO_STRATEGIES, new IStrategoTerm[]{extraction.const195});
      if(term == null)
        break Fail539;
      w_226 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_226);
      if(term == null)
        break Fail539;
      term = put_syntax_sort_0_1.instance.invoke(context, w_226, term);
      if(term == null)
        break Fail539;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}