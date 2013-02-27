package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Set$Dyn$Rule$Depends_3_0 extends Strategy 
{ 
  public static $Set$Dyn$Rule$Depends_3_0 instance = new $Set$Dyn$Rule$Depends_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_10, Strategy j_10, Strategy k_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleDepends_3_0");
    Fail19:
    { 
      IStrategoTerm b_91 = null;
      IStrategoTerm w_90 = null;
      IStrategoTerm y_90 = null;
      IStrategoTerm z_90 = null;
      IStrategoTerm c_91 = null;
      IStrategoTerm e_91 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRuleDepends_3 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      w_90 = term.getSubterm(0);
      y_90 = term.getSubterm(1);
      z_90 = term.getSubterm(2);
      IStrategoList annos9 = term.getAnnotations();
      b_91 = annos9;
      term = i_10.invoke(context, w_90);
      if(term == null)
        break Fail19;
      c_91 = term;
      term = j_10.invoke(context, y_90);
      if(term == null)
        break Fail19;
      e_91 = term;
      term = k_10.invoke(context, z_90);
      if(term == null)
        break Fail19;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRuleDepends_3, new IStrategoTerm[]{c_91, e_91, term}), checkListAnnos(termFactory, b_91));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}