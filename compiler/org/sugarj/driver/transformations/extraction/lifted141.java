package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted141 extends Strategy 
{ 
  public static final lifted141 instance = new lifted141();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1959:
    { 
      IStrategoTerm l_137 = null;
      IStrategoTerm m_137 = null;
      m_137 = term;
      l_137 = term;
      term = m_137;
      IStrategoList list99;
      list99 = checkListTail(l_137);
      if(list99 == null)
        break Fail1959;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs112, list99);
      if(true)
        return term;
    }
    return null;
  }
}