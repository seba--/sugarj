package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class chain_$Subsort_$Stack_0_0 extends Strategy 
{ 
  public static chain_$Subsort_$Stack_0_0 instance = new chain_$Subsort_$Stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_Subsort_Stack_0_0");
    Fail1101:
    { 
      IStrategoTerm d_355 = null;
      IStrategoTerm f_355 = null;
      f_355 = term;
      Success300:
      { 
        Fail1102:
        { 
          IStrategoTerm g_355 = null;
          IStrategoTerm i_355 = null;
          IStrategoTerm j_355 = null;
          i_355 = term;
          g_355 = extraction.const47;
          j_355 = i_355;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_355, g_355, extraction.constCons0);
          if(term == null)
            break Fail1102;
          if(true)
            break Success300;
        }
        term = extraction.constNil0;
      }
      d_355 = term;
      term = f_355;
      term = termFactory.makeTuple(d_355, term);
      term = foldl_1_0.instance.invoke(context, term, lifted499.instance);
      if(term == null)
        break Fail1101;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}