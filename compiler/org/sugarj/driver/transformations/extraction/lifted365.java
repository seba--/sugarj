package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted365 extends Strategy 
{ 
  TermReference h_262;

  TermReference i_262;

  TermReference j_262;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1392:
    { 
      IStrategoTerm o_262 = null;
      IStrategoTerm p_262 = null;
      IStrategoTerm q_262 = null;
      IStrategoTerm k_263 = null;
      IStrategoTerm l_263 = null;
      o_262 = term;
      if(h_262.value == null)
        break Fail1392;
      term = termFactory.makeTuple(h_262.value, extraction.constSortNoArgs0);
      IStrategoTerm term765 = term;
      Success449:
      { 
        Fail1393:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1393;
          if(true)
            break Success449;
        }
        term = term765;
        IStrategoTerm d_263 = null;
        d_263 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_263, extraction.const546);
        if(term == null)
          break Fail1392;
        if(true)
          break Fail1392;
      }
      term = o_262;
      p_262 = o_262;
      if(i_262.value == null)
        break Fail1392;
      term = termFactory.makeTuple(i_262.value, extraction.constSortNoArgs42);
      IStrategoTerm term766 = term;
      Success450:
      { 
        Fail1394:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1394;
          if(true)
            break Success450;
        }
        term = term766;
        IStrategoTerm f_263 = null;
        f_263 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_263, extraction.const546);
        if(term == null)
          break Fail1392;
        if(true)
          break Fail1392;
      }
      term = p_262;
      q_262 = p_262;
      if(j_262.value == null)
        break Fail1392;
      term = termFactory.makeTuple(j_262.value, extraction.constSortNoArgs0);
      IStrategoTerm term767 = term;
      Success451:
      { 
        Fail1395:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1395;
          if(true)
            break Success451;
        }
        term = term767;
        IStrategoTerm j_263 = null;
        j_263 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_263, extraction.const546);
        if(term == null)
          break Fail1392;
        if(true)
          break Fail1392;
      }
      term = q_262;
      l_263 = q_262;
      k_263 = term;
      term = l_263;
      IStrategoList list323;
      list323 = checkListTail(k_263);
      if(list323 == null)
        break Fail1392;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list323);
      if(true)
        return term;
    }
    return null;
  }
}