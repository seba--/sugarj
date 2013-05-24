package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class break_to_label_$Subsort_$Stack_0_1 extends Strategy 
{ 
  public static break_to_label_$Subsort_$Stack_0_1 instance = new break_to_label_$Subsort_$Stack_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_353)
  { 
    context.push("break_to_label_Subsort_Stack_0_1");
    Fail1092:
    { 
      IStrategoTerm n_353 = null;
      n_353 = term;
      term = dr_break_0_2.instance.invoke(context, n_353, extraction.const47, l_353);
      if(term == null)
        break Fail1092;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}