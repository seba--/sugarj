package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted442 extends Strategy 
{ 
  TermReference e_310;

  TermReference f_310;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1227:
    { 
      IStrategoTerm h_310 = null;
      IStrategoTerm i_310 = null;
      IStrategoTerm n_310 = null;
      IStrategoTerm o_310 = null;
      h_310 = term;
      if(e_310.value == null)
        break Fail1227;
      term = termFactory.makeTuple(e_310.value, extraction.constSortNoArgs71);
      IStrategoTerm term854 = term;
      Success361:
      { 
        Fail1228:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1228;
          if(true)
            break Success361;
        }
        term = term854;
        IStrategoTerm k_310 = null;
        k_310 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_310, extraction.const610);
        if(term == null)
          break Fail1227;
        if(true)
          break Fail1227;
      }
      term = h_310;
      i_310 = h_310;
      if(f_310.value == null)
        break Fail1227;
      term = termFactory.makeTuple(f_310.value, extraction.constSort6);
      IStrategoTerm term855 = term;
      Success362:
      { 
        Fail1229:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1229;
          if(true)
            break Success362;
        }
        term = term855;
        IStrategoTerm m_310 = null;
        m_310 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_310, extraction.const610);
        if(term == null)
          break Fail1227;
        if(true)
          break Fail1227;
      }
      term = i_310;
      o_310 = i_310;
      n_310 = term;
      term = o_310;
      IStrategoList list400;
      list400 = checkListTail(n_310);
      if(list400 == null)
        break Fail1227;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list400);
      if(true)
        return term;
    }
    return null;
  }
}