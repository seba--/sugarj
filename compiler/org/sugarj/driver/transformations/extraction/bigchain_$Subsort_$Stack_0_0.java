package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigchain_$Subsort_$Stack_0_0 extends Strategy 
{ 
  public static bigchain_$Subsort_$Stack_0_0 instance = new bigchain_$Subsort_$Stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_Subsort_Stack_0_0");
    Fail1099:
    { 
      IStrategoTerm s_354 = null;
      IStrategoTerm u_354 = null;
      u_354 = term;
      Success299:
      { 
        Fail1100:
        { 
          IStrategoTerm v_354 = null;
          IStrategoTerm x_354 = null;
          IStrategoTerm y_354 = null;
          x_354 = term;
          v_354 = extraction.const47;
          y_354 = x_354;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_354, v_354, extraction.constCons0);
          if(term == null)
            break Fail1100;
          if(true)
            break Success299;
        }
        term = extraction.constNil0;
      }
      s_354 = term;
      term = u_354;
      term = termFactory.makeTuple(s_354, term);
      term = foldl_1_0.instance.invoke(context, term, lifted498.instance);
      if(term == null)
        break Fail1099;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}