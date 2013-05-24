package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class reverse_bagof_$Subsort_$Stack_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Subsort_$Stack_1_0 instance = new reverse_bagof_$Subsort_$Stack_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_356)
  { 
    context.push("reverse_bagof_Subsort_Stack_1_0");
    Fail1106:
    { 
      TermReference e_356 = new TermReference();
      if(e_356.value == null)
        e_356.value = term;
      else
        if(e_356.value != term && !e_356.value.match(term))
          break Fail1106;
      Success302:
      { 
        Fail1107:
        { 
          IStrategoTerm i_356 = null;
          IStrategoTerm k_356 = null;
          IStrategoTerm l_356 = null;
          k_356 = term;
          i_356 = extraction.const47;
          l_356 = k_356;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_356, i_356, extraction.constCons0);
          if(term == null)
            break Fail1107;
          if(true)
            break Success302;
        }
        term = extraction.constNil0;
      }
      lifted502 lifted5020 = new lifted502();
      lifted5020.e_356 = e_356;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted5020, g_356);
      if(term == null)
        break Fail1106;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}