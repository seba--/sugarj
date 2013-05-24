package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted129 extends Strategy 
{ 
  TermReference w_126;

  TermReference x_126;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1994:
    { 
      IStrategoTerm z_126 = null;
      IStrategoTerm a_127 = null;
      IStrategoTerm i_127 = null;
      IStrategoTerm j_127 = null;
      z_126 = term;
      if(w_126.value == null)
        break Fail1994;
      term = termFactory.makeTuple(w_126.value, extraction.constSortNoArgs5);
      IStrategoTerm term400 = term;
      Success815:
      { 
        Fail1995:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1995;
          if(true)
            break Success815;
        }
        term = term400;
        IStrategoTerm d_127 = null;
        d_127 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_127, extraction.const387);
        if(term == null)
          break Fail1994;
        if(true)
          break Fail1994;
      }
      term = z_126;
      a_127 = z_126;
      if(x_126.value == null)
        break Fail1994;
      term = termFactory.makeTuple(x_126.value, extraction.constSortNoArgs91);
      IStrategoTerm term401 = term;
      Success816:
      { 
        Fail1996:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1996;
          if(true)
            break Success816;
        }
        term = term401;
        IStrategoTerm g_127 = null;
        g_127 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_127, extraction.const387);
        if(term == null)
          break Fail1994;
        if(true)
          break Fail1994;
      }
      term = a_127;
      j_127 = a_127;
      i_127 = term;
      term = j_127;
      IStrategoList list87;
      list87 = checkListTail(i_127);
      if(list87 == null)
        break Fail1994;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs150, list87);
      if(true)
        return term;
    }
    return null;
  }
}