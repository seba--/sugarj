package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_conc_grammars_0_2 extends Strategy 
{ 
  public static smart_conc_grammars_0_2 instance = new smart_conc_grammars_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_321, IStrategoTerm ref_c_321)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_321 = new TermReference(ref_b_321);
    TermReference c_321 = new TermReference(ref_c_321);
    context.push("smart_conc_grammars_0_2");
    Fail682:
    { 
      IStrategoTerm d_321 = null;
      IStrategoTerm n_321 = null;
      IStrategoTerm p_321 = null;
      term = extraction.constNil0;
      lifted463 lifted4630 = new lifted463();
      lifted4630.b_321 = b_321;
      lifted4630.c_321 = c_321;
      term = try_1_0.instance.invoke(context, term, lifted4630);
      if(term == null)
        break Fail682;
      d_321 = term;
      if(b_321.value == null || c_321.value == null)
        break Fail682;
      term = (IStrategoTerm)termFactory.makeListCons(b_321.value, termFactory.makeListCons(c_321.value, (IStrategoList)extraction.constNil0));
      n_321 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_321, NO_STRATEGIES, new IStrategoTerm[]{extraction.const630});
      if(term == null)
        break Fail682;
      p_321 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, d_321);
      if(term == null)
        break Fail682;
      term = put_syntax_sort_0_1.instance.invoke(context, p_321, term);
      if(term == null)
        break Fail682;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}