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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_29, Strategy m_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("annotated_2_0");
    Fail272:
    { 
      IStrategoTerm p_148 = null;
      IStrategoTerm n_148 = null;
      IStrategoTerm o_148 = null;
      IStrategoTerm q_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consannotated_2 != ((IStrategoAppl)term).getConstructor())
        break Fail272;
      n_148 = term.getSubterm(0);
      o_148 = term.getSubterm(1);
      IStrategoList annos223 = term.getAnnotations();
      p_148 = annos223;
      term = l_29.invoke(context, n_148);
      if(term == null)
        break Fail272;
      q_148 = term;
      term = m_29.invoke(context, o_148);
      if(term == null)
        break Fail272;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consannotated_2, new IStrategoTerm[]{q_148, term}), checkListAnnos(termFactory, p_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}