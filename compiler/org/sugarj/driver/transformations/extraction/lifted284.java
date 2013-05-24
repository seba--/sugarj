package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted284 extends Strategy 
{ 
  public static final lifted284 instance = new lifted284();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1603:
    { 
      IStrategoTerm n_216 = null;
      IStrategoTerm s_216 = null;
      s_216 = term;
      n_216 = term;
      term = s_216;
      IStrategoList list242;
      list242 = checkListTail(n_216);
      if(list242 == null)
        break Fail1603;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list242);
      if(true)
        return term;
    }
    return null;
  }
}