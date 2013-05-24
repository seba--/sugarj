package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted102 extends Strategy 
{ 
  public static final lifted102 instance = new lifted102();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2060:
    { 
      IStrategoTerm e_115 = null;
      IStrategoTerm f_115 = null;
      f_115 = term;
      e_115 = term;
      term = f_115;
      IStrategoList list60;
      list60 = checkListTail(e_115);
      if(list60 == null)
        break Fail2060;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs307, list60);
      if(true)
        return term;
    }
    return null;
  }
}