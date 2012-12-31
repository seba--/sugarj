package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_10, Strategy k_10, Strategy l_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleDepends_3_0");
    Fail15:
    { 
      IStrategoTerm c_91 = null;
      IStrategoTerm y_90 = null;
      IStrategoTerm z_90 = null;
      IStrategoTerm b_91 = null;
      IStrategoTerm e_91 = null;
      IStrategoTerm f_91 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRuleDepends_3 != ((IStrategoAppl)term).getConstructor())
        break Fail15;
      y_90 = term.getSubterm(0);
      z_90 = term.getSubterm(1);
      b_91 = term.getSubterm(2);
      IStrategoList annos9 = term.getAnnotations();
      c_91 = annos9;
      term = j_10.invoke(context, y_90);
      if(term == null)
        break Fail15;
      e_91 = term;
      term = k_10.invoke(context, z_90);
      if(term == null)
        break Fail15;
      f_91 = term;
      term = l_10.invoke(context, b_91);
      if(term == null)
        break Fail15;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRuleDepends_3, new IStrategoTerm[]{e_91, f_91, term}), checkListAnnos(termFactory, c_91));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}