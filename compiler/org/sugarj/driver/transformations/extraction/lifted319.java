package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted319 extends Strategy 
{ 
  TermReference q_237;

  TermReference r_237;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1511:
    { 
      IStrategoTerm u_237 = null;
      IStrategoTerm v_237 = null;
      IStrategoTerm i_238 = null;
      IStrategoTerm j_238 = null;
      u_237 = term;
      if(q_237.value == null)
        break Fail1511;
      term = termFactory.makeTuple(q_237.value, extraction.constSortNoArgs50);
      IStrategoTerm term693 = term;
      Success522:
      { 
        Fail1512:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1512;
          if(true)
            break Success522;
        }
        term = term693;
        IStrategoTerm e_238 = null;
        e_238 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_238, extraction.const514);
        if(term == null)
          break Fail1511;
        if(true)
          break Fail1511;
      }
      term = u_237;
      v_237 = u_237;
      if(r_237.value == null)
        break Fail1511;
      term = termFactory.makeTuple(r_237.value, extraction.constSortNoArgs41);
      IStrategoTerm term694 = term;
      Success523:
      { 
        Fail1513:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1513;
          if(true)
            break Success523;
        }
        term = term694;
        IStrategoTerm h_238 = null;
        h_238 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_238, extraction.const514);
        if(term == null)
          break Fail1511;
        if(true)
          break Fail1511;
      }
      term = v_237;
      j_238 = v_237;
      i_238 = term;
      term = j_238;
      IStrategoList list277;
      list277 = checkListTail(i_238);
      if(list277 == null)
        break Fail1511;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs41, list277);
      if(true)
        return term;
    }
    return null;
  }
}