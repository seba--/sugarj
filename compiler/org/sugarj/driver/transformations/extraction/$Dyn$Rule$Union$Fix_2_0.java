package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Union$Fix_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Union$Fix_2_0 instance = new $Dyn$Rule$Union$Fix_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_20, Strategy c_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnionFix_2_0");
    Fail86:
    { 
      IStrategoTerm g_114 = null;
      IStrategoTerm e_114 = null;
      IStrategoTerm f_114 = null;
      IStrategoTerm h_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDynRuleUnionFix_2 != ((IStrategoAppl)term).getConstructor())
        break Fail86;
      e_114 = term.getSubterm(0);
      f_114 = term.getSubterm(1);
      IStrategoList annos59 = term.getAnnotations();
      g_114 = annos59;
      term = b_20.invoke(context, e_114);
      if(term == null)
        break Fail86;
      h_114 = term;
      term = c_20.invoke(context, f_114);
      if(term == null)
        break Fail86;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consDynRuleUnionFix_2, new IStrategoTerm[]{h_114, term}), checkListAnnos(termFactory, g_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}