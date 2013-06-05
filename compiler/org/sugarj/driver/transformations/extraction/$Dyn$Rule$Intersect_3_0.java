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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_19, Strategy w_19, Strategy x_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersect_3_0");
    Fail84:
    { 
      IStrategoTerm t_113 = null;
      IStrategoTerm q_113 = null;
      IStrategoTerm r_113 = null;
      IStrategoTerm s_113 = null;
      IStrategoTerm u_113 = null;
      IStrategoTerm v_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDynRuleIntersect_3 != ((IStrategoAppl)term).getConstructor())
        break Fail84;
      q_113 = term.getSubterm(0);
      r_113 = term.getSubterm(1);
      s_113 = term.getSubterm(2);
      IStrategoList annos57 = term.getAnnotations();
      t_113 = annos57;
      term = v_19.invoke(context, q_113);
      if(term == null)
        break Fail84;
      u_113 = term;
      term = w_19.invoke(context, r_113);
      if(term == null)
        break Fail84;
      v_113 = term;
      term = x_19.invoke(context, s_113);
      if(term == null)
        break Fail84;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consDynRuleIntersect_3, new IStrategoTerm[]{u_113, v_113, term}), checkListAnnos(termFactory, t_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}