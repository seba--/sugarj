package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted384 extends Strategy 
{ 
  public static final lifted384 instance = new lifted384();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1346:
    { 
      IStrategoTerm h_273 = null;
      IStrategoTerm i_273 = null;
      i_273 = term;
      h_273 = term;
      term = i_273;
      IStrategoList list342;
      list342 = checkListTail(h_273);
      if(list342 == null)
        break Fail1346;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs115, list342);
      if(true)
        return term;
    }
    return null;
  }
}