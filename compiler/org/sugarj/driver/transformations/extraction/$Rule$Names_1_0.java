package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rule$Names_1_0 extends Strategy 
{ 
  public static $Rule$Names_1_0 instance = new $Rule$Names_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNames_1_0");
    Fail23:
    { 
      IStrategoTerm k_103 = null;
      IStrategoTerm j_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRuleNames_1 != ((IStrategoAppl)term).getConstructor())
        break Fail23;
      j_103 = term.getSubterm(0);
      IStrategoList annos0 = term.getAnnotations();
      k_103 = annos0;
      term = f_16.invoke(context, j_103);
      if(term == null)
        break Fail23;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRuleNames_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}