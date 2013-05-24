package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Sort$No$Args_0_1 extends Strategy 
{ 
  public static smart_$Sort$No$Args_0_1 instance = new smart_$Sort$No$Args_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_243)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_243 = new TermReference(ref_f_243);
    context.push("smart_SortNoArgs_0_1");
    Fail563:
    { 
      IStrategoTerm g_243 = null;
      IStrategoTerm o_243 = null;
      IStrategoTerm q_243 = null;
      term = extraction.constNil0;
      lifted331 lifted3310 = new lifted331();
      lifted3310.f_243 = f_243;
      term = try_1_0.instance.invoke(context, term, lifted3310);
      if(term == null)
        break Fail563;
      g_243 = term;
      if(f_243.value == null)
        break Fail563;
      term = (IStrategoTerm)termFactory.makeListCons(f_243.value, (IStrategoList)extraction.constNil0);
      o_243 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_243, NO_STRATEGIES, new IStrategoTerm[]{extraction.const523});
      if(term == null)
        break Fail563;
      q_243 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_243);
      if(term == null)
        break Fail563;
      term = put_syntax_sort_0_1.instance.invoke(context, q_243, term);
      if(term == null)
        break Fail563;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}