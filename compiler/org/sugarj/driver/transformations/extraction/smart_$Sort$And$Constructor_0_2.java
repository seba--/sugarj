package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Sort$And$Constructor_0_2 extends Strategy 
{ 
  public static smart_$Sort$And$Constructor_0_2 instance = new smart_$Sort$And$Constructor_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_172, IStrategoTerm ref_n_172)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_172 = new TermReference(ref_m_172);
    TermReference n_172 = new TermReference(ref_n_172);
    context.push("smart_SortAndConstructor_0_2");
    Fail461:
    { 
      IStrategoTerm o_172 = null;
      IStrategoTerm b_173 = null;
      IStrategoTerm d_173 = null;
      term = extraction.constNil0;
      lifted207 lifted2070 = new lifted207();
      lifted2070.m_172 = m_172;
      lifted2070.n_172 = n_172;
      term = try_1_0.instance.invoke(context, term, lifted2070);
      if(term == null)
        break Fail461;
      o_172 = term;
      if(m_172.value == null || n_172.value == null)
        break Fail461;
      term = (IStrategoTerm)termFactory.makeListCons(m_172.value, termFactory.makeListCons(n_172.value, (IStrategoList)extraction.constNil0));
      b_173 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_173, NO_STRATEGIES, new IStrategoTerm[]{extraction.const435});
      if(term == null)
        break Fail461;
      d_173 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_172);
      if(term == null)
        break Fail461;
      term = put_syntax_sort_0_1.instance.invoke(context, d_173, term);
      if(term == null)
        break Fail461;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}