package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted406 extends Strategy 
{ 
  public static final lifted406 instance = new lifted406();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1302:
    { 
      IStrategoTerm f_285 = null;
      IStrategoTerm g_285 = null;
      g_285 = term;
      f_285 = term;
      term = g_285;
      IStrategoList list364;
      list364 = checkListTail(f_285);
      if(list364 == null)
        break Fail1302;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs60, list364);
      if(true)
        return term;
    }
    return null;
  }
}