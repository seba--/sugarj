package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_with_arguments_0_2 extends Strategy 
{ 
  public static smart_with_arguments_0_2 instance = new smart_with_arguments_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_302, IStrategoTerm ref_r_302)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_302 = new TermReference(ref_q_302);
    TermReference r_302 = new TermReference(ref_r_302);
    context.push("smart_with_arguments_0_2");
    Fail647:
    { 
      IStrategoTerm s_302 = null;
      IStrategoTerm j_303 = null;
      IStrategoTerm l_303 = null;
      term = extraction.constNil0;
      lifted428 lifted4280 = new lifted428();
      lifted4280.q_302 = q_302;
      lifted4280.r_302 = r_302;
      term = try_1_0.instance.invoke(context, term, lifted4280);
      if(term == null)
        break Fail647;
      s_302 = term;
      if(q_302.value == null || r_302.value == null)
        break Fail647;
      term = (IStrategoTerm)termFactory.makeListCons(q_302.value, termFactory.makeListCons(r_302.value, (IStrategoList)extraction.constNil0));
      j_303 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_303, NO_STRATEGIES, new IStrategoTerm[]{extraction.const597});
      if(term == null)
        break Fail647;
      l_303 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_302);
      if(term == null)
        break Fail647;
      term = put_syntax_sort_0_1.instance.invoke(context, l_303, term);
      if(term == null)
        break Fail647;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}