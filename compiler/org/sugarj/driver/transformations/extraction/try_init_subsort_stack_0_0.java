package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class try_init_subsort_stack_0_0 extends Strategy 
{ 
  public static try_init_subsort_stack_0_0 instance = new try_init_subsort_stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("try_init_subsort_stack_0_0");
    Fail98:
    { 
      IStrategoTerm w_59 = null;
      w_59 = term;
      IStrategoTerm term67 = term;
      Success60:
      { 
        Fail99:
        { 
          term = $Subsort_$Stack_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail99;
          if(true)
            break Success60;
        }
        term = term67;
        IStrategoTerm x_59 = null;
        IStrategoTerm y_59 = null;
        IStrategoTerm a_60 = null;
        IStrategoTerm b_60 = null;
        IStrategoTerm d_60 = null;
        IStrategoTerm e_60 = null;
        IStrategoTerm f_60 = null;
        x_59 = term;
        term = extraction.constNil0;
        y_59 = extraction.constNil0;
        d_60 = term;
        a_60 = extraction.const47;
        e_60 = d_60;
        b_60 = extraction.constCons0;
        f_60 = e_60;
        term = termFactory.makeTuple(extraction.const48, y_59);
        term = dr_set_rule_0_3.instance.invoke(context, f_60, a_60, b_60, term);
        if(term == null)
          break Fail98;
        term = x_59;
      }
      term = w_59;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}