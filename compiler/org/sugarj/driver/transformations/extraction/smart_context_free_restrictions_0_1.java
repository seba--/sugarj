package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_context_free_restrictions_0_1 extends Strategy 
{ 
  public static smart_context_free_restrictions_0_1 instance = new smart_context_free_restrictions_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_104)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_104 = new TermReference(ref_w_104);
    context.push("smart_context_free_restrictions_0_1");
    Fail363:
    { 
      IStrategoTerm x_104 = null;
      IStrategoTerm j_105 = null;
      IStrategoTerm l_105 = null;
      term = extraction.constNil0;
      lifted81 lifted810 = new lifted81();
      lifted810.w_104 = w_104;
      term = try_1_0.instance.invoke(context, term, lifted810);
      if(term == null)
        break Fail363;
      lifted82 lifted820 = new lifted82();
      lifted820.w_104 = w_104;
      term = try_1_0.instance.invoke(context, term, lifted820);
      if(term == null)
        break Fail363;
      x_104 = term;
      if(w_104.value == null)
        break Fail363;
      term = (IStrategoTerm)termFactory.makeListCons(w_104.value, (IStrategoList)extraction.constNil0);
      j_105 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_105, NO_STRATEGIES, new IStrategoTerm[]{extraction.const353});
      if(term == null)
        break Fail363;
      l_105 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_104);
      if(term == null)
        break Fail363;
      term = put_syntax_sort_0_1.instance.invoke(context, l_105, term);
      if(term == null)
        break Fail363;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}