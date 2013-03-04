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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNames_1_0");
    Fail247:
    { 
      IStrategoTerm m_174 = null;
      IStrategoTerm l_174 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRuleNames_1 != ((IStrategoAppl)term).getConstructor())
        break Fail247;
      l_174 = term.getSubterm(0);
      IStrategoList annos194 = term.getAnnotations();
      m_174 = annos194;
      term = m_40.invoke(context, l_174);
      if(term == null)
        break Fail247;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRuleNames_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_174));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}