package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class throw_$Subsort_$Stack_1_1 extends Strategy 
{ 
  public static throw_$Subsort_$Stack_1_1 instance = new throw_$Subsort_$Stack_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_353, IStrategoTerm a_353)
  { 
    context.push("throw_Subsort_Stack_1_1");
    Fail1088:
    { 
      IStrategoTerm d_353 = null;
      d_353 = term;
      term = dr_throw_1_2.instance.invoke(context, d_353, b_353, a_353, extraction.const47);
      if(term == null)
        break Fail1088;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}