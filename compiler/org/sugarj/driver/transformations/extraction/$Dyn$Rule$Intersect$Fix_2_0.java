package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect$Fix_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect$Fix_2_0 instance = new $Dyn$Rule$Intersect$Fix_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_341, Strategy c_341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectFix_2_0");
    Fail874:
    { 
      IStrategoTerm y_442 = null;
      IStrategoTerm w_442 = null;
      IStrategoTerm x_442 = null;
      IStrategoTerm z_442 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDynRuleIntersectFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail874;
      w_442 = term.getSubterm(0);
      x_442 = term.getSubterm(1);
      IStrategoList annos120 = term.getAnnotations();
      y_442 = annos120;
      term = b_341.invoke(context, w_442);
      if(term == null)
        break Fail874;
      z_442 = term;
      term = c_341.invoke(context, x_442);
      if(term == null)
        break Fail874;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDynRuleIntersectFix_2, new IStrategoTerm[]{z_442, term}), checkListAnnos(termFactory, y_442));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}