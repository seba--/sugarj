package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted327 extends Strategy 
{ 
  public static final lifted327 instance = new lifted327();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1493:
    { 
      IStrategoTerm m_241 = null;
      IStrategoTerm n_241 = null;
      n_241 = term;
      m_241 = term;
      term = n_241;
      IStrategoList list285;
      list285 = checkListTail(m_241);
      if(list285 == null)
        break Fail1493;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs189, list285);
      if(true)
        return term;
    }
    return null;
  }
}