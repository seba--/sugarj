package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted337 extends Strategy 
{ 
  TermReference s_246;

  TermReference t_246;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1468:
    { 
      IStrategoTerm w_246 = null;
      IStrategoTerm x_246 = null;
      IStrategoTerm d_247 = null;
      IStrategoTerm f_247 = null;
      w_246 = term;
      if(s_246.value == null)
        break Fail1468;
      term = termFactory.makeTuple(s_246.value, extraction.constSortNoArgs18);
      IStrategoTerm term718 = term;
      Success497:
      { 
        Fail1469:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1469;
          if(true)
            break Success497;
        }
        term = term718;
        IStrategoTerm z_246 = null;
        z_246 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_246, extraction.const528);
        if(term == null)
          break Fail1468;
        if(true)
          break Fail1468;
      }
      term = w_246;
      x_246 = w_246;
      if(t_246.value == null)
        break Fail1468;
      term = termFactory.makeTuple(t_246.value, extraction.constSortNoArgs45);
      IStrategoTerm term719 = term;
      Success498:
      { 
        Fail1470:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1470;
          if(true)
            break Success498;
        }
        term = term719;
        IStrategoTerm c_247 = null;
        c_247 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_247, extraction.const528);
        if(term == null)
          break Fail1468;
        if(true)
          break Fail1468;
      }
      term = x_246;
      f_247 = x_246;
      d_247 = term;
      term = f_247;
      IStrategoList list295;
      list295 = checkListTail(d_247);
      if(list295 == null)
        break Fail1468;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs208, list295);
      if(true)
        return term;
    }
    return null;
  }
}