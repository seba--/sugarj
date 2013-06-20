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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_17, Strategy t_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNoCond_2_0");
    Fail57:
    { 
      IStrategoTerm x_107 = null;
      IStrategoTerm v_107 = null;
      IStrategoTerm w_107 = null;
      IStrategoTerm y_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRuleNoCond_2 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      v_107 = term.getSubterm(0);
      w_107 = term.getSubterm(1);
      IStrategoList annos30 = term.getAnnotations();
      x_107 = annos30;
      term = s_17.invoke(context, v_107);
      if(term == null)
        break Fail57;
      y_107 = term;
      term = t_17.invoke(context, w_107);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRuleNoCond_2, new IStrategoTerm[]{y_107, term}), checkListAnnos(termFactory, x_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}