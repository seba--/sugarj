package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigfold_$Subsort_$Stack_1_0 extends Strategy 
{ 
  public static bigfold_$Subsort_$Stack_1_0 instance = new bigfold_$Subsort_$Stack_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_353)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_Subsort_Stack_1_0");
    Fail1095:
    { 
      IStrategoTerm v_353 = null;
      IStrategoTerm x_353 = null;
      x_353 = term;
      Success297:
      { 
        Fail1096:
        { 
          IStrategoTerm y_353 = null;
          IStrategoTerm a_354 = null;
          IStrategoTerm b_354 = null;
          a_354 = term;
          y_353 = extraction.const47;
          b_354 = a_354;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, b_354, y_353, extraction.constCons0);
          if(term == null)
            break Fail1096;
          if(true)
            break Success297;
        }
        term = extraction.constNil0;
      }
      v_353 = term;
      term = x_353;
      term = termFactory.makeTuple(v_353, term);
      term = u_353.invoke(context, term, lifted496.instance);
      if(term == null)
        break Fail1095;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}