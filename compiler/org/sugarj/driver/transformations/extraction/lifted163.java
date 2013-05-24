package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted163 extends Strategy 
{ 
  TermReference w_148;

  TermReference x_148;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1923:
    { 
      IStrategoTerm z_148 = null;
      IStrategoTerm a_149 = null;
      IStrategoTerm f_149 = null;
      IStrategoTerm g_149 = null;
      z_148 = term;
      if(w_148.value == null)
        break Fail1923;
      term = termFactory.makeTuple(w_148.value, extraction.constSortNoArgs93);
      IStrategoTerm term437 = term;
      Success778:
      { 
        Fail1924:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1924;
          if(true)
            break Success778;
        }
        term = term437;
        IStrategoTerm c_149 = null;
        c_149 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_149, extraction.const414);
        if(term == null)
          break Fail1923;
        if(true)
          break Fail1923;
      }
      term = z_148;
      a_149 = z_148;
      if(x_148.value == null)
        break Fail1923;
      term = termFactory.makeTuple(x_148.value, extraction.constSortNoArgs121);
      IStrategoTerm term438 = term;
      Success779:
      { 
        Fail1925:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1925;
          if(true)
            break Success779;
        }
        term = term438;
        IStrategoTerm e_149 = null;
        e_149 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_149, extraction.const414);
        if(term == null)
          break Fail1923;
        if(true)
          break Fail1923;
      }
      term = a_149;
      g_149 = a_149;
      f_149 = term;
      term = g_149;
      IStrategoList list121;
      list121 = checkListTail(f_149);
      if(list121 == null)
        break Fail1923;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs123, list121);
      if(true)
        return term;
    }
    return null;
  }
}