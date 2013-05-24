package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted386 extends Strategy 
{ 
  public static final lifted386 instance = new lifted386();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1344:
    { 
      IStrategoTerm y_273 = null;
      IStrategoTerm z_273 = null;
      z_273 = term;
      y_273 = term;
      term = z_273;
      IStrategoList list344;
      list344 = checkListTail(y_273);
      if(list344 == null)
        break Fail1344;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs115, list344);
      if(true)
        return term;
    }
    return null;
  }
}