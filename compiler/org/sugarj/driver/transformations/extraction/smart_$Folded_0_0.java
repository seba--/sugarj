package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Folded_0_0 extends Strategy 
{ 
  public static smart_$Folded_0_0 instance = new smart_$Folded_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_Folded_0_0");
    Fail430:
    { 
      IStrategoTerm l_149 = null;
      IStrategoTerm p_149 = null;
      IStrategoTerm r_149 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted164.instance);
      if(term == null)
        break Fail430;
      l_149 = term;
      p_149 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", p_149, NO_STRATEGIES, new IStrategoTerm[]{extraction.const415});
      if(term == null)
        break Fail430;
      r_149 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_149);
      if(term == null)
        break Fail430;
      term = put_syntax_sort_0_1.instance.invoke(context, r_149, term);
      if(term == null)
        break Fail430;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}