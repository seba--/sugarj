package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rule$No$Cond_2_0 extends Strategy 
{ 
  public static $Rule$No$Cond_2_0 instance = new $Rule$No$Cond_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_17, Strategy s_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNoCond_2_0");
    Fail44:
    { 
      IStrategoTerm p_107 = null;
      IStrategoTerm k_107 = null;
      IStrategoTerm o_107 = null;
      IStrategoTerm q_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRuleNoCond_2 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      k_107 = term.getSubterm(0);
      o_107 = term.getSubterm(1);
      IStrategoList annos21 = term.getAnnotations();
      p_107 = annos21;
      term = r_17.invoke(context, k_107);
      if(term == null)
        break Fail44;
      q_107 = term;
      term = s_17.invoke(context, o_107);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRuleNoCond_2, new IStrategoTerm[]{q_107, term}), checkListAnnos(termFactory, p_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}