package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted118 extends Strategy 
{ 
  public static final lifted118 instance = new lifted118();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2016:
    { 
      IStrategoTerm x_122 = null;
      IStrategoTerm y_122 = null;
      y_122 = term;
      x_122 = term;
      term = y_122;
      IStrategoList list76;
      list76 = checkListTail(x_122);
      if(list76 == null)
        break Fail2016;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs121, list76);
      if(true)
        return term;
    }
    return null;
  }
}