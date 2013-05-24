package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted155 extends Strategy 
{ 
  public static final lifted155 instance = new lifted155();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1945:
    { 
      IStrategoTerm h_143 = null;
      IStrategoTerm i_143 = null;
      i_143 = term;
      h_143 = term;
      term = i_143;
      IStrategoList list113;
      list113 = checkListTail(h_143);
      if(list113 == null)
        break Fail1945;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs95, list113);
      if(true)
        return term;
    }
    return null;
  }
}