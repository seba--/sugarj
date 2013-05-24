package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted88 extends Strategy 
{ 
  TermReference r_107;

  TermReference s_107;

  TermReference t_107;

  TermReference u_107;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2091:
    { 
      IStrategoTerm w_107 = null;
      IStrategoTerm x_107 = null;
      IStrategoTerm y_107 = null;
      IStrategoTerm z_107 = null;
      IStrategoTerm i_108 = null;
      IStrategoTerm j_108 = null;
      w_107 = term;
      if(r_107.value == null)
        break Fail2091;
      term = termFactory.makeTuple(r_107.value, extraction.constSortNoArgs88);
      IStrategoTerm term342 = term;
      Success871:
      { 
        Fail2092:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2092;
          if(true)
            break Success871;
        }
        term = term342;
        IStrategoTerm b_108 = null;
        b_108 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_108, extraction.const359);
        if(term == null)
          break Fail2091;
        if(true)
          break Fail2091;
      }
      term = w_107;
      x_107 = w_107;
      if(s_107.value == null)
        break Fail2091;
      term = termFactory.makeTuple(s_107.value, extraction.constSortNoArgs294);
      IStrategoTerm term343 = term;
      Success872:
      { 
        Fail2093:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2093;
          if(true)
            break Success872;
        }
        term = term343;
        IStrategoTerm d_108 = null;
        d_108 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_108, extraction.const359);
        if(term == null)
          break Fail2091;
        if(true)
          break Fail2091;
      }
      term = x_107;
      y_107 = x_107;
      if(t_107.value == null)
        break Fail2091;
      term = termFactory.makeTuple(t_107.value, extraction.constSortNoArgs294);
      IStrategoTerm term344 = term;
      Success873:
      { 
        Fail2094:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2094;
          if(true)
            break Success873;
        }
        term = term344;
        IStrategoTerm f_108 = null;
        f_108 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_108, extraction.const359);
        if(term == null)
          break Fail2091;
        if(true)
          break Fail2091;
      }
      term = y_107;
      z_107 = y_107;
      if(u_107.value == null)
        break Fail2091;
      term = termFactory.makeTuple(u_107.value, extraction.constSortNoArgs269);
      IStrategoTerm term345 = term;
      Success874:
      { 
        Fail2095:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2095;
          if(true)
            break Success874;
        }
        term = term345;
        IStrategoTerm h_108 = null;
        h_108 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_108, extraction.const359);
        if(term == null)
          break Fail2091;
        if(true)
          break Fail2091;
      }
      term = z_107;
      j_108 = z_107;
      i_108 = term;
      term = j_108;
      IStrategoList list46;
      list46 = checkListTail(i_108);
      if(list46 == null)
        break Fail2091;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs313, list46);
      if(true)
        return term;
    }
    return null;
  }
}