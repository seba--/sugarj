package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted478 extends Strategy 
{ 
  public static final lifted478 instance = new lifted478();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1144:
    { 
      IStrategoTerm e_329 = null;
      IStrategoTerm f_329 = null;
      f_329 = term;
      e_329 = term;
      term = f_329;
      IStrategoList list436;
      list436 = checkListTail(e_329);
      if(list436 == null)
        break Fail1144;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list436);
      if(true)
        return term;
    }
    return null;
  }
}