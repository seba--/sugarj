package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_tuple_0_2 extends Strategy 
{ 
  public static smart_tuple_0_2 instance = new smart_tuple_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_310, IStrategoTerm ref_f_310)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_310 = new TermReference(ref_e_310);
    TermReference f_310 = new TermReference(ref_f_310);
    context.push("smart_tuple_0_2");
    Fail661:
    { 
      IStrategoTerm g_310 = null;
      IStrategoTerm q_310 = null;
      IStrategoTerm s_310 = null;
      term = extraction.constNil0;
      lifted442 lifted4420 = new lifted442();
      lifted4420.e_310 = e_310;
      lifted4420.f_310 = f_310;
      term = try_1_0.instance.invoke(context, term, lifted4420);
      if(term == null)
        break Fail661;
      g_310 = term;
      if(e_310.value == null || f_310.value == null)
        break Fail661;
      term = (IStrategoTerm)termFactory.makeListCons(e_310.value, termFactory.makeListCons(f_310.value, (IStrategoList)extraction.constNil0));
      q_310 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", q_310, NO_STRATEGIES, new IStrategoTerm[]{extraction.const610});
      if(term == null)
        break Fail661;
      s_310 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_310);
      if(term == null)
        break Fail661;
      term = put_syntax_sort_0_1.instance.invoke(context, s_310, term);
      if(term == null)
        break Fail661;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}