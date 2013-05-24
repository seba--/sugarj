package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Set$Dyn$Rule$Match_2_0 extends Strategy 
{ 
  public static $Set$Dyn$Rule$Match_2_0 instance = new $Set$Dyn$Rule$Match_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_340, Strategy e_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleMatch_2_0");
    Fail861:
    { 
      IStrategoTerm p_440 = null;
      IStrategoTerm n_440 = null;
      IStrategoTerm o_440 = null;
      IStrategoTerm q_440 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSetDynRuleMatch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail861;
      n_440 = term.getSubterm(0);
      o_440 = term.getSubterm(1);
      IStrategoList annos107 = term.getAnnotations();
      p_440 = annos107;
      term = d_340.invoke(context, n_440);
      if(term == null)
        break Fail861;
      q_440 = term;
      term = e_340.invoke(context, o_440);
      if(term == null)
        break Fail861;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSetDynRuleMatch_2, new IStrategoTerm[]{q_440, term}), checkListAnnos(termFactory, p_440));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}