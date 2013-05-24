package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Switch$Choice_0_3 extends Strategy 
{ 
  public static smart_$Switch$Choice_0_3 instance = new smart_$Switch$Choice_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_225, IStrategoTerm ref_q_225, IStrategoTerm ref_r_225)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_225 = new TermReference(ref_p_225);
    TermReference q_225 = new TermReference(ref_q_225);
    TermReference r_225 = new TermReference(ref_r_225);
    context.push("smart_SwitchChoice_0_3");
    Fail538:
    { 
      IStrategoTerm s_225 = null;
      IStrategoTerm f_226 = null;
      IStrategoTerm h_226 = null;
      term = extraction.constNil0;
      lifted297 lifted2970 = new lifted297();
      lifted2970.p_225 = p_225;
      lifted2970.q_225 = q_225;
      lifted2970.r_225 = r_225;
      term = try_1_0.instance.invoke(context, term, lifted2970);
      if(term == null)
        break Fail538;
      s_225 = term;
      if(p_225.value == null || (q_225.value == null || r_225.value == null))
        break Fail538;
      term = (IStrategoTerm)termFactory.makeListCons(p_225.value, termFactory.makeListCons(q_225.value, termFactory.makeListCons(r_225.value, (IStrategoList)extraction.constNil0)));
      f_226 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_226, NO_STRATEGIES, new IStrategoTerm[]{extraction.const502});
      if(term == null)
        break Fail538;
      h_226 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_225);
      if(term == null)
        break Fail538;
      term = put_syntax_sort_0_1.instance.invoke(context, h_226, term);
      if(term == null)
        break Fail538;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}