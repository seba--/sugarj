package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted385 extends Strategy 
{ 
  public static final lifted385 instance = new lifted385();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1345:
    { 
      IStrategoTerm p_273 = null;
      IStrategoTerm q_273 = null;
      q_273 = term;
      p_273 = term;
      term = q_273;
      IStrategoList list343;
      list343 = checkListTail(p_273);
      if(list343 == null)
        break Fail1345;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs115, list343);
      if(true)
        return term;
    }
    return null;
  }
}