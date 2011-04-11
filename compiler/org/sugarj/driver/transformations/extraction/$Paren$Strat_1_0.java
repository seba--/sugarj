package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParenStrat_1_0");
    Fail63:
    { 
      IStrategoTerm r_110 = null;
      IStrategoTerm q_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consParenStrat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      q_110 = term.getSubterm(0);
      IStrategoList annos39 = term.getAnnotations();
      r_110 = annos39;
      term = v_18.invoke(context, q_110);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consParenStrat_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}