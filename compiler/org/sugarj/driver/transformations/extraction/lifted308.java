package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted308 extends Strategy 
{ 
  TermReference q_231;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1540:
    { 
      IStrategoTerm t_231 = null;
      IStrategoTerm x_231 = null;
      IStrategoTerm y_231 = null;
      t_231 = term;
      if(q_231.value == null)
        break Fail1540;
      term = termFactory.makeTuple(q_231.value, extraction.constSortNoArgs51);
      IStrategoTerm term676 = term;
      Success540:
      { 
        Fail1541:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1541;
          if(true)
            break Success540;
        }
        term = term676;
        IStrategoTerm v_231 = null;
        v_231 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_231, extraction.const508);
        if(term == null)
          break Fail1540;
        if(true)
          break Fail1540;
      }
      term = t_231;
      y_231 = t_231;
      x_231 = term;
      term = y_231;
      IStrategoList list266;
      list266 = checkListTail(x_231);
      if(list266 == null)
        break Fail1540;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs41, list266);
      if(true)
        return term;
    }
    return null;
  }
}