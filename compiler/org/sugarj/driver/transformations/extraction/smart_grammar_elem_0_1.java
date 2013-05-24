package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_grammar_elem_0_1 extends Strategy 
{ 
  public static smart_grammar_elem_0_1 instance = new smart_grammar_elem_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_96)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_96 = new TermReference(ref_m_96);
    context.push("smart_grammar_elem_0_1");
    Fail350:
    { 
      IStrategoTerm n_96 = null;
      IStrategoTerm u_96 = null;
      IStrategoTerm w_96 = null;
      term = extraction.constNil0;
      lifted57 lifted570 = new lifted57();
      lifted570.m_96 = m_96;
      term = try_1_0.instance.invoke(context, term, lifted570);
      if(term == null)
        break Fail350;
      n_96 = term;
      if(m_96.value == null)
        break Fail350;
      term = (IStrategoTerm)termFactory.makeListCons(m_96.value, (IStrategoList)extraction.constNil0);
      u_96 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_96, NO_STRATEGIES, new IStrategoTerm[]{extraction.const339});
      if(term == null)
        break Fail350;
      w_96 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_96);
      if(term == null)
        break Fail350;
      term = put_syntax_sort_0_1.instance.invoke(context, w_96, term);
      if(term == null)
        break Fail350;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}