package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted99 extends Strategy 
{ 
  public static final lifted99 instance = new lifted99();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2063:
    { 
      IStrategoTerm e_114 = null;
      IStrategoTerm f_114 = null;
      f_114 = term;
      e_114 = term;
      term = f_114;
      IStrategoList list57;
      list57 = checkListTail(e_114);
      if(list57 == null)
        break Fail2063;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs307, list57);
      if(true)
        return term;
    }
    return null;
  }
}