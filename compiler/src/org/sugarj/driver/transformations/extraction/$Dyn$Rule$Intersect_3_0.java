package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect_3_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect_3_0 instance = new $Dyn$Rule$Intersect_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_19, Strategy y_19, Strategy z_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersect_3_0");
    Fail85:
    { 
      IStrategoTerm y_113 = null;
      IStrategoTerm v_113 = null;
      IStrategoTerm w_113 = null;
      IStrategoTerm x_113 = null;
      IStrategoTerm z_113 = null;
      IStrategoTerm a_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consDynRuleIntersect_3 != ((IStrategoAppl)term).getConstructor())
        break Fail85;
      v_113 = term.getSubterm(0);
      w_113 = term.getSubterm(1);
      x_113 = term.getSubterm(2);
      IStrategoList annos58 = term.getAnnotations();
      y_113 = annos58;
      term = x_19.invoke(context, v_113);
      if(term == null)
        break Fail85;
      z_113 = term;
      term = y_19.invoke(context, w_113);
      if(term == null)
        break Fail85;
      a_114 = term;
      term = z_19.invoke(context, x_113);
      if(term == null)
        break Fail85;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consDynRuleIntersect_3, new IStrategoTerm[]{z_113, a_114, term}), checkListAnnos(termFactory, y_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}