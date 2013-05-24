package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted223 extends Strategy 
{ 
  TermReference q_181;

  TermReference r_181;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1784:
    { 
      IStrategoTerm t_181 = null;
      IStrategoTerm u_181 = null;
      IStrategoTerm z_181 = null;
      IStrategoTerm a_182 = null;
      t_181 = term;
      if(q_181.value == null)
        break Fail1784;
      term = termFactory.makeTuple(q_181.value, extraction.constSortNoArgs172);
      IStrategoTerm term516 = term;
      Success699:
      { 
        Fail1785:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1785;
          if(true)
            break Success699;
        }
        term = term516;
        IStrategoTerm w_181 = null;
        w_181 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_181, extraction.const444);
        if(term == null)
          break Fail1784;
        if(true)
          break Fail1784;
      }
      term = t_181;
      u_181 = t_181;
      if(r_181.value == null)
        break Fail1784;
      term = termFactory.makeTuple(r_181.value, extraction.constSortNoArgs179);
      IStrategoTerm term517 = term;
      Success700:
      { 
        Fail1786:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1786;
          if(true)
            break Success700;
        }
        term = term517;
        IStrategoTerm y_181 = null;
        y_181 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_181, extraction.const444);
        if(term == null)
          break Fail1784;
        if(true)
          break Fail1784;
      }
      term = u_181;
      a_182 = u_181;
      z_181 = term;
      term = a_182;
      IStrategoList list181;
      list181 = checkListTail(z_181);
      if(list181 == null)
        break Fail1784;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs174, list181);
      if(true)
        return term;
    }
    return null;
  }
}