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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNames_1_0");
    Fail873:
    { 
      IStrategoTerm u_442 = null;
      IStrategoTerm t_442 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRuleNames_1 != ((IStrategoAppl)term).getConstructor())
        break Fail873;
      t_442 = term.getSubterm(0);
      IStrategoList annos119 = term.getAnnotations();
      u_442 = annos119;
      term = a_341.invoke(context, t_442);
      if(term == null)
        break Fail873;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRuleNames_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_442));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}