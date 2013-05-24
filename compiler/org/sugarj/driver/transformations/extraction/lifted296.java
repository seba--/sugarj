package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted296 extends Strategy 
{ 
  TermReference a_225;

  TermReference b_225;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1570:
    { 
      IStrategoTerm d_225 = null;
      IStrategoTerm e_225 = null;
      IStrategoTerm j_225 = null;
      IStrategoTerm k_225 = null;
      d_225 = term;
      if(a_225.value == null)
        break Fail1570;
      term = termFactory.makeTuple(a_225.value, extraction.constSortNoArgs0);
      IStrategoTerm term657 = term;
      Success558:
      { 
        Fail1571:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1571;
          if(true)
            break Success558;
        }
        term = term657;
        IStrategoTerm g_225 = null;
        g_225 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_225, extraction.const501);
        if(term == null)
          break Fail1570;
        if(true)
          break Fail1570;
      }
      term = d_225;
      e_225 = d_225;
      if(b_225.value == null)
        break Fail1570;
      term = termFactory.makeTuple(b_225.value, extraction.constSort40);
      IStrategoTerm term658 = term;
      Success559:
      { 
        Fail1572:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1572;
          if(true)
            break Success559;
        }
        term = term658;
        IStrategoTerm i_225 = null;
        i_225 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_225, extraction.const501);
        if(term == null)
          break Fail1570;
        if(true)
          break Fail1570;
      }
      term = e_225;
      k_225 = e_225;
      j_225 = term;
      term = k_225;
      IStrategoList list254;
      list254 = checkListTail(j_225);
      if(list254 == null)
        break Fail1570;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list254);
      if(true)
        return term;
    }
    return null;
  }
}