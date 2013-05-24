package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Op$Q_0_2 extends Strategy 
{ 
  public static smart_$Op$Q_0_2 instance = new smart_$Op$Q_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_251, IStrategoTerm ref_q_251)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_251 = new TermReference(ref_p_251);
    TermReference q_251 = new TermReference(ref_q_251);
    context.push("smart_OpQ_0_2");
    Fail578:
    { 
      IStrategoTerm t_251 = null;
      IStrategoTerm e_252 = null;
      IStrategoTerm g_252 = null;
      term = extraction.constNil0;
      lifted346 lifted3460 = new lifted346();
      lifted3460.p_251 = p_251;
      lifted3460.q_251 = q_251;
      term = try_1_0.instance.invoke(context, term, lifted3460);
      if(term == null)
        break Fail578;
      t_251 = term;
      if(p_251.value == null || q_251.value == null)
        break Fail578;
      term = (IStrategoTerm)termFactory.makeListCons(p_251.value, termFactory.makeListCons(q_251.value, (IStrategoList)extraction.constNil0));
      e_252 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_252, NO_STRATEGIES, new IStrategoTerm[]{extraction.const532});
      if(term == null)
        break Fail578;
      g_252 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_251);
      if(term == null)
        break Fail578;
      term = put_syntax_sort_0_1.instance.invoke(context, g_252, term);
      if(term == null)
        break Fail578;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}