package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_term_0_1 extends Strategy 
{ 
  public static smart_term_0_1 instance = new smart_term_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_326)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_326 = new TermReference(ref_y_326);
    context.push("smart_term_0_1");
    Fail693:
    { 
      IStrategoTerm z_326 = null;
      IStrategoTerm h_327 = null;
      IStrategoTerm k_327 = null;
      term = extraction.constNil0;
      lifted474 lifted4740 = new lifted474();
      lifted4740.y_326 = y_326;
      term = try_1_0.instance.invoke(context, term, lifted4740);
      if(term == null)
        break Fail693;
      z_326 = term;
      if(y_326.value == null)
        break Fail693;
      term = (IStrategoTerm)termFactory.makeListCons(y_326.value, (IStrategoList)extraction.constNil0);
      h_327 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", h_327, NO_STRATEGIES, new IStrategoTerm[]{extraction.const641});
      if(term == null)
        break Fail693;
      k_327 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_326);
      if(term == null)
        break Fail693;
      term = put_syntax_sort_0_1.instance.invoke(context, k_327, term);
      if(term == null)
        break Fail693;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}