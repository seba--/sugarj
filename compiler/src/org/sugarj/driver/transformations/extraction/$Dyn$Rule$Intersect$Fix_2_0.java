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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_20, Strategy g_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectFix_2_0");
    Fail88:
    { 
      IStrategoTerm s_114 = null;
      IStrategoTerm o_114 = null;
      IStrategoTerm p_114 = null;
      IStrategoTerm t_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consDynRuleIntersectFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail88;
      o_114 = term.getSubterm(0);
      p_114 = term.getSubterm(1);
      IStrategoList annos61 = term.getAnnotations();
      s_114 = annos61;
      term = f_20.invoke(context, o_114);
      if(term == null)
        break Fail88;
      t_114 = term;
      term = g_20.invoke(context, p_114);
      if(term == null)
        break Fail88;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consDynRuleIntersectFix_2, new IStrategoTerm[]{t_114, term}), checkListAnnos(termFactory, s_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}