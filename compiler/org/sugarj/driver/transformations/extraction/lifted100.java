package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted100 extends Strategy 
{ 
  public static final lifted100 instance = new lifted100();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2062:
    { 
      IStrategoTerm l_114 = null;
      IStrategoTerm m_114 = null;
      m_114 = term;
      l_114 = term;
      term = m_114;
      IStrategoList list58;
      list58 = checkListTail(l_114);
      if(list58 == null)
        break Fail2062;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs307, list58);
      if(true)
        return term;
    }
    return null;
  }
}