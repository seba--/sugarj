package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Strategy_0_1 extends Strategy 
{ 
  public static smart_$Strategy_0_1 instance = new smart_$Strategy_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_155)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_155 = new TermReference(ref_a_155);
    context.push("smart_Strategy_0_1");
    Fail433:
    { 
      IStrategoTerm b_155 = null;
      IStrategoTerm n_155 = null;
      IStrategoTerm q_155 = null;
      term = extraction.constNil0;
      lifted177 lifted1770 = new lifted177();
      lifted1770.a_155 = a_155;
      term = try_1_0.instance.invoke(context, term, lifted1770);
      if(term == null)
        break Fail433;
      b_155 = term;
      if(a_155.value == null)
        break Fail433;
      term = (IStrategoTerm)termFactory.makeListCons(a_155.value, (IStrategoList)extraction.constNil0);
      n_155 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_155, NO_STRATEGIES, new IStrategoTerm[]{extraction.const7});
      if(term == null)
        break Fail433;
      q_155 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, b_155);
      if(term == null)
        break Fail433;
      term = put_syntax_sort_0_1.instance.invoke(context, q_155, term);
      if(term == null)
        break Fail433;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}