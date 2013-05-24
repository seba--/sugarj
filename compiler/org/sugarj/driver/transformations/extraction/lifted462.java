package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted462 extends Strategy 
{ 
  public static final lifted462 instance = new lifted462();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1181:
    { 
      IStrategoTerm v_320 = null;
      IStrategoTerm w_320 = null;
      w_320 = term;
      v_320 = term;
      term = w_320;
      IStrategoList list420;
      list420 = checkListTail(v_320);
      if(list420 == null)
        break Fail1181;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list420);
      if(true)
        return term;
    }
    return null;
  }
}