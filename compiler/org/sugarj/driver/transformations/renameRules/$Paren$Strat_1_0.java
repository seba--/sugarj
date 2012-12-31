package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Paren$Strat_1_0 extends Strategy 
{ 
  public static $Paren$Strat_1_0 instance = new $Paren$Strat_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParenStrat_1_0");
    Fail45:
    { 
      IStrategoTerm d_97 = null;
      IStrategoTerm c_97 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consParenStrat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      c_97 = term.getSubterm(0);
      IStrategoList annos39 = term.getAnnotations();
      d_97 = annos39;
      term = k_12.invoke(context, c_97);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consParenStrat_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_97));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}