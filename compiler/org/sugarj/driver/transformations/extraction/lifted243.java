package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted243 extends Strategy 
{ 
  TermReference d_193;

  TermReference e_193;

  TermReference f_193;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1723:
    { 
      IStrategoTerm h_193 = null;
      IStrategoTerm i_193 = null;
      IStrategoTerm j_193 = null;
      IStrategoTerm b_194 = null;
      IStrategoTerm c_194 = null;
      h_193 = term;
      if(d_193.value == null)
        break Fail1723;
      term = termFactory.makeTuple(d_193.value, extraction.constSortNoArgs0);
      IStrategoTerm term556 = term;
      Success658:
      { 
        Fail1724:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1724;
          if(true)
            break Success658;
        }
        term = term556;
        IStrategoTerm v_193 = null;
        v_193 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_193, extraction.const458);
        if(term == null)
          break Fail1723;
        if(true)
          break Fail1723;
      }
      term = h_193;
      i_193 = h_193;
      if(e_193.value == null)
        break Fail1723;
      term = termFactory.makeTuple(e_193.value, extraction.constSortNoArgs103);
      IStrategoTerm term557 = term;
      Success659:
      { 
        Fail1725:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1725;
          if(true)
            break Success659;
        }
        term = term557;
        IStrategoTerm y_193 = null;
        y_193 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_193, extraction.const458);
        if(term == null)
          break Fail1723;
        if(true)
          break Fail1723;
      }
      term = i_193;
      j_193 = i_193;
      if(f_193.value == null)
        break Fail1723;
      term = termFactory.makeTuple(f_193.value, extraction.constSortNoArgs0);
      IStrategoTerm term558 = term;
      Success660:
      { 
        Fail1726:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1726;
          if(true)
            break Success660;
        }
        term = term558;
        IStrategoTerm a_194 = null;
        a_194 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_194, extraction.const458);
        if(term == null)
          break Fail1723;
        if(true)
          break Fail1723;
      }
      term = j_193;
      c_194 = j_193;
      b_194 = term;
      term = c_194;
      IStrategoList list201;
      list201 = checkListTail(b_194);
      if(list201 == null)
        break Fail1723;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list201);
      if(true)
        return term;
    }
    return null;
  }
}