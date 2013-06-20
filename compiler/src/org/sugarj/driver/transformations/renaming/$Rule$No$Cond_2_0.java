package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_11, Strategy m_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNoCond_2_0");
    Fail30:
    { 
      IStrategoTerm d_94 = null;
      IStrategoTerm b_94 = null;
      IStrategoTerm c_94 = null;
      IStrategoTerm e_94 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRuleNoCond_2 != ((IStrategoAppl)term).getConstructor())
        break Fail30;
      b_94 = term.getSubterm(0);
      c_94 = term.getSubterm(1);
      IStrategoList annos21 = term.getAnnotations();
      d_94 = annos21;
      term = l_11.invoke(context, b_94);
      if(term == null)
        break Fail30;
      e_94 = term;
      term = m_11.invoke(context, c_94);
      if(term == null)
        break Fail30;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRuleNoCond_2, new IStrategoTerm[]{e_94, term}), checkListAnnos(termFactory, d_94));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}