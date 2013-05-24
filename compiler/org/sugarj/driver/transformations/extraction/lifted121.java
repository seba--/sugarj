package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted121 extends Strategy 
{ 
  public static final lifted121 instance = new lifted121();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2013:
    { 
      IStrategoTerm i_123 = null;
      IStrategoTerm j_123 = null;
      j_123 = term;
      i_123 = term;
      term = j_123;
      IStrategoList list79;
      list79 = checkListTail(i_123);
      if(list79 == null)
        break Fail2013;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs309, list79);
      if(true)
        return term;
    }
    return null;
  }
}