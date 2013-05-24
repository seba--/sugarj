package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class iter_sep_2_0 extends Strategy 
{ 
  public static iter_sep_2_0 instance = new iter_sep_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_350, Strategy n_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_sep_2_0");
    Fail1041:
    { 
      IStrategoTerm m_467 = null;
      IStrategoTerm k_467 = null;
      IStrategoTerm l_467 = null;
      IStrategoTerm n_467 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consiter_sep_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1041;
      k_467 = term.getSubterm(0);
      l_467 = term.getSubterm(1);
      IStrategoList annos268 = term.getAnnotations();
      m_467 = annos268;
      term = m_350.invoke(context, k_467);
      if(term == null)
        break Fail1041;
      n_467 = term;
      term = n_350.invoke(context, l_467);
      if(term == null)
        break Fail1041;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consiter_sep_2, new IStrategoTerm[]{n_467, term}), checkListAnnos(termFactory, m_467));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}