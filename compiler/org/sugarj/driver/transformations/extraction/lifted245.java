package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted245 extends Strategy 
{ 
  TermReference p_194;

  TermReference q_194;

  TermReference r_194;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1715:
    { 
      IStrategoTerm t_194 = null;
      IStrategoTerm u_194 = null;
      IStrategoTerm v_194 = null;
      IStrategoTerm f_195 = null;
      IStrategoTerm g_195 = null;
      t_194 = term;
      if(p_194.value == null)
        break Fail1715;
      term = termFactory.makeTuple(p_194.value, extraction.constSortNoArgs0);
      IStrategoTerm term562 = term;
      Success652:
      { 
        Fail1716:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1716;
          if(true)
            break Success652;
        }
        term = term562;
        IStrategoTerm a_195 = null;
        a_195 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_195, extraction.const459);
        if(term == null)
          break Fail1715;
        if(true)
          break Fail1715;
      }
      term = t_194;
      u_194 = t_194;
      if(q_194.value == null)
        break Fail1715;
      term = termFactory.makeTuple(q_194.value, extraction.constSortNoArgs103);
      IStrategoTerm term563 = term;
      Success653:
      { 
        Fail1717:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1717;
          if(true)
            break Success653;
        }
        term = term563;
        IStrategoTerm c_195 = null;
        c_195 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_195, extraction.const459);
        if(term == null)
          break Fail1715;
        if(true)
          break Fail1715;
      }
      term = u_194;
      v_194 = u_194;
      if(r_194.value == null)
        break Fail1715;
      term = termFactory.makeTuple(r_194.value, extraction.constSortNoArgs0);
      IStrategoTerm term564 = term;
      Success654:
      { 
        Fail1718:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1718;
          if(true)
            break Success654;
        }
        term = term564;
        IStrategoTerm e_195 = null;
        e_195 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_195, extraction.const459);
        if(term == null)
          break Fail1715;
        if(true)
          break Fail1715;
      }
      term = v_194;
      g_195 = v_194;
      f_195 = term;
      term = g_195;
      IStrategoList list203;
      list203 = checkListTail(f_195);
      if(list203 == null)
        break Fail1715;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list203);
      if(true)
        return term;
    }
    return null;
  }
}