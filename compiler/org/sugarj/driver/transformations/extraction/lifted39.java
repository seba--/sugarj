package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted39 extends Strategy 
{ 
  public static final lifted39 instance = new lifted39();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2187:
    { 
      IStrategoTerm s_473 = null;
      IStrategoTerm t_473 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2187;
      s_473 = term.getSubterm(0);
      t_473 = term.getSubterm(1);
      term = termFactory.makeAppl(ext._consSort_2, new IStrategoTerm[]{extraction.const322, (IStrategoTerm)termFactory.makeListCons(s_473, termFactory.makeListCons(t_473, (IStrategoList)extraction.constNil0))});
      if(true)
        return term;
    }
    return null;
  }
}