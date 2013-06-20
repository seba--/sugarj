package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class assoc_group_2_0 extends Strategy 
{ 
  public static assoc_group_2_0 instance = new assoc_group_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_26, Strategy n_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_group_2_0");
    Fail202:
    { 
      IStrategoTerm l_136 = null;
      IStrategoTerm j_136 = null;
      IStrategoTerm k_136 = null;
      IStrategoTerm m_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consassoc_group_2 != ((IStrategoAppl)term).getConstructor())
        break Fail202;
      j_136 = term.getSubterm(0);
      k_136 = term.getSubterm(1);
      IStrategoList annos166 = term.getAnnotations();
      l_136 = annos166;
      term = m_26.invoke(context, j_136);
      if(term == null)
        break Fail202;
      m_136 = term;
      term = n_26.invoke(context, k_136);
      if(term == null)
        break Fail202;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consassoc_group_2, new IStrategoTerm[]{m_136, term}), checkListAnnos(termFactory, l_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}