package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect$Union$Fix_3_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect$Union$Fix_3_0 instance = new $Dyn$Rule$Intersect$Union$Fix_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_19, Strategy a_20, Strategy b_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnionFix_3_0");
    Fail73:
    { 
      IStrategoTerm x_113 = null;
      IStrategoTerm u_113 = null;
      IStrategoTerm v_113 = null;
      IStrategoTerm w_113 = null;
      IStrategoTerm y_113 = null;
      IStrategoTerm z_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDynRuleIntersectUnionFix_3 != ((IStrategoAppl)term).getConstructor())
        break Fail73;
      u_113 = term.getSubterm(0);
      v_113 = term.getSubterm(1);
      w_113 = term.getSubterm(2);
      IStrategoList annos50 = term.getAnnotations();
      x_113 = annos50;
      term = z_19.invoke(context, u_113);
      if(term == null)
        break Fail73;
      y_113 = term;
      term = a_20.invoke(context, v_113);
      if(term == null)
        break Fail73;
      z_113 = term;
      term = b_20.invoke(context, w_113);
      if(term == null)
        break Fail73;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDynRuleIntersectUnionFix_3, new IStrategoTerm[]{y_113, z_113, term}), checkListAnnos(termFactory, x_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}