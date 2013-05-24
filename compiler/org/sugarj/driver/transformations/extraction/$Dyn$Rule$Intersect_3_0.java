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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_341, Strategy j_341, Strategy k_341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersect_3_0");
    Fail877:
    { 
      IStrategoTerm q_443 = null;
      IStrategoTerm n_443 = null;
      IStrategoTerm o_443 = null;
      IStrategoTerm p_443 = null;
      IStrategoTerm r_443 = null;
      IStrategoTerm s_443 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDynRuleIntersect_3 != ((IStrategoAppl)term).getConstructor())
        break Fail877;
      n_443 = term.getSubterm(0);
      o_443 = term.getSubterm(1);
      p_443 = term.getSubterm(2);
      IStrategoList annos123 = term.getAnnotations();
      q_443 = annos123;
      term = i_341.invoke(context, n_443);
      if(term == null)
        break Fail877;
      r_443 = term;
      term = j_341.invoke(context, o_443);
      if(term == null)
        break Fail877;
      s_443 = term;
      term = k_341.invoke(context, p_443);
      if(term == null)
        break Fail877;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDynRuleIntersect_3, new IStrategoTerm[]{r_443, s_443, term}), checkListAnnos(termFactory, q_443));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}