package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted65 extends Strategy 
{ 
  TermReference t_99;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2140:
    { 
      IStrategoTerm v_99 = null;
      IStrategoTerm z_99 = null;
      IStrategoTerm a_100 = null;
      v_99 = term;
      if(t_99.value == null)
        break Fail2140;
      term = termFactory.makeTuple(t_99.value, extraction.constSortNoArgs267);
      IStrategoTerm term319 = term;
      Success897:
      { 
        Fail2141:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2141;
          if(true)
            break Success897;
        }
        term = term319;
        IStrategoTerm y_99 = null;
        y_99 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_99, extraction.const345);
        if(term == null)
          break Fail2140;
        if(true)
          break Fail2140;
      }
      term = v_99;
      a_100 = v_99;
      z_99 = term;
      term = a_100;
      IStrategoList list23;
      list23 = checkListTail(z_99);
      if(list23 == null)
        break Fail2140;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list23);
      if(true)
        return term;
    }
    return null;
  }
}