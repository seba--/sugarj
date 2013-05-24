package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted244 extends Strategy 
{ 
  TermReference d_193;

  TermReference e_193;

  TermReference f_193;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1719:
    { 
      IStrategoTerm k_193 = null;
      IStrategoTerm o_193 = null;
      IStrategoTerm p_193 = null;
      IStrategoTerm j_194 = null;
      IStrategoTerm k_194 = null;
      k_193 = term;
      if(d_193.value == null)
        break Fail1719;
      term = termFactory.makeTuple(d_193.value, extraction.constSortNoArgs0);
      IStrategoTerm term559 = term;
      Success655:
      { 
        Fail1720:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1720;
          if(true)
            break Success655;
        }
        term = term559;
        IStrategoTerm e_194 = null;
        e_194 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_194, extraction.const458);
        if(term == null)
          break Fail1719;
        if(true)
          break Fail1719;
      }
      term = k_193;
      o_193 = k_193;
      if(e_193.value == null)
        break Fail1719;
      term = termFactory.makeTuple(e_193.value, extraction.constSortNoArgs103);
      IStrategoTerm term560 = term;
      Success656:
      { 
        Fail1721:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1721;
          if(true)
            break Success656;
        }
        term = term560;
        IStrategoTerm g_194 = null;
        g_194 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_194, extraction.const458);
        if(term == null)
          break Fail1719;
        if(true)
          break Fail1719;
      }
      term = o_193;
      p_193 = o_193;
      if(f_193.value == null)
        break Fail1719;
      term = termFactory.makeTuple(f_193.value, extraction.constSortNoArgs0);
      IStrategoTerm term561 = term;
      Success657:
      { 
        Fail1722:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1722;
          if(true)
            break Success657;
        }
        term = term561;
        IStrategoTerm i_194 = null;
        i_194 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_194, extraction.const458);
        if(term == null)
          break Fail1719;
        if(true)
          break Fail1719;
      }
      term = p_193;
      k_194 = p_193;
      j_194 = term;
      term = k_194;
      IStrategoList list202;
      list202 = checkListTail(j_194);
      if(list202 == null)
        break Fail1719;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list202);
      if(true)
        return term;
    }
    return null;
  }
}