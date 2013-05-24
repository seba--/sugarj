package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted211 extends Strategy 
{ 
  public static final lifted211 instance = new lifted211();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1817:
    { 
      IStrategoTerm v_174 = null;
      IStrategoTerm w_174 = null;
      w_174 = term;
      v_174 = term;
      term = w_174;
      IStrategoList list169;
      list169 = checkListTail(v_174);
      if(list169 == null)
        break Fail1817;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs70, list169);
      if(true)
        return term;
    }
    return null;
  }
}