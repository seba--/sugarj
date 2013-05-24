package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_context_free_syntax_0_1 extends Strategy 
{ 
  public static smart_context_free_syntax_0_1 instance = new smart_context_free_syntax_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_99)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_99 = new TermReference(ref_t_99);
    context.push("smart_context_free_syntax_0_1");
    Fail355:
    { 
      IStrategoTerm u_99 = null;
      IStrategoTerm g_100 = null;
      IStrategoTerm i_100 = null;
      term = extraction.constNil0;
      lifted65 lifted650 = new lifted65();
      lifted650.t_99 = t_99;
      term = try_1_0.instance.invoke(context, term, lifted650);
      if(term == null)
        break Fail355;
      lifted66 lifted660 = new lifted66();
      lifted660.t_99 = t_99;
      term = try_1_0.instance.invoke(context, term, lifted660);
      if(term == null)
        break Fail355;
      u_99 = term;
      if(t_99.value == null)
        break Fail355;
      term = (IStrategoTerm)termFactory.makeListCons(t_99.value, (IStrategoList)extraction.constNil0);
      g_100 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_100, NO_STRATEGIES, new IStrategoTerm[]{extraction.const345});
      if(term == null)
        break Fail355;
      i_100 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_99);
      if(term == null)
        break Fail355;
      term = put_syntax_sort_0_1.instance.invoke(context, i_100, term);
      if(term == null)
        break Fail355;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}