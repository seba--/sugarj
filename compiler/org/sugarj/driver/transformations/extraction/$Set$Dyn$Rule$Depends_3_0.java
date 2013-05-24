package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Set$Dyn$Rule$Depends_3_0 extends Strategy 
{ 
  public static $Set$Dyn$Rule$Depends_3_0 instance = new $Set$Dyn$Rule$Depends_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_340, Strategy k_340, Strategy l_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleDepends_3_0");
    Fail864:
    { 
      IStrategoTerm f_441 = null;
      IStrategoTerm c_441 = null;
      IStrategoTerm d_441 = null;
      IStrategoTerm e_441 = null;
      IStrategoTerm g_441 = null;
      IStrategoTerm h_441 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSetDynRuleDepends_3 != ((IStrategoAppl)term).getConstructor())
        break Fail864;
      c_441 = term.getSubterm(0);
      d_441 = term.getSubterm(1);
      e_441 = term.getSubterm(2);
      IStrategoList annos110 = term.getAnnotations();
      f_441 = annos110;
      term = j_340.invoke(context, c_441);
      if(term == null)
        break Fail864;
      g_441 = term;
      term = k_340.invoke(context, d_441);
      if(term == null)
        break Fail864;
      h_441 = term;
      term = l_340.invoke(context, e_441);
      if(term == null)
        break Fail864;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSetDynRuleDepends_3, new IStrategoTerm[]{g_441, h_441, term}), checkListAnnos(termFactory, f_441));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}