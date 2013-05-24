package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Labeled$Dyn$Rule$Id_2_0 extends Strategy 
{ 
  public static $Labeled$Dyn$Rule$Id_2_0 instance = new $Labeled$Dyn$Rule$Id_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_340, Strategy n_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleId_2_0");
    Fail865:
    { 
      IStrategoTerm l_441 = null;
      IStrategoTerm j_441 = null;
      IStrategoTerm k_441 = null;
      IStrategoTerm m_441 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consLabeledDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail865;
      j_441 = term.getSubterm(0);
      k_441 = term.getSubterm(1);
      IStrategoList annos111 = term.getAnnotations();
      l_441 = annos111;
      term = m_340.invoke(context, j_441);
      if(term == null)
        break Fail865;
      m_441 = term;
      term = n_340.invoke(context, k_441);
      if(term == null)
        break Fail865;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consLabeledDynRuleId_2, new IStrategoTerm[]{m_441, term}), checkListAnnos(termFactory, l_441));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}