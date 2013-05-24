package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$B$A_0_2 extends Strategy 
{ 
  public static smart_$B$A_0_2 instance = new smart_$B$A_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_l_197, IStrategoTerm ref_m_197)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference l_197 = new TermReference(ref_l_197);
    TermReference m_197 = new TermReference(ref_m_197);
    context.push("smart_BA_0_2");
    Fail495:
    { 
      IStrategoTerm n_197 = null;
      IStrategoTerm f_198 = null;
      IStrategoTerm i_198 = null;
      term = extraction.constNil0;
      lifted249 lifted2490 = new lifted249();
      lifted2490.l_197 = l_197;
      lifted2490.m_197 = m_197;
      term = try_1_0.instance.invoke(context, term, lifted2490);
      if(term == null)
        break Fail495;
      lifted250 lifted2500 = new lifted250();
      lifted2500.l_197 = l_197;
      lifted2500.m_197 = m_197;
      term = try_1_0.instance.invoke(context, term, lifted2500);
      if(term == null)
        break Fail495;
      n_197 = term;
      if(l_197.value == null || m_197.value == null)
        break Fail495;
      term = (IStrategoTerm)termFactory.makeListCons(l_197.value, termFactory.makeListCons(m_197.value, (IStrategoList)extraction.constNil0));
      f_198 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_198, NO_STRATEGIES, new IStrategoTerm[]{extraction.const461});
      if(term == null)
        break Fail495;
      i_198 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_197);
      if(term == null)
        break Fail495;
      term = put_syntax_sort_0_1.instance.invoke(context, i_198, term);
      if(term == null)
        break Fail495;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}