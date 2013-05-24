package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted146 extends Strategy 
{ 
  public static final lifted146 instance = new lifted146();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1954:
    { 
      IStrategoTerm a_139 = null;
      IStrategoTerm b_139 = null;
      b_139 = term;
      a_139 = term;
      term = b_139;
      IStrategoList list104;
      list104 = checkListTail(a_139);
      if(list104 == null)
        break Fail1954;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs112, list104);
      if(true)
        return term;
    }
    return null;
  }
}