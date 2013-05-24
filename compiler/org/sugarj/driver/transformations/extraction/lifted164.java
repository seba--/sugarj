package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted164 extends Strategy 
{ 
  public static final lifted164 instance = new lifted164();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1922:
    { 
      IStrategoTerm m_149 = null;
      IStrategoTerm n_149 = null;
      n_149 = term;
      m_149 = term;
      term = n_149;
      IStrategoList list122;
      list122 = checkListTail(m_149);
      if(list122 == null)
        break Fail1922;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs121, list122);
      if(true)
        return term;
    }
    return null;
  }
}