package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Outline$Rule_0_1 extends Strategy 
{ 
  public static smart_$Outline$Rule_0_1 instance = new smart_$Outline$Rule_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_146)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_146 = new TermReference(ref_t_146);
    context.push("smart_OutlineRule_0_1");
    Fail426:
    { 
      IStrategoTerm u_146 = null;
      IStrategoTerm g_147 = null;
      IStrategoTerm k_147 = null;
      term = extraction.constNil0;
      lifted160 lifted1600 = new lifted160();
      lifted1600.t_146 = t_146;
      term = try_1_0.instance.invoke(context, term, lifted1600);
      if(term == null)
        break Fail426;
      u_146 = term;
      if(t_146.value == null)
        break Fail426;
      term = (IStrategoTerm)termFactory.makeListCons(t_146.value, (IStrategoList)extraction.constNil0);
      g_147 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_147, NO_STRATEGIES, new IStrategoTerm[]{extraction.const130});
      if(term == null)
        break Fail426;
      k_147 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_146);
      if(term == null)
        break Fail426;
      term = put_syntax_sort_0_1.instance.invoke(context, k_147, term);
      if(term == null)
        break Fail426;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}