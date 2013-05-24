package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted293 extends Strategy 
{ 
  TermReference t_222;

  TermReference u_222;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1580:
    { 
      IStrategoTerm z_222 = null;
      IStrategoTerm b_223 = null;
      IStrategoTerm h_223 = null;
      IStrategoTerm i_223 = null;
      z_222 = term;
      if(t_222.value == null)
        break Fail1580;
      term = termFactory.makeTuple(t_222.value, extraction.constSortNoArgs0);
      IStrategoTerm term650 = term;
      Success565:
      { 
        Fail1581:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1581;
          if(true)
            break Success565;
        }
        term = term650;
        IStrategoTerm d_223 = null;
        d_223 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_223, extraction.const498);
        if(term == null)
          break Fail1580;
        if(true)
          break Fail1580;
      }
      term = z_222;
      b_223 = z_222;
      if(u_222.value == null)
        break Fail1580;
      term = termFactory.makeTuple(u_222.value, extraction.constSortNoArgs0);
      IStrategoTerm term651 = term;
      Success566:
      { 
        Fail1582:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1582;
          if(true)
            break Success566;
        }
        term = term651;
        IStrategoTerm f_223 = null;
        f_223 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_223, extraction.const498);
        if(term == null)
          break Fail1580;
        if(true)
          break Fail1580;
      }
      term = b_223;
      i_223 = b_223;
      h_223 = term;
      term = i_223;
      IStrategoList list251;
      list251 = checkListTail(h_223);
      if(list251 == null)
        break Fail1580;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list251);
      if(true)
        return term;
    }
    return null;
  }
}