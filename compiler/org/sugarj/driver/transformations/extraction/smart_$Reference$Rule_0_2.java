package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Reference$Rule_0_2 extends Strategy 
{ 
  public static smart_$Reference$Rule_0_2 instance = new smart_$Reference$Rule_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_125, IStrategoTerm ref_t_125)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference s_125 = new TermReference(ref_s_125);
    TermReference t_125 = new TermReference(ref_t_125);
    context.push("smart_ReferenceRule_0_2");
    Fail396:
    { 
      IStrategoTerm u_125 = null;
      IStrategoTerm e_126 = null;
      IStrategoTerm g_126 = null;
      term = extraction.constNil0;
      lifted127 lifted1270 = new lifted127();
      lifted1270.s_125 = s_125;
      lifted1270.t_125 = t_125;
      term = try_1_0.instance.invoke(context, term, lifted1270);
      if(term == null)
        break Fail396;
      u_125 = term;
      if(s_125.value == null || t_125.value == null)
        break Fail396;
      term = (IStrategoTerm)termFactory.makeListCons(s_125.value, termFactory.makeListCons(t_125.value, (IStrategoList)extraction.constNil0));
      e_126 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_126, NO_STRATEGIES, new IStrategoTerm[]{extraction.const161});
      if(term == null)
        break Fail396;
      g_126 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_125);
      if(term == null)
        break Fail396;
      term = put_syntax_sort_0_1.instance.invoke(context, g_126, term);
      if(term == null)
        break Fail396;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}