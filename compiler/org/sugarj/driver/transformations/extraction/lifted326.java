package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted326 extends Strategy 
{ 
  public static final lifted326 instance = new lifted326();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1494:
    { 
      IStrategoTerm b_241 = null;
      IStrategoTerm d_241 = null;
      d_241 = term;
      b_241 = term;
      term = d_241;
      IStrategoList list284;
      list284 = checkListTail(b_241);
      if(list284 == null)
        break Fail1494;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs189, list284);
      if(true)
        return term;
    }
    return null;
  }
}