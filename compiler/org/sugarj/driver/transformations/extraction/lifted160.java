package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted160 extends Strategy 
{ 
  TermReference t_146;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1932:
    { 
      IStrategoTerm x_146 = null;
      IStrategoTerm d_147 = null;
      IStrategoTerm e_147 = null;
      x_146 = term;
      if(t_146.value == null)
        break Fail1932;
      term = termFactory.makeTuple(t_146.value, extraction.constSortNoArgs93);
      IStrategoTerm term432 = term;
      Success784:
      { 
        Fail1933:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1933;
          if(true)
            break Success784;
        }
        term = term432;
        IStrategoTerm c_147 = null;
        c_147 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_147, extraction.const130);
        if(term == null)
          break Fail1932;
        if(true)
          break Fail1932;
      }
      term = x_146;
      e_147 = x_146;
      d_147 = term;
      term = e_147;
      IStrategoList list118;
      list118 = checkListTail(d_147);
      if(list118 == null)
        break Fail1932;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs119, list118);
      if(true)
        return term;
    }
    return null;
  }
}