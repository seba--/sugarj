package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted150 extends Strategy 
{ 
  public static final lifted150 instance = new lifted150();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1950:
    { 
      IStrategoTerm d_141 = null;
      IStrategoTerm e_141 = null;
      e_141 = term;
      d_141 = term;
      term = e_141;
      IStrategoList list108;
      list108 = checkListTail(d_141);
      if(list108 == null)
        break Fail1950;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs99, list108);
      if(true)
        return term;
    }
    return null;
  }
}