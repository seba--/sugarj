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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParenStrat_1_0");
    Fail972:
    { 
      IStrategoTerm j_459 = null;
      IStrategoTerm i_459 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consParenStrat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail972;
      i_459 = term.getSubterm(0);
      IStrategoList annos214 = term.getAnnotations();
      j_459 = annos214;
      term = m_347.invoke(context, i_459);
      if(term == null)
        break Fail972;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consParenStrat_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_459));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}