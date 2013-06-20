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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParenStrat_1_0");
    Fail75:
    { 
      IStrategoTerm f_111 = null;
      IStrategoTerm e_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consParenStrat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail75;
      e_111 = term.getSubterm(0);
      IStrategoList annos48 = term.getAnnotations();
      f_111 = annos48;
      term = w_18.invoke(context, e_111);
      if(term == null)
        break Fail75;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consParenStrat_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}