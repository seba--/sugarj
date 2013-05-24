package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Subsort_$Stack_0_0 extends Strategy 
{ 
  public static $Subsort_$Stack_0_0 instance = new $Subsort_$Stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("Subsort_Stack_0_0");
    Fail1110:
    { 
      TermReference t_356 = new TermReference();
      IStrategoTerm w_356 = null;
      IStrategoTerm y_356 = null;
      IStrategoTerm z_356 = null;
      if(t_356.value == null)
        t_356.value = term;
      else
        if(t_356.value != term && !t_356.value.match(term))
          break Fail1110;
      y_356 = term;
      w_356 = extraction.const47;
      z_356 = y_356;
      term = dr_lookup_rule_0_2.instance.invoke(context, z_356, w_356, extraction.constCons0);
      if(term == null)
        break Fail1110;
      lifted504 lifted5040 = new lifted504();
      lifted5040.t_356 = t_356;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted5040);
      if(term == null)
        break Fail1110;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}