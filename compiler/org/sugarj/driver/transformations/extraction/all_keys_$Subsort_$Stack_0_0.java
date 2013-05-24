package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class all_keys_$Subsort_$Stack_0_0 extends Strategy 
{ 
  public static all_keys_$Subsort_$Stack_0_0 instance = new all_keys_$Subsort_$Stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("all_keys_Subsort_Stack_0_0");
    Fail1094:
    { 
      IStrategoTerm r_353 = null;
      r_353 = term;
      term = dr_all_keys_0_1.instance.invoke(context, r_353, extraction.const47);
      if(term == null)
        break Fail1094;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}