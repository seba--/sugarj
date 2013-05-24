package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$No$Anno$List_0_1 extends Strategy 
{ 
  public static smart_$No$Anno$List_0_1 instance = new smart_$No$Anno$List_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_231)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_231 = new TermReference(ref_q_231);
    context.push("smart_NoAnnoList_0_1");
    Fail547:
    { 
      IStrategoTerm r_231 = null;
      IStrategoTerm b_232 = null;
      IStrategoTerm d_232 = null;
      term = extraction.constNil0;
      lifted308 lifted3080 = new lifted308();
      lifted3080.q_231 = q_231;
      term = try_1_0.instance.invoke(context, term, lifted3080);
      if(term == null)
        break Fail547;
      r_231 = term;
      if(q_231.value == null)
        break Fail547;
      term = (IStrategoTerm)termFactory.makeListCons(q_231.value, (IStrategoList)extraction.constNil0);
      b_232 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_232, NO_STRATEGIES, new IStrategoTerm[]{extraction.const508});
      if(term == null)
        break Fail547;
      d_232 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, r_231);
      if(term == null)
        break Fail547;
      term = put_syntax_sort_0_1.instance.invoke(context, d_232, term);
      if(term == null)
        break Fail547;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}