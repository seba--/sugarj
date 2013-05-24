package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Build$Default_0_1 extends Strategy 
{ 
  public static smart_$Build$Default_0_1 instance = new smart_$Build$Default_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_229)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_229 = new TermReference(ref_a_229);
    context.push("smart_BuildDefault_0_1");
    Fail544:
    { 
      IStrategoTerm b_229 = null;
      IStrategoTerm l_229 = null;
      IStrategoTerm n_229 = null;
      term = extraction.constNil0;
      lifted304 lifted3040 = new lifted304();
      lifted3040.a_229 = a_229;
      term = try_1_0.instance.invoke(context, term, lifted3040);
      if(term == null)
        break Fail544;
      b_229 = term;
      if(a_229.value == null)
        break Fail544;
      term = (IStrategoTerm)termFactory.makeListCons(a_229.value, (IStrategoList)extraction.constNil0);
      l_229 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", l_229, NO_STRATEGIES, new IStrategoTerm[]{extraction.const506});
      if(term == null)
        break Fail544;
      n_229 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, b_229);
      if(term == null)
        break Fail544;
      term = put_syntax_sort_0_1.instance.invoke(context, n_229, term);
      if(term == null)
        break Fail544;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}