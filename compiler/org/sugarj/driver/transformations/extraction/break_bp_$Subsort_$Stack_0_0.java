package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class break_bp_$Subsort_$Stack_0_0 extends Strategy 
{ 
  public static break_bp_$Subsort_$Stack_0_0 instance = new break_bp_$Subsort_$Stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("break_bp_Subsort_Stack_0_0");
    Fail1091:
    { 
      IStrategoTerm k_353 = null;
      k_353 = term;
      term = dr_break_bp_0_1.instance.invoke(context, k_353, extraction.const47);
      if(term == null)
        break Fail1091;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}