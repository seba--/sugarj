package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted281 extends Strategy 
{ 
  TermReference q_214;

  TermReference r_214;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1609:
    { 
      IStrategoTerm t_214 = null;
      IStrategoTerm u_214 = null;
      IStrategoTerm a_215 = null;
      IStrategoTerm b_215 = null;
      t_214 = term;
      if(q_214.value == null)
        break Fail1609;
      term = termFactory.makeTuple(q_214.value, extraction.constSortNoArgs18);
      IStrategoTerm term633 = term;
      Success582:
      { 
        Fail1610:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1610;
          if(true)
            break Success582;
        }
        term = term633;
        IStrategoTerm x_214 = null;
        x_214 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_214, extraction.const487);
        if(term == null)
          break Fail1609;
        if(true)
          break Fail1609;
      }
      term = t_214;
      u_214 = t_214;
      if(r_214.value == null)
        break Fail1609;
      term = termFactory.makeTuple(r_214.value, extraction.constSort38);
      IStrategoTerm term634 = term;
      Success583:
      { 
        Fail1611:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1611;
          if(true)
            break Success583;
        }
        term = term634;
        IStrategoTerm z_214 = null;
        z_214 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_214, extraction.const487);
        if(term == null)
          break Fail1609;
        if(true)
          break Fail1609;
      }
      term = u_214;
      b_215 = u_214;
      a_215 = term;
      term = b_215;
      IStrategoList list239;
      list239 = checkListTail(a_215);
      if(list239 == null)
        break Fail1609;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list239);
      if(true)
        return term;
    }
    return null;
  }
}