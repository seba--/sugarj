package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted149 extends Strategy 
{ 
  public static final lifted149 instance = new lifted149();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1951:
    { 
      IStrategoTerm q_140 = null;
      IStrategoTerm u_140 = null;
      u_140 = term;
      q_140 = term;
      term = u_140;
      IStrategoList list107;
      list107 = checkListTail(q_140);
      if(list107 == null)
        break Fail1951;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs112, list107);
      if(true)
        return term;
    }
    return null;
  }
}