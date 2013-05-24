package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted101 extends Strategy 
{ 
  public static final lifted101 instance = new lifted101();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2061:
    { 
      IStrategoTerm v_114 = null;
      IStrategoTerm w_114 = null;
      w_114 = term;
      v_114 = term;
      term = w_114;
      IStrategoList list59;
      list59 = checkListTail(v_114);
      if(list59 == null)
        break Fail2061;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs307, list59);
      if(true)
        return term;
    }
    return null;
  }
}