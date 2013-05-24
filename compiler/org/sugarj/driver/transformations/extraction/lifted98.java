package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted98 extends Strategy 
{ 
  public static final lifted98 instance = new lifted98();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2064:
    { 
      IStrategoTerm x_113 = null;
      IStrategoTerm y_113 = null;
      y_113 = term;
      x_113 = term;
      term = y_113;
      IStrategoList list56;
      list56 = checkListTail(x_113);
      if(list56 == null)
        break Fail2064;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs307, list56);
      if(true)
        return term;
    }
    return null;
  }
}