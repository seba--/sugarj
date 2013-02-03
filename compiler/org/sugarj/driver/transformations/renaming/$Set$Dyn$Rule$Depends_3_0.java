package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_10, Strategy p_10, Strategy q_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleDepends_3_0");
    Fail18:
    { 
      IStrategoTerm k_91 = null;
      IStrategoTerm f_91 = null;
      IStrategoTerm h_91 = null;
      IStrategoTerm i_91 = null;
      IStrategoTerm l_91 = null;
      IStrategoTerm n_91 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRuleDepends_3 != ((IStrategoAppl)term).getConstructor())
        break Fail18;
      f_91 = term.getSubterm(0);
      h_91 = term.getSubterm(1);
      i_91 = term.getSubterm(2);
      IStrategoList annos9 = term.getAnnotations();
      k_91 = annos9;
      term = o_10.invoke(context, f_91);
      if(term == null)
        break Fail18;
      l_91 = term;
      term = p_10.invoke(context, h_91);
      if(term == null)
        break Fail18;
      n_91 = term;
      term = q_10.invoke(context, i_91);
      if(term == null)
        break Fail18;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRuleDepends_3, new IStrategoTerm[]{l_91, n_91, term}), checkListAnnos(termFactory, k_91));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}