package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParenStrat_1_0");
    Fail286:
    { 
      IStrategoTerm d_182 = null;
      IStrategoTerm c_182 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consParenStrat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail286;
      c_182 = term.getSubterm(0);
      IStrategoList annos233 = term.getAnnotations();
      d_182 = annos233;
      term = c_43.invoke(context, c_182);
      if(term == null)
        break Fail286;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consParenStrat_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_182));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}