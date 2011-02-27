package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect$Fix_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect$Fix_2_0 instance = new $Dyn$Rule$Intersect$Fix_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_20, Strategy f_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectFix_2_0");
    Fail75:
    { 
      IStrategoTerm i_114 = null;
      IStrategoTerm g_114 = null;
      IStrategoTerm h_114 = null;
      IStrategoTerm j_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDynRuleIntersectFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail75;
      g_114 = term.getSubterm(0);
      h_114 = term.getSubterm(1);
      IStrategoList annos52 = term.getAnnotations();
      i_114 = annos52;
      term = e_20.invoke(context, g_114);
      if(term == null)
        break Fail75;
      j_114 = term;
      term = f_20.invoke(context, h_114);
      if(term == null)
        break Fail75;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDynRuleIntersectFix_2, new IStrategoTerm[]{j_114, term}), checkListAnnos(termFactory, i_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}