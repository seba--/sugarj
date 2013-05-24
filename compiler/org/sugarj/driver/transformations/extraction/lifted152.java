package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted152 extends Strategy 
{ 
  public static final lifted152 instance = new lifted152();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1948:
    { 
      IStrategoTerm q_142 = null;
      IStrategoTerm r_142 = null;
      r_142 = term;
      q_142 = term;
      term = r_142;
      IStrategoList list110;
      list110 = checkListTail(q_142);
      if(list110 == null)
        break Fail1948;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs99, list110);
      if(true)
        return term;
    }
    return null;
  }
}