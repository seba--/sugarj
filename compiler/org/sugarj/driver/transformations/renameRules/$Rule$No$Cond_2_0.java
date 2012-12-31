package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_11, Strategy h_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNoCond_2_0");
    Fail27:
    { 
      IStrategoTerm y_93 = null;
      IStrategoTerm w_93 = null;
      IStrategoTerm x_93 = null;
      IStrategoTerm z_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRuleNoCond_2 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      w_93 = term.getSubterm(0);
      x_93 = term.getSubterm(1);
      IStrategoList annos21 = term.getAnnotations();
      y_93 = annos21;
      term = g_11.invoke(context, w_93);
      if(term == null)
        break Fail27;
      z_93 = term;
      term = h_11.invoke(context, x_93);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRuleNoCond_2, new IStrategoTerm[]{z_93, term}), checkListAnnos(termFactory, y_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}