package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted151 extends Strategy 
{ 
  public static final lifted151 instance = new lifted151();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1949:
    { 
      IStrategoTerm x_141 = null;
      IStrategoTerm y_141 = null;
      y_141 = term;
      x_141 = term;
      term = y_141;
      IStrategoList list109;
      list109 = checkListTail(x_141);
      if(list109 == null)
        break Fail1949;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs99, list109);
      if(true)
        return term;
    }
    return null;
  }
}