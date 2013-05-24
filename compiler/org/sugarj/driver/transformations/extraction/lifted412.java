package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted412 extends Strategy 
{ 
  TermReference g_287;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1291:
    { 
      IStrategoTerm i_287 = null;
      IStrategoTerm m_287 = null;
      IStrategoTerm n_287 = null;
      i_287 = term;
      if(g_287.value == null)
        break Fail1291;
      term = termFactory.makeTuple(g_287.value, extraction.constSortNoArgs62);
      IStrategoTerm term821 = term;
      Success395:
      { 
        Fail1292:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1292;
          if(true)
            break Success395;
        }
        term = term821;
        IStrategoTerm l_287 = null;
        l_287 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_287, extraction.const585);
        if(term == null)
          break Fail1291;
        if(true)
          break Fail1291;
      }
      term = i_287;
      n_287 = i_287;
      m_287 = term;
      term = n_287;
      IStrategoList list370;
      list370 = checkListTail(m_287);
      if(list370 == null)
        break Fail1291;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs242, list370);
      if(true)
        return term;
    }
    return null;
  }
}