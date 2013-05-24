package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted260 extends Strategy 
{ 
  TermReference o_203;

  TermReference p_203;

  TermReference r_203;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1661:
    { 
      IStrategoTerm t_203 = null;
      IStrategoTerm w_203 = null;
      IStrategoTerm x_203 = null;
      IStrategoTerm h_204 = null;
      IStrategoTerm i_204 = null;
      t_203 = term;
      if(o_203.value == null)
        break Fail1661;
      term = termFactory.makeTuple(o_203.value, extraction.constSortNoArgs41);
      IStrategoTerm term601 = term;
      Success613:
      { 
        Fail1662:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1662;
          if(true)
            break Success613;
        }
        term = term601;
        IStrategoTerm c_204 = null;
        c_204 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_204, extraction.const190);
        if(term == null)
          break Fail1661;
        if(true)
          break Fail1661;
      }
      term = t_203;
      w_203 = t_203;
      if(p_203.value == null)
        break Fail1661;
      term = termFactory.makeTuple(p_203.value, extraction.constSortNoArgs41);
      IStrategoTerm term602 = term;
      Success614:
      { 
        Fail1663:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1663;
          if(true)
            break Success614;
        }
        term = term602;
        IStrategoTerm e_204 = null;
        e_204 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_204, extraction.const190);
        if(term == null)
          break Fail1661;
        if(true)
          break Fail1661;
      }
      term = w_203;
      x_203 = w_203;
      if(r_203.value == null)
        break Fail1661;
      term = termFactory.makeTuple(r_203.value, extraction.constSortNoArgs0);
      IStrategoTerm term603 = term;
      Success615:
      { 
        Fail1664:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1664;
          if(true)
            break Success615;
        }
        term = term603;
        IStrategoTerm g_204 = null;
        g_204 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_204, extraction.const190);
        if(term == null)
          break Fail1661;
        if(true)
          break Fail1661;
      }
      term = x_203;
      i_204 = x_203;
      h_204 = term;
      term = i_204;
      IStrategoList list218;
      list218 = checkListTail(h_204);
      if(list218 == null)
        break Fail1661;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs179, list218);
      if(true)
        return term;
    }
    return null;
  }
}