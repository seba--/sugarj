package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted324 extends Strategy 
{ 
  TermReference w_239;

  TermReference x_239;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1497:
    { 
      IStrategoTerm z_239 = null;
      IStrategoTerm a_240 = null;
      IStrategoTerm h_240 = null;
      IStrategoTerm i_240 = null;
      z_239 = term;
      if(w_239.value == null)
        break Fail1497;
      term = termFactory.makeTuple(w_239.value, extraction.constSort31);
      IStrategoTerm term702 = term;
      Success513:
      { 
        Fail1498:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1498;
          if(true)
            break Success513;
        }
        term = term702;
        IStrategoTerm c_240 = null;
        c_240 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_240, extraction.const516);
        if(term == null)
          break Fail1497;
        if(true)
          break Fail1497;
      }
      term = z_239;
      a_240 = z_239;
      if(x_239.value == null)
        break Fail1497;
      term = termFactory.makeTuple(x_239.value, extraction.constSortNoArgs30);
      IStrategoTerm term703 = term;
      Success514:
      { 
        Fail1499:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1499;
          if(true)
            break Success514;
        }
        term = term703;
        IStrategoTerm g_240 = null;
        g_240 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_240, extraction.const516);
        if(term == null)
          break Fail1497;
        if(true)
          break Fail1497;
      }
      term = a_240;
      i_240 = a_240;
      h_240 = term;
      term = i_240;
      IStrategoList list282;
      list282 = checkListTail(h_240);
      if(list282 == null)
        break Fail1497;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs30, list282);
      if(true)
        return term;
    }
    return null;
  }
}