package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted144 extends Strategy 
{ 
  public static final lifted144 instance = new lifted144();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1956:
    { 
      IStrategoTerm j_138 = null;
      IStrategoTerm k_138 = null;
      k_138 = term;
      j_138 = term;
      term = k_138;
      IStrategoList list102;
      list102 = checkListTail(j_138);
      if(list102 == null)
        break Fail1956;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs112, list102);
      if(true)
        return term;
    }
    return null;
  }
}