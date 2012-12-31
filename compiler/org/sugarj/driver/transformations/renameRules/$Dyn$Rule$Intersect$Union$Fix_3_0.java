package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_13, Strategy p_13, Strategy q_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnionFix_3_0");
    Fail56:
    { 
      IStrategoTerm m_100 = null;
      IStrategoTerm j_100 = null;
      IStrategoTerm k_100 = null;
      IStrategoTerm l_100 = null;
      IStrategoTerm n_100 = null;
      IStrategoTerm o_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectUnionFix_3 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      j_100 = term.getSubterm(0);
      k_100 = term.getSubterm(1);
      l_100 = term.getSubterm(2);
      IStrategoList annos50 = term.getAnnotations();
      m_100 = annos50;
      term = o_13.invoke(context, j_100);
      if(term == null)
        break Fail56;
      n_100 = term;
      term = p_13.invoke(context, k_100);
      if(term == null)
        break Fail56;
      o_100 = term;
      term = q_13.invoke(context, l_100);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectUnionFix_3, new IStrategoTerm[]{n_100, o_100, term}), checkListAnnos(termFactory, m_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}