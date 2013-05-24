package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Values_0_1 extends Strategy 
{ 
  public static smart_$Values_0_1 instance = new smart_$Values_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_157)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_157 = new TermReference(ref_a_157);
    context.push("smart_Values_0_1");
    Fail436:
    { 
      IStrategoTerm d_157 = null;
      IStrategoTerm m_157 = null;
      IStrategoTerm p_157 = null;
      term = extraction.constNil0;
      lifted180 lifted1800 = new lifted180();
      lifted1800.a_157 = a_157;
      term = try_1_0.instance.invoke(context, term, lifted1800);
      if(term == null)
        break Fail436;
      d_157 = term;
      if(a_157.value == null)
        break Fail436;
      term = (IStrategoTerm)termFactory.makeListCons(a_157.value, (IStrategoList)extraction.constNil0);
      m_157 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_157, NO_STRATEGIES, new IStrategoTerm[]{extraction.const419});
      if(term == null)
        break Fail436;
      p_157 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, d_157);
      if(term == null)
        break Fail436;
      term = put_syntax_sort_0_1.instance.invoke(context, p_157, term);
      if(term == null)
        break Fail436;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}