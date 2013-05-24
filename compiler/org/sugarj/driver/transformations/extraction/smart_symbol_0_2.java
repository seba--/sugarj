package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_symbol_0_2 extends Strategy 
{ 
  public static smart_symbol_0_2 instance = new smart_symbol_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_312, IStrategoTerm ref_j_312)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_312 = new TermReference(ref_i_312);
    TermReference j_312 = new TermReference(ref_j_312);
    context.push("smart_symbol_0_2");
    Fail665:
    { 
      IStrategoTerm k_312 = null;
      IStrategoTerm v_312 = null;
      IStrategoTerm x_312 = null;
      term = extraction.constNil0;
      lifted446 lifted4460 = new lifted446();
      lifted4460.i_312 = i_312;
      lifted4460.j_312 = j_312;
      term = try_1_0.instance.invoke(context, term, lifted4460);
      if(term == null)
        break Fail665;
      k_312 = term;
      if(i_312.value == null || j_312.value == null)
        break Fail665;
      term = (IStrategoTerm)termFactory.makeListCons(i_312.value, termFactory.makeListCons(j_312.value, (IStrategoList)extraction.constNil0));
      v_312 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_312, NO_STRATEGIES, new IStrategoTerm[]{extraction.const614});
      if(term == null)
        break Fail665;
      x_312 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_312);
      if(term == null)
        break Fail665;
      term = put_syntax_sort_0_1.instance.invoke(context, x_312, term);
      if(term == null)
        break Fail665;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}