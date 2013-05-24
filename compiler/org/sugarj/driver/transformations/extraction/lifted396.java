package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted396 extends Strategy 
{ 
  TermReference u_278;

  TermReference v_278;

  TermReference w_278;

  TermReference x_278;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1320:
    { 
      IStrategoTerm z_278 = null;
      IStrategoTerm a_279 = null;
      IStrategoTerm c_279 = null;
      IStrategoTerm d_279 = null;
      IStrategoTerm o_279 = null;
      IStrategoTerm p_279 = null;
      z_278 = term;
      if(u_278.value == null)
        break Fail1320;
      term = termFactory.makeTuple(u_278.value, extraction.constSortNoArgs237);
      IStrategoTerm term805 = term;
      Success408:
      { 
        Fail1321:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1321;
          if(true)
            break Success408;
        }
        term = term805;
        IStrategoTerm f_279 = null;
        f_279 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_279, extraction.const570);
        if(term == null)
          break Fail1320;
        if(true)
          break Fail1320;
      }
      term = z_278;
      a_279 = z_278;
      if(v_278.value == null)
        break Fail1320;
      term = termFactory.makeTuple(v_278.value, extraction.constSort6);
      IStrategoTerm term806 = term;
      Success409:
      { 
        Fail1322:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1322;
          if(true)
            break Success409;
        }
        term = term806;
        IStrategoTerm i_279 = null;
        i_279 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_279, extraction.const570);
        if(term == null)
          break Fail1320;
        if(true)
          break Fail1320;
      }
      term = a_279;
      c_279 = a_279;
      if(w_278.value == null)
        break Fail1320;
      term = termFactory.makeTuple(w_278.value, extraction.constSortNoArgs71);
      IStrategoTerm term807 = term;
      Success410:
      { 
        Fail1323:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1323;
          if(true)
            break Success410;
        }
        term = term807;
        IStrategoTerm k_279 = null;
        k_279 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_279, extraction.const570);
        if(term == null)
          break Fail1320;
        if(true)
          break Fail1320;
      }
      term = c_279;
      d_279 = c_279;
      if(x_278.value == null)
        break Fail1320;
      term = termFactory.makeTuple(x_278.value, extraction.constSortNoArgs270);
      IStrategoTerm term808 = term;
      Success411:
      { 
        Fail1324:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1324;
          if(true)
            break Success411;
        }
        term = term808;
        IStrategoTerm n_279 = null;
        n_279 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_279, extraction.const570);
        if(term == null)
          break Fail1320;
        if(true)
          break Fail1320;
      }
      term = d_279;
      p_279 = d_279;
      o_279 = term;
      term = p_279;
      IStrategoList list354;
      list354 = checkListTail(o_279);
      if(list354 == null)
        break Fail1320;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs73, list354);
      if(true)
        return term;
    }
    return null;
  }
}