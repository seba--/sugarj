package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted200 extends Strategy 
{ 
  TermReference t_168;

  TermReference u_168;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1841:
    { 
      IStrategoTerm w_168 = null;
      IStrategoTerm x_168 = null;
      IStrategoTerm c_169 = null;
      IStrategoTerm d_169 = null;
      w_168 = term;
      if(t_168.value == null)
        break Fail1841;
      term = termFactory.makeTuple(t_168.value, extraction.constSortNoArgs6);
      IStrategoTerm term482 = term;
      Success733:
      { 
        Fail1842:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1842;
          if(true)
            break Success733;
        }
        term = term482;
        IStrategoTerm z_168 = null;
        z_168 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_168, extraction.const138);
        if(term == null)
          break Fail1841;
        if(true)
          break Fail1841;
      }
      term = w_168;
      x_168 = w_168;
      if(u_168.value == null)
        break Fail1841;
      term = termFactory.makeTuple(u_168.value, extraction.constSortNoArgs6);
      IStrategoTerm term483 = term;
      Success734:
      { 
        Fail1843:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1843;
          if(true)
            break Success734;
        }
        term = term483;
        IStrategoTerm b_169 = null;
        b_169 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_169, extraction.const138);
        if(term == null)
          break Fail1841;
        if(true)
          break Fail1841;
      }
      term = x_168;
      d_169 = x_168;
      c_169 = term;
      term = d_169;
      IStrategoList list158;
      list158 = checkListTail(c_169);
      if(list158 == null)
        break Fail1841;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs127, list158);
      if(true)
        return term;
    }
    return null;
  }
}