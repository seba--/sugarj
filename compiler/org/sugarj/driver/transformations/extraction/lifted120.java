package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted120 extends Strategy 
{ 
  public static final lifted120 instance = new lifted120();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2014:
    { 
      IStrategoTerm g_123 = null;
      IStrategoTerm h_123 = null;
      h_123 = term;
      g_123 = term;
      term = h_123;
      IStrategoList list78;
      list78 = checkListTail(g_123);
      if(list78 == null)
        break Fail2014;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs309, list78);
      if(true)
        return term;
    }
    return null;
  }
}