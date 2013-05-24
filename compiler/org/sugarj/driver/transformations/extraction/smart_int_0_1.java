package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_int_0_1 extends Strategy 
{ 
  public static smart_int_0_1 instance = new smart_int_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_324)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_324 = new TermReference(ref_a_324);
    context.push("smart_int_0_1");
    Fail687:
    { 
      IStrategoTerm b_324 = null;
      IStrategoTerm i_324 = null;
      IStrategoTerm k_324 = null;
      term = extraction.constNil0;
      lifted468 lifted4680 = new lifted468();
      lifted4680.a_324 = a_324;
      term = try_1_0.instance.invoke(context, term, lifted4680);
      if(term == null)
        break Fail687;
      b_324 = term;
      if(a_324.value == null)
        break Fail687;
      term = (IStrategoTerm)termFactory.makeListCons(a_324.value, (IStrategoList)extraction.constNil0);
      i_324 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", i_324, NO_STRATEGIES, new IStrategoTerm[]{extraction.const635});
      if(term == null)
        break Fail687;
      k_324 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, b_324);
      if(term == null)
        break Fail687;
      term = put_syntax_sort_0_1.instance.invoke(context, k_324, term);
      if(term == null)
        break Fail687;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}