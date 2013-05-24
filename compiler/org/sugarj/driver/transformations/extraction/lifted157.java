package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted157 extends Strategy 
{ 
  public static final lifted157 instance = new lifted157();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1940:
    { 
      IStrategoTerm m_144 = null;
      IStrategoTerm p_144 = null;
      p_144 = term;
      m_144 = term;
      term = p_144;
      IStrategoList list115;
      list115 = checkListTail(m_144);
      if(list115 == null)
        break Fail1940;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs97, list115);
      if(true)
        return term;
    }
    return null;
  }
}