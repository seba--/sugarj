package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted199 extends Strategy 
{ 
  public static final lifted199 instance = new lifted199();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1844:
    { 
      IStrategoTerm n_168 = null;
      IStrategoTerm o_168 = null;
      o_168 = term;
      n_168 = term;
      term = o_168;
      IStrategoList list157;
      list157 = checkListTail(n_168);
      if(list157 == null)
        break Fail1844;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs129, list157);
      if(true)
        return term;
    }
    return null;
  }
}