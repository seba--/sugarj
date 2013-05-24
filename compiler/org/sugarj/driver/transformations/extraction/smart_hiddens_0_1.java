package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_hiddens_0_1 extends Strategy 
{ 
  public static smart_hiddens_0_1 instance = new smart_hiddens_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_315)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_315 = new TermReference(ref_b_315);
    context.push("smart_hiddens_0_1");
    Fail669:
    { 
      IStrategoTerm c_315 = null;
      IStrategoTerm k_315 = null;
      IStrategoTerm m_315 = null;
      term = extraction.constNil0;
      lifted450 lifted4500 = new lifted450();
      lifted4500.b_315 = b_315;
      term = try_1_0.instance.invoke(context, term, lifted4500);
      if(term == null)
        break Fail669;
      c_315 = term;
      if(b_315.value == null)
        break Fail669;
      term = (IStrategoTerm)termFactory.makeListCons(b_315.value, (IStrategoList)extraction.constNil0);
      k_315 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_315, NO_STRATEGIES, new IStrategoTerm[]{extraction.const618});
      if(term == null)
        break Fail669;
      m_315 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, c_315);
      if(term == null)
        break Fail669;
      term = put_syntax_sort_0_1.instance.invoke(context, m_315, term);
      if(term == null)
        break Fail669;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}