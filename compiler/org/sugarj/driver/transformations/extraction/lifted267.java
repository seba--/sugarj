package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted267 extends Strategy 
{ 
  TermReference w_207;

  TermReference x_207;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1641:
    { 
      IStrategoTerm z_207 = null;
      IStrategoTerm a_208 = null;
      IStrategoTerm f_208 = null;
      IStrategoTerm g_208 = null;
      z_207 = term;
      if(w_207.value == null)
        break Fail1641;
      term = termFactory.makeTuple(w_207.value, extraction.constSortNoArgs201);
      IStrategoTerm term615 = term;
      Success600:
      { 
        Fail1642:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1642;
          if(true)
            break Success600;
        }
        term = term615;
        IStrategoTerm c_208 = null;
        c_208 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_208, extraction.const473);
        if(term == null)
          break Fail1641;
        if(true)
          break Fail1641;
      }
      term = z_207;
      a_208 = z_207;
      if(x_207.value == null)
        break Fail1641;
      term = termFactory.makeTuple(x_207.value, extraction.constSort38);
      IStrategoTerm term616 = term;
      Success601:
      { 
        Fail1643:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1643;
          if(true)
            break Success601;
        }
        term = term616;
        IStrategoTerm e_208 = null;
        e_208 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_208, extraction.const473);
        if(term == null)
          break Fail1641;
        if(true)
          break Fail1641;
      }
      term = a_208;
      g_208 = a_208;
      f_208 = term;
      term = g_208;
      IStrategoList list225;
      list225 = checkListTail(f_208);
      if(list225 == null)
        break Fail1641;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list225);
      if(true)
        return term;
    }
    return null;
  }
}