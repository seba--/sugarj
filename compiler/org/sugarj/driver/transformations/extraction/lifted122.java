package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted122 extends Strategy 
{ 
  public static final lifted122 instance = new lifted122();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2012:
    { 
      IStrategoTerm k_123 = null;
      IStrategoTerm l_123 = null;
      l_123 = term;
      k_123 = term;
      term = l_123;
      IStrategoList list80;
      list80 = checkListTail(k_123);
      if(list80 == null)
        break Fail2012;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs121, list80);
      if(true)
        return term;
    }
    return null;
  }
}