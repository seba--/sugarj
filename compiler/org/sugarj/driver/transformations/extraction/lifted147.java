package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted147 extends Strategy 
{ 
  public static final lifted147 instance = new lifted147();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1953:
    { 
      IStrategoTerm h_139 = null;
      IStrategoTerm i_139 = null;
      i_139 = term;
      h_139 = term;
      term = i_139;
      IStrategoList list105;
      list105 = checkListTail(h_139);
      if(list105 == null)
        break Fail1953;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs112, list105);
      if(true)
        return term;
    }
    return null;
  }
}