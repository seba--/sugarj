package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_44, Strategy k_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectFix_2_0");
    Fail298:
    { 
      IStrategoTerm h_185 = null;
      IStrategoTerm f_185 = null;
      IStrategoTerm g_185 = null;
      IStrategoTerm k_185 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail298;
      f_185 = term.getSubterm(0);
      g_185 = term.getSubterm(1);
      IStrategoList annos245 = term.getAnnotations();
      h_185 = annos245;
      term = j_44.invoke(context, f_185);
      if(term == null)
        break Fail298;
      k_185 = term;
      term = k_44.invoke(context, g_185);
      if(term == null)
        break Fail298;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectFix_2, new IStrategoTerm[]{k_185, term}), checkListAnnos(termFactory, h_185));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}