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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_342, Strategy i_342)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNoCond_2_0");
    Fail886:
    { 
      IStrategoTerm w_445 = null;
      IStrategoTerm u_445 = null;
      IStrategoTerm v_445 = null;
      IStrategoTerm x_445 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRuleNoCond_2 != ((IStrategoAppl)term).getConstructor())
        break Fail886;
      u_445 = term.getSubterm(0);
      v_445 = term.getSubterm(1);
      IStrategoList annos132 = term.getAnnotations();
      w_445 = annos132;
      term = h_342.invoke(context, u_445);
      if(term == null)
        break Fail886;
      x_445 = term;
      term = i_342.invoke(context, v_445);
      if(term == null)
        break Fail886;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRuleNoCond_2, new IStrategoTerm[]{x_445, term}), checkListAnnos(termFactory, w_445));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}