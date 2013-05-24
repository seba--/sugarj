package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted123 extends Strategy 
{ 
  public static final lifted123 instance = new lifted123();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2011:
    { 
      IStrategoTerm m_123 = null;
      IStrategoTerm n_123 = null;
      n_123 = term;
      m_123 = term;
      term = n_123;
      IStrategoList list81;
      list81 = checkListTail(m_123);
      if(list81 == null)
        break Fail2011;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs121, list81);
      if(true)
        return term;
    }
    return null;
  }
}