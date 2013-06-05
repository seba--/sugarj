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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_19, Strategy z_19, Strategy a_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnionFix_3_0");
    Fail85:
    { 
      IStrategoTerm a_114 = null;
      IStrategoTerm x_113 = null;
      IStrategoTerm y_113 = null;
      IStrategoTerm z_113 = null;
      IStrategoTerm b_114 = null;
      IStrategoTerm c_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDynRuleIntersectUnionFix_3 != ((IStrategoAppl)term).getConstructor())
        break Fail85;
      x_113 = term.getSubterm(0);
      y_113 = term.getSubterm(1);
      z_113 = term.getSubterm(2);
      IStrategoList annos58 = term.getAnnotations();
      a_114 = annos58;
      term = y_19.invoke(context, x_113);
      if(term == null)
        break Fail85;
      b_114 = term;
      term = z_19.invoke(context, y_113);
      if(term == null)
        break Fail85;
      c_114 = term;
      term = a_20.invoke(context, z_113);
      if(term == null)
        break Fail85;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consDynRuleIntersectUnionFix_3, new IStrategoTerm[]{b_114, c_114, term}), checkListAnnos(termFactory, a_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}