package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted434 extends Strategy 
{ 
  TermReference w_305;

  TermReference x_305;

  TermReference y_305;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1245:
    { 
      IStrategoTerm a_306 = null;
      IStrategoTerm b_306 = null;
      IStrategoTerm c_306 = null;
      IStrategoTerm j_306 = null;
      IStrategoTerm k_306 = null;
      a_306 = term;
      if(w_305.value == null)
        break Fail1245;
      term = termFactory.makeTuple(w_305.value, extraction.constSortNoArgs296);
      IStrategoTerm term843 = term;
      Success371:
      { 
        Fail1246:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1246;
          if(true)
            break Success371;
        }
        term = term843;
        IStrategoTerm e_306 = null;
        e_306 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_306, extraction.const594);
        if(term == null)
          break Fail1245;
        if(true)
          break Fail1245;
      }
      term = a_306;
      b_306 = a_306;
      if(x_305.value == null)
        break Fail1245;
      term = termFactory.makeTuple(x_305.value, extraction.constSortNoArgs75);
      IStrategoTerm term844 = term;
      Success372:
      { 
        Fail1247:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1247;
          if(true)
            break Success372;
        }
        term = term844;
        IStrategoTerm g_306 = null;
        g_306 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_306, extraction.const594);
        if(term == null)
          break Fail1245;
        if(true)
          break Fail1245;
      }
      term = b_306;
      c_306 = b_306;
      if(y_305.value == null)
        break Fail1245;
      term = termFactory.makeTuple(y_305.value, extraction.constSortNoArgs296);
      IStrategoTerm term845 = term;
      Success373:
      { 
        Fail1248:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1248;
          if(true)
            break Success373;
        }
        term = term845;
        IStrategoTerm i_306 = null;
        i_306 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_306, extraction.const594);
        if(term == null)
          break Fail1245;
        if(true)
          break Fail1245;
      }
      term = c_306;
      k_306 = c_306;
      j_306 = term;
      term = k_306;
      IStrategoList list392;
      list392 = checkListTail(j_306);
      if(list392 == null)
        break Fail1245;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs63, list392);
      if(true)
        return term;
    }
    return null;
  }
}