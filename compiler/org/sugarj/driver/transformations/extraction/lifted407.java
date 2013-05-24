package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted407 extends Strategy 
{ 
  public static final lifted407 instance = new lifted407();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1301:
    { 
      IStrategoTerm m_285 = null;
      IStrategoTerm n_285 = null;
      n_285 = term;
      m_285 = term;
      term = n_285;
      IStrategoList list365;
      list365 = checkListTail(m_285);
      if(list365 == null)
        break Fail1301;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs60, list365);
      if(true)
        return term;
    }
    return null;
  }
}