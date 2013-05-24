package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted341 extends Strategy 
{ 
  public static final lifted341 instance = new lifted341();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1460:
    { 
      IStrategoTerm h_249 = null;
      IStrategoTerm i_249 = null;
      i_249 = term;
      h_249 = term;
      term = i_249;
      IStrategoList list299;
      list299 = checkListTail(h_249);
      if(list299 == null)
        break Fail1460;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs52, list299);
      if(true)
        return term;
    }
    return null;
  }
}