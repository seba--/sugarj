package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted472 extends Strategy 
{ 
  TermReference x_325;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1157:
    { 
      IStrategoTerm z_325 = null;
      IStrategoTerm c_326 = null;
      IStrategoTerm d_326 = null;
      z_325 = term;
      if(x_325.value == null)
        break Fail1157;
      term = termFactory.makeTuple(x_325.value, extraction.constSortNoArgs277);
      IStrategoTerm term895 = term;
      Success321:
      { 
        Fail1158:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1158;
          if(true)
            break Success321;
        }
        term = term895;
        IStrategoTerm b_326 = null;
        b_326 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_326, extraction.const639);
        if(term == null)
          break Fail1157;
        if(true)
          break Fail1157;
      }
      term = z_325;
      d_326 = z_325;
      c_326 = term;
      term = d_326;
      IStrategoList list430;
      list430 = checkListTail(c_326);
      if(list430 == null)
        break Fail1157;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs277, list430);
      if(true)
        return term;
    }
    return null;
  }
}