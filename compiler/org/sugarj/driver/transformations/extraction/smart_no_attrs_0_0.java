package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_no_attrs_0_0 extends Strategy 
{ 
  public static smart_no_attrs_0_0 instance = new smart_no_attrs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_no_attrs_0_0");
    Fail695:
    { 
      IStrategoTerm b_328 = null;
      IStrategoTerm f_328 = null;
      IStrategoTerm i_328 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted476.instance);
      if(term == null)
        break Fail695;
      b_328 = term;
      f_328 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_328, NO_STRATEGIES, new IStrategoTerm[]{extraction.const643});
      if(term == null)
        break Fail695;
      i_328 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, b_328);
      if(term == null)
        break Fail695;
      term = put_syntax_sort_0_1.instance.invoke(context, i_328, term);
      if(term == null)
        break Fail695;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}