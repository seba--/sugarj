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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_19, Strategy x_19, Strategy y_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersect_3_0");
    Fail72:
    { 
      IStrategoTerm q_113 = null;
      IStrategoTerm m_113 = null;
      IStrategoTerm n_113 = null;
      IStrategoTerm o_113 = null;
      IStrategoTerm r_113 = null;
      IStrategoTerm s_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDynRuleIntersect_3 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      m_113 = term.getSubterm(0);
      n_113 = term.getSubterm(1);
      o_113 = term.getSubterm(2);
      IStrategoList annos49 = term.getAnnotations();
      q_113 = annos49;
      term = w_19.invoke(context, m_113);
      if(term == null)
        break Fail72;
      r_113 = term;
      term = x_19.invoke(context, n_113);
      if(term == null)
        break Fail72;
      s_113 = term;
      term = y_19.invoke(context, o_113);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDynRuleIntersect_3, new IStrategoTerm[]{r_113, s_113, term}), checkListAnnos(termFactory, q_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}