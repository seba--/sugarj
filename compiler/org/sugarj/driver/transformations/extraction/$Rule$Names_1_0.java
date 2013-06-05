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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNames_1_0");
    Fail35:
    { 
      IStrategoTerm n_103 = null;
      IStrategoTerm m_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRuleNames_1 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      m_103 = term.getSubterm(0);
      IStrategoList annos8 = term.getAnnotations();
      n_103 = annos8;
      term = e_16.invoke(context, m_103);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRuleNames_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}