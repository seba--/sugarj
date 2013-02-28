package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_9)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNames_1_0");
    Fail10:
    { 
      IStrategoTerm u_88 = null;
      IStrategoTerm t_88 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRuleNames_1 != ((IStrategoAppl)term).getConstructor())
        break Fail10;
      t_88 = term.getSubterm(0);
      IStrategoList annos0 = term.getAnnotations();
      u_88 = annos0;
      term = w_9.invoke(context, t_88);
      if(term == null)
        break Fail10;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRuleNames_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_88));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}