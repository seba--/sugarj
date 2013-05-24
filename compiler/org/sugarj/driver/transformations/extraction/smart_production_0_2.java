package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_production_0_2 extends Strategy 
{ 
  public static smart_production_0_2 instance = new smart_production_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_312, IStrategoTerm ref_z_312)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_312 = new TermReference(ref_y_312);
    TermReference z_312 = new TermReference(ref_z_312);
    context.push("smart_production_0_2");
    Fail666:
    { 
      IStrategoTerm a_313 = null;
      IStrategoTerm k_313 = null;
      IStrategoTerm p_313 = null;
      term = extraction.constNil0;
      lifted447 lifted4470 = new lifted447();
      lifted4470.y_312 = y_312;
      lifted4470.z_312 = z_312;
      term = try_1_0.instance.invoke(context, term, lifted4470);
      if(term == null)
        break Fail666;
      a_313 = term;
      if(y_312.value == null || z_312.value == null)
        break Fail666;
      term = (IStrategoTerm)termFactory.makeListCons(y_312.value, termFactory.makeListCons(z_312.value, (IStrategoList)extraction.constNil0));
      k_313 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_313, NO_STRATEGIES, new IStrategoTerm[]{extraction.const615});
      if(term == null)
        break Fail666;
      p_313 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_313);
      if(term == null)
        break Fail666;
      term = put_syntax_sort_0_1.instance.invoke(context, p_313, term);
      if(term == null)
        break Fail666;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}