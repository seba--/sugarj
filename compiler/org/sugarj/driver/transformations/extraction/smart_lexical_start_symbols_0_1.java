package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_lexical_start_symbols_0_1 extends Strategy 
{ 
  public static smart_lexical_start_symbols_0_1 instance = new smart_lexical_start_symbols_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_280)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_280 = new TermReference(ref_m_280);
    context.push("smart_lexical_start_symbols_0_1");
    Fail621:
    { 
      IStrategoTerm n_280 = null;
      IStrategoTerm w_280 = null;
      IStrategoTerm y_280 = null;
      term = extraction.constNil0;
      lifted398 lifted3980 = new lifted398();
      lifted3980.m_280 = m_280;
      term = try_1_0.instance.invoke(context, term, lifted3980);
      if(term == null)
        break Fail621;
      n_280 = term;
      if(m_280.value == null)
        break Fail621;
      term = (IStrategoTerm)termFactory.makeListCons(m_280.value, (IStrategoList)extraction.constNil0);
      w_280 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_280, NO_STRATEGIES, new IStrategoTerm[]{extraction.const572});
      if(term == null)
        break Fail621;
      y_280 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_280);
      if(term == null)
        break Fail621;
      term = put_syntax_sort_0_1.instance.invoke(context, y_280, term);
      if(term == null)
        break Fail621;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}