package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted370 extends Strategy 
{ 
  TermReference f_266;

  TermReference g_266;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1379:
    { 
      IStrategoTerm i_266 = null;
      IStrategoTerm j_266 = null;
      IStrategoTerm o_266 = null;
      IStrategoTerm p_266 = null;
      i_266 = term;
      if(f_266.value == null)
        break Fail1379;
      term = termFactory.makeTuple(f_266.value, extraction.constSortNoArgs22);
      IStrategoTerm term774 = term;
      Success441:
      { 
        Fail1380:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1380;
          if(true)
            break Success441;
        }
        term = term774;
        IStrategoTerm l_266 = null;
        l_266 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_266, extraction.const76);
        if(term == null)
          break Fail1379;
        if(true)
          break Fail1379;
      }
      term = i_266;
      j_266 = i_266;
      if(g_266.value == null)
        break Fail1379;
      term = termFactory.makeTuple(g_266.value, extraction.constSort44);
      IStrategoTerm term775 = term;
      Success442:
      { 
        Fail1381:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1381;
          if(true)
            break Success442;
        }
        term = term775;
        IStrategoTerm n_266 = null;
        n_266 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_266, extraction.const76);
        if(term == null)
          break Fail1379;
        if(true)
          break Fail1379;
      }
      term = j_266;
      p_266 = j_266;
      o_266 = term;
      term = p_266;
      IStrategoList list328;
      list328 = checkListTail(o_266);
      if(list328 == null)
        break Fail1379;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs65, list328);
      if(true)
        return term;
    }
    return null;
  }
}