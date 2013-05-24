package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Str_0_1 extends Strategy 
{ 
  public static smart_$Str_0_1 instance = new smart_$Str_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_250)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_250 = new TermReference(ref_m_250);
    context.push("smart_Str_0_1");
    Fail576:
    { 
      IStrategoTerm n_250 = null;
      IStrategoTerm w_250 = null;
      IStrategoTerm y_250 = null;
      term = extraction.constNil0;
      lifted344 lifted3440 = new lifted344();
      lifted3440.m_250 = m_250;
      term = try_1_0.instance.invoke(context, term, lifted3440);
      if(term == null)
        break Fail576;
      n_250 = term;
      if(m_250.value == null)
        break Fail576;
      term = (IStrategoTerm)termFactory.makeListCons(m_250.value, (IStrategoList)extraction.constNil0);
      w_250 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_250, NO_STRATEGIES, new IStrategoTerm[]{extraction.const530});
      if(term == null)
        break Fail576;
      y_250 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_250);
      if(term == null)
        break Fail576;
      term = put_syntax_sort_0_1.instance.invoke(context, y_250, term);
      if(term == null)
        break Fail576;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}