package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted117 extends Strategy 
{ 
  public static final lifted117 instance = new lifted117();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2017:
    { 
      IStrategoTerm v_122 = null;
      IStrategoTerm w_122 = null;
      w_122 = term;
      v_122 = term;
      term = w_122;
      IStrategoList list75;
      list75 = checkListTail(v_122);
      if(list75 == null)
        break Fail2017;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs309, list75);
      if(true)
        return term;
    }
    return null;
  }
}