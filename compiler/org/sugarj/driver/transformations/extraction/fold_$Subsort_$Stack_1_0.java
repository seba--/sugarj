package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fold_$Subsort_$Stack_1_0 extends Strategy 
{ 
  public static fold_$Subsort_$Stack_1_0 instance = new fold_$Subsort_$Stack_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_354)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_Subsort_Stack_1_0");
    Fail1097:
    { 
      IStrategoTerm h_354 = null;
      IStrategoTerm j_354 = null;
      j_354 = term;
      Success298:
      { 
        Fail1098:
        { 
          IStrategoTerm k_354 = null;
          IStrategoTerm m_354 = null;
          IStrategoTerm n_354 = null;
          m_354 = term;
          k_354 = extraction.const47;
          n_354 = m_354;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_354, k_354, extraction.constCons0);
          if(term == null)
            break Fail1098;
          if(true)
            break Success298;
        }
        term = extraction.constNil0;
      }
      h_354 = term;
      term = j_354;
      term = termFactory.makeTuple(h_354, term);
      term = g_354.invoke(context, term, lifted497.instance);
      if(term == null)
        break Fail1097;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}