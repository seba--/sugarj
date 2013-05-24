package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Seq_0_2 extends Strategy 
{ 
  public static smart_$Seq_0_2 instance = new smart_$Seq_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_199, IStrategoTerm ref_k_199)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_199 = new TermReference(ref_j_199);
    TermReference k_199 = new TermReference(ref_k_199);
    context.push("smart_Seq_0_2");
    Fail497:
    { 
      IStrategoTerm l_199 = null;
      IStrategoTerm n_200 = null;
      IStrategoTerm p_200 = null;
      term = extraction.constNil0;
      lifted253 lifted2530 = new lifted253();
      lifted2530.j_199 = j_199;
      lifted2530.k_199 = k_199;
      term = try_1_0.instance.invoke(context, term, lifted2530);
      if(term == null)
        break Fail497;
      lifted254 lifted2540 = new lifted254();
      lifted2540.j_199 = j_199;
      lifted2540.k_199 = k_199;
      term = try_1_0.instance.invoke(context, term, lifted2540);
      if(term == null)
        break Fail497;
      lifted255 lifted2550 = new lifted255();
      lifted2550.j_199 = j_199;
      lifted2550.k_199 = k_199;
      term = try_1_0.instance.invoke(context, term, lifted2550);
      if(term == null)
        break Fail497;
      l_199 = term;
      if(j_199.value == null || k_199.value == null)
        break Fail497;
      term = (IStrategoTerm)termFactory.makeListCons(j_199.value, termFactory.makeListCons(k_199.value, (IStrategoList)extraction.constNil0));
      n_200 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_200, NO_STRATEGIES, new IStrategoTerm[]{extraction.const463});
      if(term == null)
        break Fail497;
      p_200 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_199);
      if(term == null)
        break Fail497;
      term = put_syntax_sort_0_1.instance.invoke(context, p_200, term);
      if(term == null)
        break Fail497;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}