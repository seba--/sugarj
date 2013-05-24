package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted142 extends Strategy 
{ 
  public static final lifted142 instance = new lifted142();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1958:
    { 
      IStrategoTerm s_137 = null;
      IStrategoTerm t_137 = null;
      t_137 = term;
      s_137 = term;
      term = t_137;
      IStrategoList list100;
      list100 = checkListTail(s_137);
      if(list100 == null)
        break Fail1958;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs112, list100);
      if(true)
        return term;
    }
    return null;
  }
}