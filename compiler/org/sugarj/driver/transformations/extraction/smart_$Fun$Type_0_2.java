package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Fun$Type_0_2 extends Strategy 
{ 
  public static smart_$Fun$Type_0_2 instance = new smart_$Fun$Type_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_248, IStrategoTerm ref_n_248)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_248 = new TermReference(ref_m_248);
    TermReference n_248 = new TermReference(ref_n_248);
    context.push("smart_FunType_0_2");
    Fail572:
    { 
      IStrategoTerm o_248 = null;
      IStrategoTerm c_249 = null;
      IStrategoTerm f_249 = null;
      term = extraction.constNil0;
      lifted340 lifted3400 = new lifted340();
      lifted3400.m_248 = m_248;
      lifted3400.n_248 = n_248;
      term = try_1_0.instance.invoke(context, term, lifted3400);
      if(term == null)
        break Fail572;
      o_248 = term;
      if(m_248.value == null || n_248.value == null)
        break Fail572;
      term = (IStrategoTerm)termFactory.makeListCons(m_248.value, termFactory.makeListCons(n_248.value, (IStrategoList)extraction.constNil0));
      c_249 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", c_249, NO_STRATEGIES, new IStrategoTerm[]{extraction.const59});
      if(term == null)
        break Fail572;
      f_249 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_248);
      if(term == null)
        break Fail572;
      term = put_syntax_sort_0_1.instance.invoke(context, f_249, term);
      if(term == null)
        break Fail572;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}