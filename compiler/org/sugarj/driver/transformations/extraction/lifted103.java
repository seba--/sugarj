package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted103 extends Strategy 
{ 
  public static final lifted103 instance = new lifted103();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2059:
    { 
      IStrategoTerm l_115 = null;
      IStrategoTerm m_115 = null;
      m_115 = term;
      l_115 = term;
      term = m_115;
      IStrategoList list61;
      list61 = checkListTail(l_115);
      if(list61 == null)
        break Fail2059;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs307, list61);
      if(true)
        return term;
    }
    return null;
  }
}