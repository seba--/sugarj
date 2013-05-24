package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class once_$Subsort_$Stack_0_0 extends Strategy 
{ 
  public static once_$Subsort_$Stack_0_0 instance = new once_$Subsort_$Stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_Subsort_Stack_0_0");
    Fail1105:
    { 
      IStrategoTerm t_355 = null;
      TermReference u_355 = new TermReference();
      TermReference v_355 = new TermReference();
      IStrategoTerm w_355 = null;
      IStrategoTerm x_355 = null;
      IStrategoTerm z_355 = null;
      IStrategoTerm a_356 = null;
      IStrategoTerm c_356 = null;
      IStrategoTerm d_356 = null;
      if(u_355.value == null)
        u_355.value = term;
      else
        if(u_355.value != term && !u_355.value.match(term))
          break Fail1105;
      z_355 = term;
      c_356 = term;
      a_356 = extraction.const47;
      d_356 = c_356;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, d_356, a_356, extraction.constCons0);
      if(term == null)
        break Fail1105;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail1105;
      t_355 = term.getSubterm(0);
      x_355 = term.getSubterm(1);
      w_355 = term.getSubterm(2);
      term = t_355;
      lifted501 lifted5010 = new lifted501();
      lifted5010.u_355 = u_355;
      lifted5010.v_355 = v_355;
      term = split_fetch_1_0.instance.invoke(context, term, lifted5010);
      if(term == null)
        break Fail1105;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1105;
      term = hashtable_put_0_2.instance.invoke(context, w_355, x_355, term);
      if(term == null)
        break Fail1105;
      term = z_355;
      if(v_355.value == null)
        break Fail1105;
      term = v_355.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}