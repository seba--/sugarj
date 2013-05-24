package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted420 extends Strategy 
{ 
  public static final lifted420 instance = new lifted420();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1274:
    { 
      IStrategoTerm h_300 = null;
      IStrategoTerm i_300 = null;
      i_300 = term;
      h_300 = term;
      term = i_300;
      IStrategoList list378;
      list378 = checkListTail(h_300);
      if(list378 == null)
        break Fail1274;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs75, list378);
      if(true)
        return term;
    }
    return null;
  }
}