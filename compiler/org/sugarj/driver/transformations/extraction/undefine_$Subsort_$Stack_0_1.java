package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class undefine_$Subsort_$Stack_0_1 extends Strategy 
{ 
  public static undefine_$Subsort_$Stack_0_1 instance = new undefine_$Subsort_$Stack_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_352)
  { 
    Fail1087:
    { 
      if(true)
        break Fail1087;
      if(true)
        return term;
    }
    context.push("undefine_Subsort_Stack_0_1");
    context.popOnFailure();
    return null;
  }
}