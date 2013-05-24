package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class strat_to_analysis_0_0 extends Strategy 
{ 
  public static strat_to_analysis_0_0 instance = new strat_to_analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail13:
    { 
      term = termFactory.makeAppl(ext._consSDefNoArgs_2, new IStrategoTerm[]{extraction.const0, termFactory.makeAppl(ext._consCall_2, new IStrategoTerm[]{extraction.constSVar0, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)extraction.constNil0)})});
      if(true)
        return term;
    }
    context.push("strat_to_analysis_0_0");
    context.popOnFailure();
    return null;
  }
}