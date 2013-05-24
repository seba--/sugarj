package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar_analyze_0_0 extends Strategy 
{ 
  public static desugar_analyze_0_0 instance = new desugar_analyze_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("desugar_analyze_0_0");
    Fail12:
    { 
      IStrategoTerm b_51 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAnalyses_1 != ((IStrategoAppl)term).getConstructor())
        break Fail12;
      b_51 = term.getSubterm(0);
      term = map_1_0.instance.invoke(context, b_51, strat_to_analysis_0_0.instance);
      if(term == null)
        break Fail12;
      term = termFactory.makeAppl(ext._consRules_1, new IStrategoTerm[]{term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}