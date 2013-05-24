package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Set$Dyn$Rule_0_2 extends Strategy 
{ 
  public static smart_$Set$Dyn$Rule_0_2 instance = new smart_$Set$Dyn$Rule_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_180, IStrategoTerm ref_t_180)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference s_180 = new TermReference(ref_s_180);
    TermReference t_180 = new TermReference(ref_t_180);
    context.push("smart_SetDynRule_0_2");
    Fail474:
    { 
      IStrategoTerm u_180 = null;
      IStrategoTerm n_181 = null;
      IStrategoTerm p_181 = null;
      term = extraction.constNil0;
      lifted222 lifted2220 = new lifted222();
      lifted2220.s_180 = s_180;
      lifted2220.t_180 = t_180;
      term = try_1_0.instance.invoke(context, term, lifted2220);
      if(term == null)
        break Fail474;
      u_180 = term;
      if(s_180.value == null || t_180.value == null)
        break Fail474;
      term = (IStrategoTerm)termFactory.makeListCons(s_180.value, termFactory.makeListCons(t_180.value, (IStrategoList)extraction.constNil0));
      n_181 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_181, NO_STRATEGIES, new IStrategoTerm[]{extraction.const443});
      if(term == null)
        break Fail474;
      p_181 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_180);
      if(term == null)
        break Fail474;
      term = put_syntax_sort_0_1.instance.invoke(context, p_181, term);
      if(term == null)
        break Fail474;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}