package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted217 extends Strategy 
{ 
  TermReference y_177;

  TermReference z_177;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1800:
    { 
      IStrategoTerm b_178 = null;
      IStrategoTerm c_178 = null;
      IStrategoTerm h_178 = null;
      IStrategoTerm i_178 = null;
      b_178 = term;
      if(y_177.value == null)
        break Fail1800;
      term = termFactory.makeTuple(y_177.value, extraction.constSortNoArgs102);
      IStrategoTerm term506 = term;
      Success709:
      { 
        Fail1801:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1801;
          if(true)
            break Success709;
        }
        term = term506;
        IStrategoTerm e_178 = null;
        e_178 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_178, extraction.const439);
        if(term == null)
          break Fail1800;
        if(true)
          break Fail1800;
      }
      term = b_178;
      c_178 = b_178;
      if(z_177.value == null)
        break Fail1800;
      term = termFactory.makeTuple(z_177.value, extraction.constSortNoArgs0);
      IStrategoTerm term507 = term;
      Success710:
      { 
        Fail1802:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1802;
          if(true)
            break Success710;
        }
        term = term507;
        IStrategoTerm g_178 = null;
        g_178 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_178, extraction.const439);
        if(term == null)
          break Fail1800;
        if(true)
          break Fail1800;
      }
      term = c_178;
      i_178 = c_178;
      h_178 = term;
      term = i_178;
      IStrategoList list175;
      list175 = checkListTail(h_178);
      if(list175 == null)
        break Fail1800;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list175);
      if(true)
        return term;
    }
    return null;
  }
}