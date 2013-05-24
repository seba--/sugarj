package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class continue_$Subsort_$Stack_0_0 extends Strategy 
{ 
  public static continue_$Subsort_$Stack_0_0 instance = new continue_$Subsort_$Stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("continue_Subsort_Stack_0_0");
    Fail1090:
    { 
      IStrategoTerm i_353 = null;
      i_353 = term;
      term = dr_continue_0_1.instance.invoke(context, i_353, extraction.const47);
      if(term == null)
        break Fail1090;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}