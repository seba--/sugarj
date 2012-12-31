package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_10, Strategy r_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleMatch_2_0");
    Fail18:
    { 
      IStrategoTerm z_91 = null;
      IStrategoTerm x_91 = null;
      IStrategoTerm y_91 = null;
      IStrategoTerm a_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRuleMatch_2 != ((IStrategoAppl)term).getConstructor())
        break Fail18;
      x_91 = term.getSubterm(0);
      y_91 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      z_91 = annos12;
      term = q_10.invoke(context, x_91);
      if(term == null)
        break Fail18;
      a_92 = term;
      term = r_10.invoke(context, y_91);
      if(term == null)
        break Fail18;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRuleMatch_2, new IStrategoTerm[]{a_92, term}), checkListAnnos(termFactory, z_91));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}