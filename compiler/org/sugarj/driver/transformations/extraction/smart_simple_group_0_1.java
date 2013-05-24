package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_simple_group_0_1 extends Strategy 
{ 
  public static smart_simple_group_0_1 instance = new smart_simple_group_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_303)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_303 = new TermReference(ref_y_303);
    context.push("smart_simple_group_0_1");
    Fail649:
    { 
      IStrategoTerm z_303 = null;
      IStrategoTerm h_304 = null;
      IStrategoTerm j_304 = null;
      term = extraction.constNil0;
      lifted430 lifted4300 = new lifted430();
      lifted4300.y_303 = y_303;
      term = try_1_0.instance.invoke(context, term, lifted4300);
      if(term == null)
        break Fail649;
      z_303 = term;
      if(y_303.value == null)
        break Fail649;
      term = (IStrategoTerm)termFactory.makeListCons(y_303.value, (IStrategoList)extraction.constNil0);
      h_304 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", h_304, NO_STRATEGIES, new IStrategoTerm[]{extraction.const599});
      if(term == null)
        break Fail649;
      j_304 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_303);
      if(term == null)
        break Fail649;
      term = put_syntax_sort_0_1.instance.invoke(context, j_304, term);
      if(term == null)
        break Fail649;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}