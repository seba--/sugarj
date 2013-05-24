package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class break_$Subsort_$Stack_0_0 extends Strategy 
{ 
  public static break_$Subsort_$Stack_0_0 instance = new break_$Subsort_$Stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("break_Subsort_Stack_0_0");
    Fail1093:
    { 
      IStrategoTerm p_353 = null;
      p_353 = term;
      term = dr_break_0_1.instance.invoke(context, p_353, extraction.const47);
      if(term == null)
        break Fail1093;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}