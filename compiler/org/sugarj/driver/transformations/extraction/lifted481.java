package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted481 extends Strategy 
{ 
  TermReference c_330;

  TermReference d_330;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1138:
    { 
      IStrategoTerm f_330 = null;
      IStrategoTerm g_330 = null;
      IStrategoTerm n_330 = null;
      IStrategoTerm o_330 = null;
      f_330 = term;
      if(c_330.value == null)
        break Fail1138;
      term = termFactory.makeTuple(c_330.value, extraction.constSortNoArgs314);
      IStrategoTerm term904 = term;
      Success311:
      { 
        Fail1139:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1139;
          if(true)
            break Success311;
        }
        term = term904;
        IStrategoTerm k_330 = null;
        k_330 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_330, extraction.const649);
        if(term == null)
          break Fail1138;
        if(true)
          break Fail1138;
      }
      term = f_330;
      g_330 = f_330;
      if(d_330.value == null)
        break Fail1138;
      term = termFactory.makeTuple(d_330.value, extraction.constSortNoArgs315);
      IStrategoTerm term905 = term;
      Success312:
      { 
        Fail1140:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1140;
          if(true)
            break Success312;
        }
        term = term905;
        IStrategoTerm m_330 = null;
        m_330 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_330, extraction.const649);
        if(term == null)
          break Fail1138;
        if(true)
          break Fail1138;
      }
      term = g_330;
      o_330 = g_330;
      n_330 = term;
      term = o_330;
      IStrategoList list439;
      list439 = checkListTail(n_330);
      if(list439 == null)
        break Fail1138;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs316, list439);
      if(true)
        return term;
    }
    return null;
  }
}