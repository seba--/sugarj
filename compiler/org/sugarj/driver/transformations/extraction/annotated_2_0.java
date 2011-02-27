package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class annotated_2_0 extends Strategy 
{ 
  public static annotated_2_0 instance = new annotated_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_29, Strategy n_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("annotated_2_0");
    Fail260:
    { 
      IStrategoTerm m_148 = null;
      IStrategoTerm k_148 = null;
      IStrategoTerm l_148 = null;
      IStrategoTerm n_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consannotated_2 != ((IStrategoAppl)term).getConstructor())
        break Fail260;
      k_148 = term.getSubterm(0);
      l_148 = term.getSubterm(1);
      IStrategoList annos215 = term.getAnnotations();
      m_148 = annos215;
      term = m_29.invoke(context, k_148);
      if(term == null)
        break Fail260;
      n_148 = term;
      term = n_29.invoke(context, l_148);
      if(term == null)
        break Fail260;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consannotated_2, new IStrategoTerm[]{n_148, term}), checkListAnnos(termFactory, m_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}