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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_11, Strategy j_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNoCond_2_0");
    Fail31:
    { 
      IStrategoTerm a_94 = null;
      IStrategoTerm y_93 = null;
      IStrategoTerm z_93 = null;
      IStrategoTerm b_94 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRuleNoCond_2 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      y_93 = term.getSubterm(0);
      z_93 = term.getSubterm(1);
      IStrategoList annos21 = term.getAnnotations();
      a_94 = annos21;
      term = i_11.invoke(context, y_93);
      if(term == null)
        break Fail31;
      b_94 = term;
      term = j_11.invoke(context, z_93);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRuleNoCond_2, new IStrategoTerm[]{b_94, term}), checkListAnnos(termFactory, a_94));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}