package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted419 extends Strategy 
{ 
  public static final lifted419 instance = new lifted419();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1275:
    { 
      IStrategoTerm a_300 = null;
      IStrategoTerm b_300 = null;
      b_300 = term;
      a_300 = term;
      term = b_300;
      IStrategoList list377;
      list377 = checkListTail(a_300);
      if(list377 == null)
        break Fail1275;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs75, list377);
      if(true)
        return term;
    }
    return null;
  }
}