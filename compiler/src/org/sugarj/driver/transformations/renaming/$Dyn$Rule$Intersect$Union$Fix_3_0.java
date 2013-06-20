package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_13, Strategy u_13, Strategy v_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnionFix_3_0");
    Fail59:
    { 
      IStrategoTerm r_100 = null;
      IStrategoTerm o_100 = null;
      IStrategoTerm p_100 = null;
      IStrategoTerm q_100 = null;
      IStrategoTerm s_100 = null;
      IStrategoTerm t_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectUnionFix_3 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      o_100 = term.getSubterm(0);
      p_100 = term.getSubterm(1);
      q_100 = term.getSubterm(2);
      IStrategoList annos50 = term.getAnnotations();
      r_100 = annos50;
      term = t_13.invoke(context, o_100);
      if(term == null)
        break Fail59;
      s_100 = term;
      term = u_13.invoke(context, p_100);
      if(term == null)
        break Fail59;
      t_100 = term;
      term = v_13.invoke(context, q_100);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectUnionFix_3, new IStrategoTerm[]{s_100, t_100, term}), checkListAnnos(termFactory, r_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}