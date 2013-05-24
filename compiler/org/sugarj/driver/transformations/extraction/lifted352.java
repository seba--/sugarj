package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted352 extends Strategy 
{ 
  TermReference r_255;

  TermReference s_255;

  TermReference t_255;

  TermReference u_255;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1427:
    { 
      IStrategoTerm w_255 = null;
      IStrategoTerm x_255 = null;
      IStrategoTerm y_255 = null;
      IStrategoTerm z_255 = null;
      IStrategoTerm l_256 = null;
      IStrategoTerm m_256 = null;
      w_255 = term;
      if(r_255.value == null)
        break Fail1427;
      term = termFactory.makeTuple(r_255.value, extraction.constSortNoArgs8);
      IStrategoTerm term742 = term;
      Success471:
      { 
        Fail1428:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1428;
          if(true)
            break Success471;
        }
        term = term742;
        IStrategoTerm c_256 = null;
        c_256 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_256, extraction.const537);
        if(term == null)
          break Fail1427;
        if(true)
          break Fail1427;
      }
      term = w_255;
      x_255 = w_255;
      if(s_255.value == null)
        break Fail1427;
      term = termFactory.makeTuple(s_255.value, extraction.constSort36);
      IStrategoTerm term743 = term;
      Success472:
      { 
        Fail1429:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1429;
          if(true)
            break Success472;
        }
        term = term743;
        IStrategoTerm f_256 = null;
        f_256 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_256, extraction.const537);
        if(term == null)
          break Fail1427;
        if(true)
          break Fail1427;
      }
      term = x_255;
      y_255 = x_255;
      if(t_255.value == null)
        break Fail1427;
      term = termFactory.makeTuple(t_255.value, extraction.constSort36);
      IStrategoTerm term744 = term;
      Success473:
      { 
        Fail1430:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1430;
          if(true)
            break Success473;
        }
        term = term744;
        IStrategoTerm h_256 = null;
        h_256 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_256, extraction.const537);
        if(term == null)
          break Fail1427;
        if(true)
          break Fail1427;
      }
      term = y_255;
      z_255 = y_255;
      if(u_255.value == null)
        break Fail1427;
      term = termFactory.makeTuple(u_255.value, extraction.constSortNoArgs0);
      IStrategoTerm term745 = term;
      Success474:
      { 
        Fail1431:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1431;
          if(true)
            break Success474;
        }
        term = term745;
        IStrategoTerm k_256 = null;
        k_256 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_256, extraction.const537);
        if(term == null)
          break Fail1427;
        if(true)
          break Fail1427;
      }
      term = z_255;
      m_256 = z_255;
      l_256 = term;
      term = m_256;
      IStrategoList list310;
      list310 = checkListTail(l_256);
      if(list310 == null)
        break Fail1427;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs53, list310);
      if(true)
        return term;
    }
    return null;
  }
}