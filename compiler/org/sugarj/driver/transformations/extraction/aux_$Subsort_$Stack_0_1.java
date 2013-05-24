package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$Subsort_$Stack_0_1 extends Strategy 
{ 
  public static aux_$Subsort_$Stack_0_1 instance = new aux_$Subsort_$Stack_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_357)
  { 
    Fail1111:
    { 
      IStrategoTerm b_357 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1111;
      IStrategoTerm arg79 = term.getSubterm(0);
      if(arg79.getTermType() != IStrategoTerm.STRING || !"17962".equals(((IStrategoString)arg79).stringValue()))
        break Fail1111;
      b_357 = term.getSubterm(1);
      term = b_357;
      if(true)
        return term;
    }
    context.push("aux_Subsort_Stack_0_1");
    context.popOnFailure();
    return null;
  }
}