package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted405 extends Strategy 
{ 
  public static final lifted405 instance = new lifted405();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1303:
    { 
      IStrategoTerm y_284 = null;
      IStrategoTerm z_284 = null;
      z_284 = term;
      y_284 = term;
      term = z_284;
      IStrategoList list363;
      list363 = checkListTail(y_284);
      if(list363 == null)
        break Fail1303;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs60, list363);
      if(true)
        return term;
    }
    return null;
  }
}