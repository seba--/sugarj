package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Var$Dec_0_2 extends Strategy 
{ 
  public static smart_$Var$Dec_0_2 instance = new smart_$Var$Dec_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_258, IStrategoTerm ref_n_258)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_258 = new TermReference(ref_m_258);
    TermReference n_258 = new TermReference(ref_n_258);
    context.push("smart_VarDec_0_2");
    Fail587:
    { 
      IStrategoTerm q_258 = null;
      IStrategoTerm b_259 = null;
      IStrategoTerm e_259 = null;
      term = extraction.constNil0;
      lifted355 lifted3550 = new lifted355();
      lifted3550.m_258 = m_258;
      lifted3550.n_258 = n_258;
      term = try_1_0.instance.invoke(context, term, lifted3550);
      if(term == null)
        break Fail587;
      q_258 = term;
      if(m_258.value == null || n_258.value == null)
        break Fail587;
      term = (IStrategoTerm)termFactory.makeListCons(m_258.value, termFactory.makeListCons(n_258.value, (IStrategoList)extraction.constNil0));
      b_259 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_259, NO_STRATEGIES, new IStrategoTerm[]{extraction.const540});
      if(term == null)
        break Fail587;
      e_259 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_258);
      if(term == null)
        break Fail587;
      term = put_syntax_sort_0_1.instance.invoke(context, e_259, term);
      if(term == null)
        break Fail587;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}