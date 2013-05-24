package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Analyses_0_1 extends Strategy 
{ 
  public static smart_$Analyses_0_1 instance = new smart_$Analyses_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_106)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_106 = new TermReference(ref_p_106);
    context.push("smart_Analyses_0_1");
    Fail366:
    { 
      IStrategoTerm q_106 = null;
      IStrategoTerm y_106 = null;
      IStrategoTerm a_107 = null;
      term = extraction.constNil0;
      lifted86 lifted860 = new lifted86();
      lifted860.p_106 = p_106;
      term = try_1_0.instance.invoke(context, term, lifted860);
      if(term == null)
        break Fail366;
      q_106 = term;
      if(p_106.value == null)
        break Fail366;
      term = (IStrategoTerm)termFactory.makeListCons(p_106.value, (IStrategoList)extraction.constNil0);
      y_106 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_106, NO_STRATEGIES, new IStrategoTerm[]{extraction.const357});
      if(term == null)
        break Fail366;
      a_107 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_106);
      if(term == null)
        break Fail366;
      term = put_syntax_sort_0_1.instance.invoke(context, a_107, term);
      if(term == null)
        break Fail366;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}