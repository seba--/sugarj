package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted75 extends Strategy 
{ 
  TermReference x_102;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2120:
    { 
      IStrategoTerm z_102 = null;
      IStrategoTerm d_103 = null;
      IStrategoTerm e_103 = null;
      z_102 = term;
      if(x_102.value == null)
        break Fail2120;
      term = termFactory.makeTuple(x_102.value, extraction.constSortNoArgs247);
      IStrategoTerm term329 = term;
      Success887:
      { 
        Fail2121:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2121;
          if(true)
            break Success887;
        }
        term = term329;
        IStrategoTerm c_103 = null;
        c_103 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_103, extraction.const350);
        if(term == null)
          break Fail2120;
        if(true)
          break Fail2120;
      }
      term = z_102;
      e_103 = z_102;
      d_103 = term;
      term = e_103;
      IStrategoList list33;
      list33 = checkListTail(d_103);
      if(list33 == null)
        break Fail2120;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list33);
      if(true)
        return term;
    }
    return null;
  }
}