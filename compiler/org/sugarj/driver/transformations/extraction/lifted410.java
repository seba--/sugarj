package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted410 extends Strategy 
{ 
  public static final lifted410 instance = new lifted410();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1294:
    { 
      IStrategoTerm y_286 = null;
      IStrategoTerm z_286 = null;
      z_286 = term;
      y_286 = term;
      term = z_286;
      IStrategoList list368;
      list368 = checkListTail(y_286);
      if(list368 == null)
        break Fail1294;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs242, list368);
      if(true)
        return term;
    }
    return null;
  }
}