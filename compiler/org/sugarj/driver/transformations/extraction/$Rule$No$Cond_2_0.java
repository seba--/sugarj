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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_17, Strategy r_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNoCond_2_0");
    Fail56:
    { 
      IStrategoTerm s_107 = null;
      IStrategoTerm q_107 = null;
      IStrategoTerm r_107 = null;
      IStrategoTerm t_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRuleNoCond_2 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      q_107 = term.getSubterm(0);
      r_107 = term.getSubterm(1);
      IStrategoList annos29 = term.getAnnotations();
      s_107 = annos29;
      term = q_17.invoke(context, q_107);
      if(term == null)
        break Fail56;
      t_107 = term;
      term = r_17.invoke(context, r_107);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRuleNoCond_2, new IStrategoTerm[]{t_107, term}), checkListAnnos(termFactory, s_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}