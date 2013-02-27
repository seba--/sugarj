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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_13, Strategy o_13, Strategy p_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnionFix_3_0");
    Fail60:
    { 
      IStrategoTerm l_100 = null;
      IStrategoTerm i_100 = null;
      IStrategoTerm j_100 = null;
      IStrategoTerm k_100 = null;
      IStrategoTerm m_100 = null;
      IStrategoTerm n_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectUnionFix_3 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      i_100 = term.getSubterm(0);
      j_100 = term.getSubterm(1);
      k_100 = term.getSubterm(2);
      IStrategoList annos50 = term.getAnnotations();
      l_100 = annos50;
      term = n_13.invoke(context, i_100);
      if(term == null)
        break Fail60;
      m_100 = term;
      term = o_13.invoke(context, j_100);
      if(term == null)
        break Fail60;
      n_100 = term;
      term = p_13.invoke(context, k_100);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectUnionFix_3, new IStrategoTerm[]{m_100, n_100, term}), checkListAnnos(termFactory, l_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}