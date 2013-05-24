package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted153 extends Strategy 
{ 
  public static final lifted153 instance = new lifted153();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1947:
    { 
      IStrategoTerm x_142 = null;
      IStrategoTerm y_142 = null;
      y_142 = term;
      x_142 = term;
      term = y_142;
      IStrategoList list111;
      list111 = checkListTail(x_142);
      if(list111 == null)
        break Fail1947;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs99, list111);
      if(true)
        return term;
    }
    return null;
  }
}