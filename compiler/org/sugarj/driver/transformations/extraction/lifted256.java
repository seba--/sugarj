package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted256 extends Strategy 
{ 
  TermReference q_200;

  TermReference r_200;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1677:
    { 
      IStrategoTerm t_200 = null;
      IStrategoTerm u_200 = null;
      IStrategoTerm z_200 = null;
      IStrategoTerm a_201 = null;
      t_200 = term;
      if(q_200.value == null)
        break Fail1677;
      term = termFactory.makeTuple(q_200.value, extraction.constSortNoArgs8);
      IStrategoTerm term590 = term;
      Success625:
      { 
        Fail1678:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1678;
          if(true)
            break Success625;
        }
        term = term590;
        IStrategoTerm w_200 = null;
        w_200 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_200, extraction.const464);
        if(term == null)
          break Fail1677;
        if(true)
          break Fail1677;
      }
      term = t_200;
      u_200 = t_200;
      if(r_200.value == null)
        break Fail1677;
      term = termFactory.makeTuple(r_200.value, extraction.constSortNoArgs179);
      IStrategoTerm term591 = term;
      Success626:
      { 
        Fail1679:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1679;
          if(true)
            break Success626;
        }
        term = term591;
        IStrategoTerm y_200 = null;
        y_200 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_200, extraction.const464);
        if(term == null)
          break Fail1677;
        if(true)
          break Fail1677;
      }
      term = u_200;
      a_201 = u_200;
      z_200 = term;
      term = a_201;
      IStrategoList list214;
      list214 = checkListTail(z_200);
      if(list214 == null)
        break Fail1677;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs55, list214);
      if(true)
        return term;
    }
    return null;
  }
}