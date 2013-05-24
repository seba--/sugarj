package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted228 extends Strategy 
{ 
  TermReference u_184;

  TermReference v_184;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1768:
    { 
      IStrategoTerm x_184 = null;
      IStrategoTerm y_184 = null;
      IStrategoTerm d_185 = null;
      IStrategoTerm e_185 = null;
      x_184 = term;
      if(u_184.value == null)
        break Fail1768;
      term = termFactory.makeTuple(u_184.value, extraction.constSortNoArgs169);
      IStrategoTerm term527 = term;
      Success688:
      { 
        Fail1769:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1769;
          if(true)
            break Success688;
        }
        term = term527;
        IStrategoTerm a_185 = null;
        a_185 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_185, extraction.const449);
        if(term == null)
          break Fail1768;
        if(true)
          break Fail1768;
      }
      term = x_184;
      y_184 = x_184;
      if(v_184.value == null)
        break Fail1768;
      term = termFactory.makeTuple(v_184.value, extraction.constSortNoArgs41);
      IStrategoTerm term528 = term;
      Success689:
      { 
        Fail1770:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1770;
          if(true)
            break Success689;
        }
        term = term528;
        IStrategoTerm c_185 = null;
        c_185 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_185, extraction.const449);
        if(term == null)
          break Fail1768;
        if(true)
          break Fail1768;
      }
      term = y_184;
      e_185 = y_184;
      d_185 = term;
      term = e_185;
      IStrategoList list186;
      list186 = checkListTail(d_185);
      if(list186 == null)
        break Fail1768;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs172, list186);
      if(true)
        return term;
    }
    return null;
  }
}