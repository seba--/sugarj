package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted119 extends Strategy 
{ 
  public static final lifted119 instance = new lifted119();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2015:
    { 
      IStrategoTerm z_122 = null;
      IStrategoTerm a_123 = null;
      a_123 = term;
      z_122 = term;
      term = a_123;
      IStrategoList list77;
      list77 = checkListTail(z_122);
      if(list77 == null)
        break Fail2015;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs141, list77);
      if(true)
        return term;
    }
    return null;
  }
}