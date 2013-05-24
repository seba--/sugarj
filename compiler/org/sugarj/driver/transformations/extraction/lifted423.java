package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted423 extends Strategy 
{ 
  public static final lifted423 instance = new lifted423();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1271:
    { 
      IStrategoTerm d_301 = null;
      IStrategoTerm e_301 = null;
      e_301 = term;
      d_301 = term;
      term = e_301;
      IStrategoList list381;
      list381 = checkListTail(d_301);
      if(list381 == null)
        break Fail1271;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs115, list381);
      if(true)
        return term;
    }
    return null;
  }
}