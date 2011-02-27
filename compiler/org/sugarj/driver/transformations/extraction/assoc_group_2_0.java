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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_26, Strategy m_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_group_2_0");
    Fail189:
    { 
      IStrategoTerm z_135 = null;
      IStrategoTerm s_135 = null;
      IStrategoTerm w_135 = null;
      IStrategoTerm b_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consassoc_group_2 != ((IStrategoAppl)term).getConstructor())
        break Fail189;
      s_135 = term.getSubterm(0);
      w_135 = term.getSubterm(1);
      IStrategoList annos157 = term.getAnnotations();
      z_135 = annos157;
      term = l_26.invoke(context, s_135);
      if(term == null)
        break Fail189;
      b_136 = term;
      term = m_26.invoke(context, w_135);
      if(term == null)
        break Fail189;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consassoc_group_2, new IStrategoTerm[]{b_136, term}), checkListAnnos(termFactory, z_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}