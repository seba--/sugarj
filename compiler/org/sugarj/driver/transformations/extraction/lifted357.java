package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted357 extends Strategy 
{ 
  public static final lifted357 instance = new lifted357();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1412:
    { 
      IStrategoTerm t_259 = null;
      IStrategoTerm u_259 = null;
      u_259 = term;
      t_259 = term;
      term = u_259;
      IStrategoList list315;
      list315 = checkListTail(t_259);
      if(list315 == null)
        break Fail1412;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list315);
      if(true)
        return term;
    }
    return null;
  }
}