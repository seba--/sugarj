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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParenStrat_1_0");
    Fail74:
    { 
      IStrategoTerm u_110 = null;
      IStrategoTerm t_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consParenStrat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail74;
      t_110 = term.getSubterm(0);
      IStrategoList annos47 = term.getAnnotations();
      u_110 = annos47;
      term = u_18.invoke(context, t_110);
      if(term == null)
        break Fail74;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consParenStrat_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}