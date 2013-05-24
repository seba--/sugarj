package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted187 extends Strategy 
{ 
  TermReference u_160;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1871:
    { 
      IStrategoTerm w_160 = null;
      IStrategoTerm a_161 = null;
      IStrategoTerm b_161 = null;
      w_160 = term;
      if(u_160.value == null)
        break Fail1871;
      term = termFactory.makeTuple(u_160.value, extraction.constSort31);
      IStrategoTerm term466 = term;
      Success750:
      { 
        Fail1872:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1872;
          if(true)
            break Success750;
        }
        term = term466;
        IStrategoTerm z_160 = null;
        z_160 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_160, extraction.const426);
        if(term == null)
          break Fail1871;
        if(true)
          break Fail1871;
      }
      term = w_160;
      b_161 = w_160;
      a_161 = term;
      term = b_161;
      IStrategoList list145;
      list145 = checkListTail(a_161);
      if(list145 == null)
        break Fail1871;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list145);
      if(true)
        return term;
    }
    return null;
  }
}