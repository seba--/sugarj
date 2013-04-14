package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class non_transitive_1_0 extends Strategy 
{ 
  public static non_transitive_1_0 instance = new non_transitive_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("non_transitive_1_0");
    Fail193:
    { 
      IStrategoTerm n_136 = null;
      IStrategoTerm m_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consnon_transitive_1 != ((IStrategoAppl)term).getConstructor())
        break Fail193;
      m_136 = term.getSubterm(0);
      IStrategoList annos160 = term.getAnnotations();
      n_136 = annos160;
      term = p_26.invoke(context, m_136);
      if(term == null)
        break Fail193;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consnon_transitive_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}