package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted422 extends Strategy 
{ 
  public static final lifted422 instance = new lifted422();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1272:
    { 
      IStrategoTerm w_300 = null;
      IStrategoTerm x_300 = null;
      x_300 = term;
      w_300 = term;
      term = x_300;
      IStrategoList list380;
      list380 = checkListTail(w_300);
      if(list380 == null)
        break Fail1272;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs75, list380);
      if(true)
        return term;
    }
    return null;
  }
}