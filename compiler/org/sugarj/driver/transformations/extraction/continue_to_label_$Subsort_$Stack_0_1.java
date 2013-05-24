package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class continue_to_label_$Subsort_$Stack_0_1 extends Strategy 
{ 
  public static continue_to_label_$Subsort_$Stack_0_1 instance = new continue_to_label_$Subsort_$Stack_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_353)
  { 
    context.push("continue_to_label_Subsort_Stack_0_1");
    Fail1089:
    { 
      IStrategoTerm g_353 = null;
      g_353 = term;
      term = dr_continue_0_2.instance.invoke(context, g_353, extraction.const47, e_353);
      if(term == null)
        break Fail1089;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}