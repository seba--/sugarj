package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted479 extends Strategy 
{ 
  public static final lifted479 instance = new lifted479();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1143:
    { 
      IStrategoTerm l_329 = null;
      IStrategoTerm m_329 = null;
      m_329 = term;
      l_329 = term;
      term = m_329;
      IStrategoList list437;
      list437 = checkListTail(l_329);
      if(list437 == null)
        break Fail1143;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list437);
      if(true)
        return term;
    }
    return null;
  }
}