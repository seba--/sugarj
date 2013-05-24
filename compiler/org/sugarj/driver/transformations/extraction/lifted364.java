package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted364 extends Strategy 
{ 
  TermReference h_262;

  TermReference i_262;

  TermReference j_262;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1396:
    { 
      IStrategoTerm l_262 = null;
      IStrategoTerm m_262 = null;
      IStrategoTerm n_262 = null;
      IStrategoTerm a_263 = null;
      IStrategoTerm b_263 = null;
      l_262 = term;
      if(h_262.value == null)
        break Fail1396;
      term = termFactory.makeTuple(h_262.value, extraction.constSortNoArgs0);
      IStrategoTerm term762 = term;
      Success452:
      { 
        Fail1397:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1397;
          if(true)
            break Success452;
        }
        term = term762;
        IStrategoTerm t_262 = null;
        t_262 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_262, extraction.const546);
        if(term == null)
          break Fail1396;
        if(true)
          break Fail1396;
      }
      term = l_262;
      m_262 = l_262;
      if(i_262.value == null)
        break Fail1396;
      term = termFactory.makeTuple(i_262.value, extraction.constSortNoArgs42);
      IStrategoTerm term763 = term;
      Success453:
      { 
        Fail1398:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1398;
          if(true)
            break Success453;
        }
        term = term763;
        IStrategoTerm x_262 = null;
        x_262 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_262, extraction.const546);
        if(term == null)
          break Fail1396;
        if(true)
          break Fail1396;
      }
      term = m_262;
      n_262 = m_262;
      if(j_262.value == null)
        break Fail1396;
      term = termFactory.makeTuple(j_262.value, extraction.constSortNoArgs0);
      IStrategoTerm term764 = term;
      Success454:
      { 
        Fail1399:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1399;
          if(true)
            break Success454;
        }
        term = term764;
        IStrategoTerm z_262 = null;
        z_262 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_262, extraction.const546);
        if(term == null)
          break Fail1396;
        if(true)
          break Fail1396;
      }
      term = n_262;
      b_263 = n_262;
      a_263 = term;
      term = b_263;
      IStrategoList list322;
      list322 = checkListTail(a_263);
      if(list322 == null)
        break Fail1396;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list322);
      if(true)
        return term;
    }
    return null;
  }
}