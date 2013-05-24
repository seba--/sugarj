package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted143 extends Strategy 
{ 
  public static final lifted143 instance = new lifted143();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1957:
    { 
      IStrategoTerm c_138 = null;
      IStrategoTerm d_138 = null;
      d_138 = term;
      c_138 = term;
      term = d_138;
      IStrategoList list101;
      list101 = checkListTail(c_138);
      if(list101 == null)
        break Fail1957;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs112, list101);
      if(true)
        return term;
    }
    return null;
  }
}