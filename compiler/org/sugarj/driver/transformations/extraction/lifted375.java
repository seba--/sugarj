package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted375 extends Strategy 
{ 
  TermReference m_268;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1368:
    { 
      IStrategoTerm q_268 = null;
      IStrategoTerm a_269 = null;
      IStrategoTerm b_269 = null;
      q_268 = term;
      if(m_268.value == null)
        break Fail1368;
      term = termFactory.makeTuple(m_268.value, extraction.constSortNoArgs299);
      IStrategoTerm term781 = term;
      Success435:
      { 
        Fail1369:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1369;
          if(true)
            break Success435;
        }
        term = term781;
        IStrategoTerm y_268 = null;
        y_268 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_268, extraction.const554);
        if(term == null)
          break Fail1368;
        if(true)
          break Fail1368;
      }
      term = q_268;
      b_269 = q_268;
      a_269 = term;
      term = b_269;
      IStrategoList list333;
      list333 = checkListTail(a_269);
      if(list333 == null)
        break Fail1368;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list333);
      if(true)
        return term;
    }
    return null;
  }
}