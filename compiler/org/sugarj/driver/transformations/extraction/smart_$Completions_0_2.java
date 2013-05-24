package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Completions_0_2 extends Strategy 
{ 
  public static smart_$Completions_0_2 instance = new smart_$Completions_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_115, IStrategoTerm ref_t_115)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference s_115 = new TermReference(ref_s_115);
    TermReference t_115 = new TermReference(ref_t_115);
    context.push("smart_Completions_0_2");
    Fail383:
    { 
      IStrategoTerm u_115 = null;
      IStrategoTerm e_116 = null;
      IStrategoTerm g_116 = null;
      term = extraction.constNil0;
      lifted104 lifted1040 = new lifted104();
      lifted1040.s_115 = s_115;
      lifted1040.t_115 = t_115;
      term = try_1_0.instance.invoke(context, term, lifted1040);
      if(term == null)
        break Fail383;
      u_115 = term;
      if(s_115.value == null || t_115.value == null)
        break Fail383;
      term = (IStrategoTerm)termFactory.makeListCons(s_115.value, termFactory.makeListCons(t_115.value, (IStrategoList)extraction.constNil0));
      e_116 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_116, NO_STRATEGIES, new IStrategoTerm[]{extraction.const374});
      if(term == null)
        break Fail383;
      g_116 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_115);
      if(term == null)
        break Fail383;
      term = put_syntax_sort_0_1.instance.invoke(context, g_116, term);
      if(term == null)
        break Fail383;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}