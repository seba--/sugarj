package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Completion$Trigger_0_2 extends Strategy 
{ 
  public static smart_$Completion$Trigger_0_2 instance = new smart_$Completion$Trigger_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_121, IStrategoTerm ref_q_121)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_121 = new TermReference(ref_p_121);
    TermReference q_121 = new TermReference(ref_q_121);
    context.push("smart_CompletionTrigger_0_2");
    Fail389:
    { 
      IStrategoTerm s_121 = null;
      IStrategoTerm d_122 = null;
      IStrategoTerm f_122 = null;
      term = extraction.constNil0;
      lifted115 lifted1150 = new lifted115();
      lifted1150.p_121 = p_121;
      lifted1150.q_121 = q_121;
      term = try_1_0.instance.invoke(context, term, lifted1150);
      if(term == null)
        break Fail389;
      s_121 = term;
      if(p_121.value == null || q_121.value == null)
        break Fail389;
      term = (IStrategoTerm)termFactory.makeListCons(p_121.value, termFactory.makeListCons(q_121.value, (IStrategoList)extraction.constNil0));
      d_122 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_122, NO_STRATEGIES, new IStrategoTerm[]{extraction.const380});
      if(term == null)
        break Fail389;
      f_122 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_121);
      if(term == null)
        break Fail389;
      term = put_syntax_sort_0_1.instance.invoke(context, f_122, term);
      if(term == null)
        break Fail389;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}