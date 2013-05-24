package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted476 extends Strategy 
{ 
  public static final lifted476 instance = new lifted476();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1149:
    { 
      IStrategoTerm c_328 = null;
      IStrategoTerm d_328 = null;
      d_328 = term;
      c_328 = term;
      term = d_328;
      IStrategoList list434;
      list434 = checkListTail(c_328);
      if(list434 == null)
        break Fail1149;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs270, list434);
      if(true)
        return term;
    }
    return null;
  }
}