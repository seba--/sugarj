package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_iter_sep_0_2 extends Strategy 
{ 
  public static smart_iter_sep_0_2 instance = new smart_iter_sep_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_308, IStrategoTerm ref_z_308)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_308 = new TermReference(ref_y_308);
    TermReference z_308 = new TermReference(ref_z_308);
    context.push("smart_iter_sep_0_2");
    Fail659:
    { 
      IStrategoTerm a_309 = null;
      IStrategoTerm l_309 = null;
      IStrategoTerm n_309 = null;
      term = extraction.constNil0;
      lifted440 lifted4400 = new lifted440();
      lifted4400.y_308 = y_308;
      lifted4400.z_308 = z_308;
      term = try_1_0.instance.invoke(context, term, lifted4400);
      if(term == null)
        break Fail659;
      a_309 = term;
      if(y_308.value == null || z_308.value == null)
        break Fail659;
      term = (IStrategoTerm)termFactory.makeListCons(y_308.value, termFactory.makeListCons(z_308.value, (IStrategoList)extraction.constNil0));
      l_309 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", l_309, NO_STRATEGIES, new IStrategoTerm[]{extraction.const608});
      if(term == null)
        break Fail659;
      n_309 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_309);
      if(term == null)
        break Fail659;
      term = put_syntax_sort_0_1.instance.invoke(context, n_309, term);
      if(term == null)
        break Fail659;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}