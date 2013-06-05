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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_16, Strategy u_16, Strategy v_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleDepends_3_0");
    Fail44:
    { 
      IStrategoTerm f_105 = null;
      IStrategoTerm c_105 = null;
      IStrategoTerm d_105 = null;
      IStrategoTerm e_105 = null;
      IStrategoTerm g_105 = null;
      IStrategoTerm h_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSetDynRuleDepends_3 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      c_105 = term.getSubterm(0);
      d_105 = term.getSubterm(1);
      e_105 = term.getSubterm(2);
      IStrategoList annos17 = term.getAnnotations();
      f_105 = annos17;
      term = t_16.invoke(context, c_105);
      if(term == null)
        break Fail44;
      g_105 = term;
      term = u_16.invoke(context, d_105);
      if(term == null)
        break Fail44;
      h_105 = term;
      term = v_16.invoke(context, e_105);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSetDynRuleDepends_3, new IStrategoTerm[]{g_105, h_105, term}), checkListAnnos(termFactory, f_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}