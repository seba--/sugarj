package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted145 extends Strategy 
{ 
  public static final lifted145 instance = new lifted145();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1955:
    { 
      IStrategoTerm q_138 = null;
      IStrategoTerm r_138 = null;
      r_138 = term;
      q_138 = term;
      term = r_138;
      IStrategoList list103;
      list103 = checkListTail(q_138);
      if(list103 == null)
        break Fail1955;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs112, list103);
      if(true)
        return term;
    }
    return null;
  }
}