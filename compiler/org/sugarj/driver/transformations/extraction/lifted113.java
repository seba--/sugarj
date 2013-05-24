package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted113 extends Strategy 
{ 
  TermReference r_119;

  TermReference t_119;

  TermReference u_119;

  TermReference w_119;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2028:
    { 
      IStrategoTerm y_119 = null;
      IStrategoTerm z_119 = null;
      IStrategoTerm c_120 = null;
      IStrategoTerm g_120 = null;
      IStrategoTerm x_120 = null;
      IStrategoTerm y_120 = null;
      y_119 = term;
      if(r_119.value == null)
        break Fail2028;
      term = termFactory.makeTuple(r_119.value, extraction.constSortNoArgs30);
      IStrategoTerm term380 = term;
      Success833:
      { 
        Fail2029:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2029;
          if(true)
            break Success833;
        }
        term = term380;
        IStrategoTerm o_120 = null;
        o_120 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_120, extraction.const379);
        if(term == null)
          break Fail2028;
        if(true)
          break Fail2028;
      }
      term = y_119;
      z_119 = y_119;
      if(t_119.value == null)
        break Fail2028;
      term = termFactory.makeTuple(t_119.value, extraction.constSortNoArgs92);
      IStrategoTerm term381 = term;
      Success834:
      { 
        Fail2030:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2030;
          if(true)
            break Success834;
        }
        term = term381;
        IStrategoTerm q_120 = null;
        q_120 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_120, extraction.const379);
        if(term == null)
          break Fail2028;
        if(true)
          break Fail2028;
      }
      term = z_119;
      c_120 = z_119;
      if(u_119.value == null)
        break Fail2028;
      term = termFactory.makeTuple(u_119.value, extraction.constSort24);
      IStrategoTerm term382 = term;
      Success835:
      { 
        Fail2031:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2031;
          if(true)
            break Success835;
        }
        term = term382;
        IStrategoTerm s_120 = null;
        s_120 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_120, extraction.const379);
        if(term == null)
          break Fail2028;
        if(true)
          break Fail2028;
      }
      term = c_120;
      g_120 = c_120;
      if(w_119.value == null)
        break Fail2028;
      term = termFactory.makeTuple(w_119.value, extraction.constSortNoArgs309);
      IStrategoTerm term383 = term;
      Success836:
      { 
        Fail2032:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2032;
          if(true)
            break Success836;
        }
        term = term383;
        IStrategoTerm v_120 = null;
        v_120 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_120, extraction.const379);
        if(term == null)
          break Fail2028;
        if(true)
          break Fail2028;
      }
      term = g_120;
      y_120 = g_120;
      x_120 = term;
      term = y_120;
      IStrategoList list71;
      list71 = checkListTail(x_120);
      if(list71 == null)
        break Fail2028;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list71);
      if(true)
        return term;
    }
    return null;
  }
}