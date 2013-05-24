package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class innermost_scope_$Subsort_$Stack_1_0 extends Strategy 
{ 
  public static innermost_scope_$Subsort_$Stack_1_0 instance = new innermost_scope_$Subsort_$Stack_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_352)
  { 
    context.push("innermost_scope_Subsort_Stack_1_0");
    Fail1085:
    { 
      IStrategoTerm w_352 = null;
      w_352 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, w_352, u_352, extraction.const47);
      if(term == null)
        break Fail1085;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}