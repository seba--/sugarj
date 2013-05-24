package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted137 extends Strategy 
{ 
  TermReference f_133;

  TermReference j_133;

  TermReference l_133;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1966:
    { 
      IStrategoTerm n_133 = null;
      IStrategoTerm o_133 = null;
      IStrategoTerm p_133 = null;
      IStrategoTerm t_134 = null;
      IStrategoTerm z_134 = null;
      n_133 = term;
      if(f_133.value == null)
        break Fail1966;
      term = termFactory.makeTuple(f_133.value, extraction.constSortNoArgs95);
      IStrategoTerm term419 = term;
      Success795:
      { 
        Fail1967:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1967;
          if(true)
            break Success795;
        }
        term = term419;
        IStrategoTerm u_133 = null;
        u_133 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_133, extraction.const126);
        if(term == null)
          break Fail1966;
        if(true)
          break Fail1966;
      }
      term = n_133;
      o_133 = n_133;
      if(j_133.value == null)
        break Fail1966;
      term = termFactory.makeTuple(j_133.value, extraction.constSortNoArgs96);
      IStrategoTerm term420 = term;
      Success796:
      { 
        Fail1968:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1968;
          if(true)
            break Success796;
        }
        term = term420;
        IStrategoTerm q_134 = null;
        q_134 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_134, extraction.const126);
        if(term == null)
          break Fail1966;
        if(true)
          break Fail1966;
      }
      term = o_133;
      p_133 = o_133;
      if(l_133.value == null)
        break Fail1966;
      term = termFactory.makeTuple(l_133.value, extraction.constSortNoArgs99);
      IStrategoTerm term421 = term;
      Success797:
      { 
        Fail1969:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1969;
          if(true)
            break Success797;
        }
        term = term421;
        IStrategoTerm s_134 = null;
        s_134 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_134, extraction.const126);
        if(term == null)
          break Fail1966;
        if(true)
          break Fail1966;
      }
      term = p_133;
      z_134 = p_133;
      t_134 = term;
      term = z_134;
      IStrategoList list95;
      list95 = checkListTail(t_134);
      if(list95 == null)
        break Fail1966;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs115, list95);
      if(true)
        return term;
    }
    return null;
  }
}