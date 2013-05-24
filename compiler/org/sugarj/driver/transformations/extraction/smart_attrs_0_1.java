package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_attrs_0_1 extends Strategy 
{ 
  public static smart_attrs_0_1 instance = new smart_attrs_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_327)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_327 = new TermReference(ref_o_327);
    context.push("smart_attrs_0_1");
    Fail694:
    { 
      IStrategoTerm p_327 = null;
      IStrategoTerm y_327 = null;
      IStrategoTerm a_328 = null;
      term = extraction.constNil0;
      lifted475 lifted4750 = new lifted475();
      lifted4750.o_327 = o_327;
      term = try_1_0.instance.invoke(context, term, lifted4750);
      if(term == null)
        break Fail694;
      p_327 = term;
      if(o_327.value == null)
        break Fail694;
      term = (IStrategoTerm)termFactory.makeListCons(o_327.value, (IStrategoList)extraction.constNil0);
      y_327 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_327, NO_STRATEGIES, new IStrategoTerm[]{extraction.const642});
      if(term == null)
        break Fail694;
      a_328 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, p_327);
      if(term == null)
        break Fail694;
      term = put_syntax_sort_0_1.instance.invoke(context, a_328, term);
      if(term == null)
        break Fail694;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}