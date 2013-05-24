package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Rules_0_1 extends Strategy 
{ 
  public static smart_$Rules_0_1 instance = new smart_$Rules_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_94)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_94 = new TermReference(ref_m_94);
    context.push("smart_Rules_0_1");
    Fail347:
    { 
      IStrategoTerm n_94 = null;
      IStrategoTerm b_95 = null;
      IStrategoTerm d_95 = null;
      term = extraction.constNil0;
      lifted52 lifted520 = new lifted52();
      lifted520.m_94 = m_94;
      term = try_1_0.instance.invoke(context, term, lifted520);
      if(term == null)
        break Fail347;
      lifted53 lifted530 = new lifted53();
      lifted530.m_94 = m_94;
      term = try_1_0.instance.invoke(context, term, lifted530);
      if(term == null)
        break Fail347;
      n_94 = term;
      if(m_94.value == null)
        break Fail347;
      term = (IStrategoTerm)termFactory.makeListCons(m_94.value, (IStrategoList)extraction.constNil0);
      b_95 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_95, NO_STRATEGIES, new IStrategoTerm[]{extraction.const336});
      if(term == null)
        break Fail347;
      d_95 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_94);
      if(term == null)
        break Fail347;
      term = put_syntax_sort_0_1.instance.invoke(context, d_95, term);
      if(term == null)
        break Fail347;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}