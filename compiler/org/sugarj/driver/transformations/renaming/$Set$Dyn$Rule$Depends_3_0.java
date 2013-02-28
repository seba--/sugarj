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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_10, Strategy m_10, Strategy n_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRuleDepends_3_0");
    Fail19:
    { 
      IStrategoTerm f_91 = null;
      IStrategoTerm b_91 = null;
      IStrategoTerm c_91 = null;
      IStrategoTerm e_91 = null;
      IStrategoTerm h_91 = null;
      IStrategoTerm i_91 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSetDynRuleDepends_3 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      b_91 = term.getSubterm(0);
      c_91 = term.getSubterm(1);
      e_91 = term.getSubterm(2);
      IStrategoList annos9 = term.getAnnotations();
      f_91 = annos9;
      term = l_10.invoke(context, b_91);
      if(term == null)
        break Fail19;
      h_91 = term;
      term = m_10.invoke(context, c_91);
      if(term == null)
        break Fail19;
      i_91 = term;
      term = n_10.invoke(context, e_91);
      if(term == null)
        break Fail19;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSetDynRuleDepends_3, new IStrategoTerm[]{h_91, i_91, term}), checkListAnnos(termFactory, f_91));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}