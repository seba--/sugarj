package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted411 extends Strategy 
{ 
  public static final lifted411 instance = new lifted411();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1293:
    { 
      IStrategoTerm a_287 = null;
      IStrategoTerm b_287 = null;
      b_287 = term;
      a_287 = term;
      term = b_287;
      IStrategoList list369;
      list369 = checkListTail(a_287);
      if(list369 == null)
        break Fail1293;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs286, list369);
      if(true)
        return term;
    }
    return null;
  }
}