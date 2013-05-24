package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_conc_0_2 extends Strategy 
{ 
  public static smart_conc_0_2 instance = new smart_conc_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_286, IStrategoTerm ref_j_286)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_286 = new TermReference(ref_i_286);
    TermReference j_286 = new TermReference(ref_j_286);
    context.push("smart_conc_0_2");
    Fail632:
    { 
      IStrategoTerm k_286 = null;
      IStrategoTerm u_286 = null;
      IStrategoTerm w_286 = null;
      term = extraction.constNil0;
      lifted409 lifted4090 = new lifted409();
      lifted4090.i_286 = i_286;
      lifted4090.j_286 = j_286;
      term = try_1_0.instance.invoke(context, term, lifted4090);
      if(term == null)
        break Fail632;
      k_286 = term;
      if(i_286.value == null || j_286.value == null)
        break Fail632;
      term = (IStrategoTerm)termFactory.makeListCons(i_286.value, termFactory.makeListCons(j_286.value, (IStrategoList)extraction.constNil0));
      u_286 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_286, NO_STRATEGIES, new IStrategoTerm[]{extraction.const583});
      if(term == null)
        break Fail632;
      w_286 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_286);
      if(term == null)
        break Fail632;
      term = put_syntax_sort_0_1.instance.invoke(context, w_286, term);
      if(term == null)
        break Fail632;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}