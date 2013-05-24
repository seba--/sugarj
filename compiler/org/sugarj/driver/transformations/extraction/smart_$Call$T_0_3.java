package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Call$T_0_3 extends Strategy 
{ 
  public static smart_$Call$T_0_3 instance = new smart_$Call$T_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_254, IStrategoTerm ref_b_254, IStrategoTerm ref_d_254)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_254 = new TermReference(ref_a_254);
    TermReference b_254 = new TermReference(ref_b_254);
    TermReference d_254 = new TermReference(ref_d_254);
    context.push("smart_CallT_0_3");
    Fail582:
    { 
      IStrategoTerm e_254 = null;
      IStrategoTerm s_254 = null;
      IStrategoTerm u_254 = null;
      term = extraction.constNil0;
      lifted350 lifted3500 = new lifted350();
      lifted3500.a_254 = a_254;
      lifted3500.b_254 = b_254;
      lifted3500.d_254 = d_254;
      term = try_1_0.instance.invoke(context, term, lifted3500);
      if(term == null)
        break Fail582;
      e_254 = term;
      if(a_254.value == null || (b_254.value == null || d_254.value == null))
        break Fail582;
      term = (IStrategoTerm)termFactory.makeListCons(a_254.value, termFactory.makeListCons(b_254.value, termFactory.makeListCons(d_254.value, (IStrategoList)extraction.constNil0)));
      s_254 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_254, NO_STRATEGIES, new IStrategoTerm[]{extraction.const535});
      if(term == null)
        break Fail582;
      u_254 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_254);
      if(term == null)
        break Fail582;
      term = put_syntax_sort_0_1.instance.invoke(context, u_254, term);
      if(term == null)
        break Fail582;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}