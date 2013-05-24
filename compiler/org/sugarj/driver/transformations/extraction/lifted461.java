package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted461 extends Strategy 
{ 
  public static final lifted461 instance = new lifted461();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1182:
    { 
      IStrategoTerm o_320 = null;
      IStrategoTerm p_320 = null;
      p_320 = term;
      o_320 = term;
      term = p_320;
      IStrategoList list419;
      list419 = checkListTail(o_320);
      if(list419 == null)
        break Fail1182;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list419);
      if(true)
        return term;
    }
    return null;
  }
}