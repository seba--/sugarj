package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted148 extends Strategy 
{ 
  public static final lifted148 instance = new lifted148();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1952:
    { 
      IStrategoTerm a_140 = null;
      IStrategoTerm e_140 = null;
      e_140 = term;
      a_140 = term;
      term = e_140;
      IStrategoList list106;
      list106 = checkListTail(a_140);
      if(list106 == null)
        break Fail1952;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs112, list106);
      if(true)
        return term;
    }
    return null;
  }
}