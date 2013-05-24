package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted124 extends Strategy 
{ 
  public static final lifted124 instance = new lifted124();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2010:
    { 
      IStrategoTerm t_123 = null;
      IStrategoTerm u_123 = null;
      u_123 = term;
      t_123 = term;
      term = u_123;
      IStrategoList list82;
      list82 = checkListTail(t_123);
      if(list82 == null)
        break Fail2010;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs309, list82);
      if(true)
        return term;
    }
    return null;
  }
}