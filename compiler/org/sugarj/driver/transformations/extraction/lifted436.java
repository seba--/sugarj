package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted436 extends Strategy 
{ 
  public static final lifted436 instance = new lifted436();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1242:
    { 
      IStrategoTerm b_307 = null;
      IStrategoTerm c_307 = null;
      c_307 = term;
      b_307 = term;
      term = c_307;
      IStrategoList list394;
      list394 = checkListTail(b_307);
      if(list394 == null)
        break Fail1242;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list394);
      if(true)
        return term;
    }
    return null;
  }
}