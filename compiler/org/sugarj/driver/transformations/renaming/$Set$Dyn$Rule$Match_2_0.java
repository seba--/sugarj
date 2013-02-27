package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_10, Strategy q_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleMatch_2_0");
    Fail22:
    { 
      IStrategoTerm y_91 = null;
      IStrategoTerm w_91 = null;
      IStrategoTerm x_91 = null;
      IStrategoTerm z_91 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRuleMatch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22;
      w_91 = term.getSubterm(0);
      x_91 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      y_91 = annos12;
      term = p_10.invoke(context, w_91);
      if(term == null)
        break Fail22;
      z_91 = term;
      term = q_10.invoke(context, x_91);
      if(term == null)
        break Fail22;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRuleMatch_2, new IStrategoTerm[]{z_91, term}), checkListAnnos(termFactory, y_91));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}