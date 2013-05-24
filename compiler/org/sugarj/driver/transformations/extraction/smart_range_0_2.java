package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_range_0_2 extends Strategy 
{ 
  public static smart_range_0_2 instance = new smart_range_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_285, IStrategoTerm ref_t_285)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference s_285 = new TermReference(ref_s_285);
    TermReference t_285 = new TermReference(ref_t_285);
    context.push("smart_range_0_2");
    Fail631:
    { 
      IStrategoTerm u_285 = null;
      IStrategoTerm f_286 = null;
      IStrategoTerm h_286 = null;
      term = extraction.constNil0;
      lifted408 lifted4080 = new lifted408();
      lifted4080.s_285 = s_285;
      lifted4080.t_285 = t_285;
      term = try_1_0.instance.invoke(context, term, lifted4080);
      if(term == null)
        break Fail631;
      u_285 = term;
      if(s_285.value == null || t_285.value == null)
        break Fail631;
      term = (IStrategoTerm)termFactory.makeListCons(s_285.value, termFactory.makeListCons(t_285.value, (IStrategoList)extraction.constNil0));
      f_286 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_286, NO_STRATEGIES, new IStrategoTerm[]{extraction.const582});
      if(term == null)
        break Fail631;
      h_286 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_285);
      if(term == null)
        break Fail631;
      term = put_syntax_sort_0_1.instance.invoke(context, h_286, term);
      if(term == null)
        break Fail631;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}