package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted421 extends Strategy 
{ 
  public static final lifted421 instance = new lifted421();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1273:
    { 
      IStrategoTerm p_300 = null;
      IStrategoTerm q_300 = null;
      q_300 = term;
      p_300 = term;
      term = q_300;
      IStrategoList list379;
      list379 = checkListTail(p_300);
      if(list379 == null)
        break Fail1273;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs75, list379);
      if(true)
        return term;
    }
    return null;
  }
}