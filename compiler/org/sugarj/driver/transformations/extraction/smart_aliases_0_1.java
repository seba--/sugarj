package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_aliases_0_1 extends Strategy 
{ 
  public static smart_aliases_0_1 instance = new smart_aliases_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_105)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_105 = new TermReference(ref_m_105);
    context.push("smart_aliases_0_1");
    Fail364:
    { 
      IStrategoTerm n_105 = null;
      IStrategoTerm b_106 = null;
      IStrategoTerm d_106 = null;
      term = extraction.constNil0;
      lifted83 lifted830 = new lifted83();
      lifted830.m_105 = m_105;
      term = try_1_0.instance.invoke(context, term, lifted830);
      if(term == null)
        break Fail364;
      lifted84 lifted840 = new lifted84();
      lifted840.m_105 = m_105;
      term = try_1_0.instance.invoke(context, term, lifted840);
      if(term == null)
        break Fail364;
      n_105 = term;
      if(m_105.value == null)
        break Fail364;
      term = (IStrategoTerm)termFactory.makeListCons(m_105.value, (IStrategoList)extraction.constNil0);
      b_106 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_106, NO_STRATEGIES, new IStrategoTerm[]{extraction.const354});
      if(term == null)
        break Fail364;
      d_106 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_105);
      if(term == null)
        break Fail364;
      term = put_syntax_sort_0_1.instance.invoke(context, d_106, term);
      if(term == null)
        break Fail364;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}