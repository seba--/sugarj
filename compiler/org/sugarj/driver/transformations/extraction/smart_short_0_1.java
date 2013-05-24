package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_short_0_1 extends Strategy 
{ 
  public static smart_short_0_1 instance = new smart_short_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_284)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_284 = new TermReference(ref_d_284);
    context.push("smart_short_0_1");
    Fail626:
    { 
      IStrategoTerm e_284 = null;
      IStrategoTerm l_284 = null;
      IStrategoTerm o_284 = null;
      term = extraction.constNil0;
      lifted403 lifted4030 = new lifted403();
      lifted4030.d_284 = d_284;
      term = try_1_0.instance.invoke(context, term, lifted4030);
      if(term == null)
        break Fail626;
      e_284 = term;
      if(d_284.value == null)
        break Fail626;
      term = (IStrategoTerm)termFactory.makeListCons(d_284.value, (IStrategoList)extraction.constNil0);
      l_284 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", l_284, NO_STRATEGIES, new IStrategoTerm[]{extraction.const577});
      if(term == null)
        break Fail626;
      o_284 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_284);
      if(term == null)
        break Fail626;
      term = put_syntax_sort_0_1.instance.invoke(context, o_284, term);
      if(term == null)
        break Fail626;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}