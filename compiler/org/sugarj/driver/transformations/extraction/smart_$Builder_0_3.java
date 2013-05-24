package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Builder_0_3 extends Strategy 
{ 
  public static smart_$Builder_0_3 instance = new smart_$Builder_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_112, IStrategoTerm ref_r_112, IStrategoTerm ref_s_112)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_112 = new TermReference(ref_q_112);
    TermReference r_112 = new TermReference(ref_r_112);
    TermReference s_112 = new TermReference(ref_s_112);
    context.push("smart_Builder_0_3");
    Fail375:
    { 
      IStrategoTerm t_112 = null;
      IStrategoTerm g_113 = null;
      IStrategoTerm j_113 = null;
      term = extraction.constNil0;
      lifted96 lifted960 = new lifted96();
      lifted960.q_112 = q_112;
      lifted960.r_112 = r_112;
      lifted960.s_112 = s_112;
      term = try_1_0.instance.invoke(context, term, lifted960);
      if(term == null)
        break Fail375;
      t_112 = term;
      if(q_112.value == null || (r_112.value == null || s_112.value == null))
        break Fail375;
      term = (IStrategoTerm)termFactory.makeListCons(q_112.value, termFactory.makeListCons(r_112.value, termFactory.makeListCons(s_112.value, (IStrategoList)extraction.constNil0)));
      g_113 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_113, NO_STRATEGIES, new IStrategoTerm[]{extraction.const366});
      if(term == null)
        break Fail375;
      j_113 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_112);
      if(term == null)
        break Fail375;
      term = put_syntax_sort_0_1.instance.invoke(context, j_113, term);
      if(term == null)
        break Fail375;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}