package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_parameterized_0_2 extends Strategy 
{ 
  public static smart_parameterized_0_2 instance = new smart_parameterized_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_315, IStrategoTerm ref_z_315)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_315 = new TermReference(ref_y_315);
    TermReference z_315 = new TermReference(ref_z_315);
    context.push("smart_parameterized_0_2");
    Fail671:
    { 
      IStrategoTerm a_316 = null;
      IStrategoTerm k_316 = null;
      IStrategoTerm m_316 = null;
      term = extraction.constNil0;
      lifted452 lifted4520 = new lifted452();
      lifted4520.y_315 = y_315;
      lifted4520.z_315 = z_315;
      term = try_1_0.instance.invoke(context, term, lifted4520);
      if(term == null)
        break Fail671;
      a_316 = term;
      if(y_315.value == null || z_315.value == null)
        break Fail671;
      term = (IStrategoTerm)termFactory.makeListCons(y_315.value, termFactory.makeListCons(z_315.value, (IStrategoList)extraction.constNil0));
      k_316 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_316, NO_STRATEGIES, new IStrategoTerm[]{extraction.const620});
      if(term == null)
        break Fail671;
      m_316 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_316);
      if(term == null)
        break Fail671;
      term = put_syntax_sort_0_1.instance.invoke(context, m_316, term);
      if(term == null)
        break Fail671;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}