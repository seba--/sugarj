package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted315 extends Strategy 
{ 
  TermReference t_235;

  TermReference u_235;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1523:
    { 
      IStrategoTerm w_235 = null;
      IStrategoTerm x_235 = null;
      IStrategoTerm c_236 = null;
      IStrategoTerm d_236 = null;
      w_235 = term;
      if(t_235.value == null)
        break Fail1523;
      term = termFactory.makeTuple(t_235.value, extraction.constSort39);
      IStrategoTerm term685 = term;
      Success530:
      { 
        Fail1524:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1524;
          if(true)
            break Success530;
        }
        term = term685;
        IStrategoTerm z_235 = null;
        z_235 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_235, extraction.const512);
        if(term == null)
          break Fail1523;
        if(true)
          break Fail1523;
      }
      term = w_235;
      x_235 = w_235;
      if(u_235.value == null)
        break Fail1523;
      term = termFactory.makeTuple(u_235.value, extraction.constSortNoArgs41);
      IStrategoTerm term686 = term;
      Success531:
      { 
        Fail1525:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1525;
          if(true)
            break Success531;
        }
        term = term686;
        IStrategoTerm b_236 = null;
        b_236 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_236, extraction.const512);
        if(term == null)
          break Fail1523;
        if(true)
          break Fail1523;
      }
      term = x_235;
      d_236 = x_235;
      c_236 = term;
      term = d_236;
      IStrategoList list273;
      list273 = checkListTail(c_236);
      if(list273 == null)
        break Fail1523;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list273);
      if(true)
        return term;
    }
    return null;
  }
}