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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_17, Strategy b_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleMatch_2_0");
    Fail47:
    { 
      IStrategoTerm w_105 = null;
      IStrategoTerm u_105 = null;
      IStrategoTerm v_105 = null;
      IStrategoTerm x_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSetDynRuleMatch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      u_105 = term.getSubterm(0);
      v_105 = term.getSubterm(1);
      IStrategoList annos20 = term.getAnnotations();
      w_105 = annos20;
      term = a_17.invoke(context, u_105);
      if(term == null)
        break Fail47;
      x_105 = term;
      term = b_17.invoke(context, v_105);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSetDynRuleMatch_2, new IStrategoTerm[]{x_105, term}), checkListAnnos(termFactory, w_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}