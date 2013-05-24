package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted242 extends Strategy 
{ 
  TermReference q_191;

  TermReference r_191;

  TermReference s_191;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1727:
    { 
      IStrategoTerm a_192 = null;
      IStrategoTerm b_192 = null;
      IStrategoTerm c_192 = null;
      IStrategoTerm x_192 = null;
      IStrategoTerm y_192 = null;
      a_192 = term;
      if(q_191.value == null)
        break Fail1727;
      term = termFactory.makeTuple(q_191.value, extraction.constSortNoArgs103);
      IStrategoTerm term553 = term;
      Success661:
      { 
        Fail1728:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1728;
          if(true)
            break Success661;
        }
        term = term553;
        IStrategoTerm o_192 = null;
        o_192 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_192, extraction.const457);
        if(term == null)
          break Fail1727;
        if(true)
          break Fail1727;
      }
      term = a_192;
      b_192 = a_192;
      if(r_191.value == null)
        break Fail1727;
      term = termFactory.makeTuple(r_191.value, extraction.constSortNoArgs103);
      IStrategoTerm term554 = term;
      Success662:
      { 
        Fail1729:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1729;
          if(true)
            break Success662;
        }
        term = term554;
        IStrategoTerm q_192 = null;
        q_192 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_192, extraction.const457);
        if(term == null)
          break Fail1727;
        if(true)
          break Fail1727;
      }
      term = b_192;
      c_192 = b_192;
      if(s_191.value == null)
        break Fail1727;
      term = termFactory.makeTuple(s_191.value, extraction.constSortNoArgs0);
      IStrategoTerm term555 = term;
      Success663:
      { 
        Fail1730:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1730;
          if(true)
            break Success663;
        }
        term = term555;
        IStrategoTerm w_192 = null;
        w_192 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_192, extraction.const457);
        if(term == null)
          break Fail1727;
        if(true)
          break Fail1727;
      }
      term = c_192;
      y_192 = c_192;
      x_192 = term;
      term = y_192;
      IStrategoList list200;
      list200 = checkListTail(x_192);
      if(list200 == null)
        break Fail1727;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list200);
      if(true)
        return term;
    }
    return null;
  }
}