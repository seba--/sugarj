package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class pop_subsort_stack_0_0 extends Strategy 
{ 
  public static pop_subsort_stack_0_0 instance = new pop_subsort_stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pop_subsort_stack_0_0");
    Fail103:
    { 
      IStrategoTerm x_60 = null;
      IStrategoTerm z_60 = null;
      IStrategoTerm b_61 = null;
      IStrategoTerm d_61 = null;
      IStrategoTerm e_61 = null;
      IStrategoTerm f_61 = null;
      IStrategoTerm h_61 = null;
      IStrategoTerm i_61 = null;
      IStrategoTerm j_61 = null;
      x_60 = term;
      term = $Subsort_$Stack_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail103;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail103;
      d_61 = ((IStrategoList)term).tail();
      b_61 = d_61;
      term = d_61;
      z_60 = b_61;
      h_61 = term;
      e_61 = extraction.const47;
      i_61 = h_61;
      f_61 = extraction.constCons0;
      j_61 = i_61;
      term = termFactory.makeTuple(extraction.const48, z_60);
      term = dr_set_rule_0_3.instance.invoke(context, j_61, e_61, f_61, term);
      if(term == null)
        break Fail103;
      term = x_60;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}