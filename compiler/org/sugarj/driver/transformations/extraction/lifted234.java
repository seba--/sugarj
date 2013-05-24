package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted234 extends Strategy 
{ 
  TermReference a_188;

  TermReference b_188;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1753:
    { 
      IStrategoTerm d_188 = null;
      IStrategoTerm e_188 = null;
      IStrategoTerm j_188 = null;
      IStrategoTerm k_188 = null;
      d_188 = term;
      if(a_188.value == null)
        break Fail1753;
      term = termFactory.makeTuple(a_188.value, extraction.constSortNoArgs8);
      IStrategoTerm term536 = term;
      Success679:
      { 
        Fail1754:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1754;
          if(true)
            break Success679;
        }
        term = term536;
        IStrategoTerm g_188 = null;
        g_188 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_188, extraction.const453);
        if(term == null)
          break Fail1753;
        if(true)
          break Fail1753;
      }
      term = d_188;
      e_188 = d_188;
      if(b_188.value == null)
        break Fail1753;
      term = termFactory.makeTuple(b_188.value, extraction.constSort36);
      IStrategoTerm term537 = term;
      Success680:
      { 
        Fail1755:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1755;
          if(true)
            break Success680;
        }
        term = term537;
        IStrategoTerm i_188 = null;
        i_188 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_188, extraction.const453);
        if(term == null)
          break Fail1753;
        if(true)
          break Fail1753;
      }
      term = e_188;
      k_188 = e_188;
      j_188 = term;
      term = k_188;
      IStrategoList list192;
      list192 = checkListTail(j_188);
      if(list192 == null)
        break Fail1753;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs169, list192);
      if(true)
        return term;
    }
    return null;
  }
}