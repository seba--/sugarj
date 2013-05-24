package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted358 extends Strategy 
{ 
  public static final lifted358 instance = new lifted358();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1411:
    { 
      IStrategoTerm c_260 = null;
      IStrategoTerm d_260 = null;
      d_260 = term;
      c_260 = term;
      term = d_260;
      IStrategoList list316;
      list316 = checkListTail(c_260);
      if(list316 == null)
        break Fail1411;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list316);
      if(true)
        return term;
    }
    return null;
  }
}