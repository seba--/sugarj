package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_9)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNames_1_0");
    Fail6:
    { 
      IStrategoTerm s_88 = null;
      IStrategoTerm r_88 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRuleNames_1 != ((IStrategoAppl)term).getConstructor())
        break Fail6;
      r_88 = term.getSubterm(0);
      IStrategoList annos0 = term.getAnnotations();
      s_88 = annos0;
      term = u_9.invoke(context, r_88);
      if(term == null)
        break Fail6;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRuleNames_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_88));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}