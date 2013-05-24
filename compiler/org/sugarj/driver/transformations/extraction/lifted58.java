package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted58 extends Strategy 
{ 
  TermReference x_96;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2154:
    { 
      IStrategoTerm z_96 = null;
      IStrategoTerm d_97 = null;
      IStrategoTerm e_97 = null;
      z_96 = term;
      if(x_96.value == null)
        break Fail2154;
      term = termFactory.makeTuple(x_96.value, extraction.constSortNoArgs87);
      IStrategoTerm term312 = term;
      Success904:
      { 
        Fail2155:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2155;
          if(true)
            break Success904;
        }
        term = term312;
        IStrategoTerm c_97 = null;
        c_97 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_97, extraction.const341);
        if(term == null)
          break Fail2154;
        if(true)
          break Fail2154;
      }
      term = z_96;
      e_97 = z_96;
      d_97 = term;
      term = e_97;
      IStrategoList list16;
      list16 = checkListTail(d_97);
      if(list16 == null)
        break Fail2154;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs312, list16);
      if(true)
        return term;
    }
    return null;
  }
}