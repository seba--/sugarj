package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_positive_0_1 extends Strategy 
{ 
  public static smart_positive_0_1 instance = new smart_positive_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_322)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_322 = new TermReference(ref_v_322);
    context.push("smart_positive_0_1");
    Fail685:
    { 
      IStrategoTerm w_322 = null;
      IStrategoTerm k_323 = null;
      IStrategoTerm m_323 = null;
      term = extraction.constNil0;
      lifted466 lifted4660 = new lifted466();
      lifted4660.v_322 = v_322;
      term = try_1_0.instance.invoke(context, term, lifted4660);
      if(term == null)
        break Fail685;
      w_322 = term;
      if(v_322.value == null)
        break Fail685;
      term = (IStrategoTerm)termFactory.makeListCons(v_322.value, (IStrategoList)extraction.constNil0);
      k_323 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_323, NO_STRATEGIES, new IStrategoTerm[]{extraction.const633});
      if(term == null)
        break Fail685;
      m_323 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_322);
      if(term == null)
        break Fail685;
      term = put_syntax_sort_0_1.instance.invoke(context, m_323, term);
      if(term == null)
        break Fail685;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}