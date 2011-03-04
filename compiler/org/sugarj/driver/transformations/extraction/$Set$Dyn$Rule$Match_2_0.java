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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_17, Strategy c_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleMatch_2_0");
    Fail36:
    { 
      IStrategoTerm t_105 = null;
      IStrategoTerm r_105 = null;
      IStrategoTerm s_105 = null;
      IStrategoTerm u_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSetDynRuleMatch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      r_105 = term.getSubterm(0);
      s_105 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      t_105 = annos12;
      term = b_17.invoke(context, r_105);
      if(term == null)
        break Fail36;
      u_105 = term;
      term = c_17.invoke(context, s_105);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSetDynRuleMatch_2, new IStrategoTerm[]{u_105, term}), checkListAnnos(termFactory, t_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}