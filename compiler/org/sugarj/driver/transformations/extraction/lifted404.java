package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted404 extends Strategy 
{ 
  public static final lifted404 instance = new lifted404();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1304:
    { 
      IStrategoTerm q_284 = null;
      IStrategoTerm r_284 = null;
      r_284 = term;
      q_284 = term;
      term = r_284;
      IStrategoList list362;
      list362 = checkListTail(q_284);
      if(list362 == null)
        break Fail1304;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs60, list362);
      if(true)
        return term;
    }
    return null;
  }
}