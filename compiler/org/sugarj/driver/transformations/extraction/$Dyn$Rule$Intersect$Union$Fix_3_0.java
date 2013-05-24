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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_341, Strategy g_341, Strategy h_341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnionFix_3_0");
    Fail876:
    { 
      IStrategoTerm j_443 = null;
      IStrategoTerm g_443 = null;
      IStrategoTerm h_443 = null;
      IStrategoTerm i_443 = null;
      IStrategoTerm k_443 = null;
      IStrategoTerm l_443 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDynRuleIntersectUnionFix_3 != ((IStrategoAppl)term).getConstructor())
        break Fail876;
      g_443 = term.getSubterm(0);
      h_443 = term.getSubterm(1);
      i_443 = term.getSubterm(2);
      IStrategoList annos122 = term.getAnnotations();
      j_443 = annos122;
      term = f_341.invoke(context, g_443);
      if(term == null)
        break Fail876;
      k_443 = term;
      term = g_341.invoke(context, h_443);
      if(term == null)
        break Fail876;
      l_443 = term;
      term = h_341.invoke(context, i_443);
      if(term == null)
        break Fail876;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDynRuleIntersectUnionFix_3, new IStrategoTerm[]{k_443, l_443, term}), checkListAnnos(termFactory, j_443));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}