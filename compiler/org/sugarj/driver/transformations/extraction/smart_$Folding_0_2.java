package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Folding_0_2 extends Strategy 
{ 
  public static smart_$Folding_0_2 instance = new smart_$Folding_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_l_147, IStrategoTerm ref_m_147)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference l_147 = new TermReference(ref_l_147);
    TermReference m_147 = new TermReference(ref_m_147);
    context.push("smart_Folding_0_2");
    Fail427:
    { 
      IStrategoTerm n_147 = null;
      IStrategoTerm e_148 = null;
      IStrategoTerm g_148 = null;
      term = extraction.constNil0;
      lifted161 lifted1610 = new lifted161();
      lifted1610.l_147 = l_147;
      lifted1610.m_147 = m_147;
      term = try_1_0.instance.invoke(context, term, lifted1610);
      if(term == null)
        break Fail427;
      n_147 = term;
      if(l_147.value == null || m_147.value == null)
        break Fail427;
      term = (IStrategoTerm)termFactory.makeListCons(l_147.value, termFactory.makeListCons(m_147.value, (IStrategoList)extraction.constNil0));
      e_148 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_148, NO_STRATEGIES, new IStrategoTerm[]{extraction.const412});
      if(term == null)
        break Fail427;
      g_148 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_147);
      if(term == null)
        break Fail427;
      term = put_syntax_sort_0_1.instance.invoke(context, g_148, term);
      if(term == null)
        break Fail427;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}