package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Anno$List_0_2 extends Strategy 
{ 
  public static smart_$Anno$List_0_2 instance = new smart_$Anno$List_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_l_230, IStrategoTerm ref_m_230)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference l_230 = new TermReference(ref_l_230);
    TermReference m_230 = new TermReference(ref_m_230);
    context.push("smart_AnnoList_0_2");
    Fail546:
    { 
      IStrategoTerm n_230 = null;
      IStrategoTerm m_231 = null;
      IStrategoTerm p_231 = null;
      term = extraction.constNil0;
      lifted306 lifted3060 = new lifted306();
      lifted3060.l_230 = l_230;
      lifted3060.m_230 = m_230;
      term = try_1_0.instance.invoke(context, term, lifted3060);
      if(term == null)
        break Fail546;
      lifted307 lifted3070 = new lifted307();
      lifted3070.l_230 = l_230;
      lifted3070.m_230 = m_230;
      term = try_1_0.instance.invoke(context, term, lifted3070);
      if(term == null)
        break Fail546;
      n_230 = term;
      if(l_230.value == null || m_230.value == null)
        break Fail546;
      term = (IStrategoTerm)termFactory.makeListCons(l_230.value, termFactory.makeListCons(m_230.value, (IStrategoList)extraction.constNil0));
      m_231 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_231, NO_STRATEGIES, new IStrategoTerm[]{extraction.const507});
      if(term == null)
        break Fail546;
      p_231 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_230);
      if(term == null)
        break Fail546;
      term = put_syntax_sort_0_1.instance.invoke(context, p_231, term);
      if(term == null)
        break Fail546;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}