package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted154 extends Strategy 
{ 
  public static final lifted154 instance = new lifted154();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1946:
    { 
      IStrategoTerm z_142 = null;
      IStrategoTerm a_143 = null;
      a_143 = term;
      z_142 = term;
      term = a_143;
      IStrategoList list112;
      list112 = checkListTail(z_142);
      if(list112 == null)
        break Fail1946;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs99, list112);
      if(true)
        return term;
    }
    return null;
  }
}