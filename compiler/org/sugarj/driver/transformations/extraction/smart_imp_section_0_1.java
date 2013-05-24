package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_imp_section_0_1 extends Strategy 
{ 
  public static smart_imp_section_0_1 instance = new smart_imp_section_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_317)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_317 = new TermReference(ref_j_317);
    context.push("smart_imp_section_0_1");
    Fail674:
    { 
      IStrategoTerm k_317 = null;
      IStrategoTerm r_317 = null;
      IStrategoTerm t_317 = null;
      term = extraction.constNil0;
      lifted455 lifted4550 = new lifted455();
      lifted4550.j_317 = j_317;
      term = try_1_0.instance.invoke(context, term, lifted4550);
      if(term == null)
        break Fail674;
      k_317 = term;
      if(j_317.value == null)
        break Fail674;
      term = (IStrategoTerm)termFactory.makeListCons(j_317.value, (IStrategoList)extraction.constNil0);
      r_317 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_317, NO_STRATEGIES, new IStrategoTerm[]{extraction.const623});
      if(term == null)
        break Fail674;
      t_317 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_317);
      if(term == null)
        break Fail674;
      term = put_syntax_sort_0_1.instance.invoke(context, t_317, term);
      if(term == null)
        break Fail674;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}