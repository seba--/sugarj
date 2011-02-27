package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class range_2_0 extends Strategy 
{ 
  public static range_2_0 instance = new range_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_26, Strategy e_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("range_2_0");
    Fail180:
    { 
      IStrategoTerm l_133 = null;
      IStrategoTerm j_133 = null;
      IStrategoTerm k_133 = null;
      IStrategoTerm m_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consrange_2 != ((IStrategoAppl)term).getConstructor())
        break Fail180;
      j_133 = term.getSubterm(0);
      k_133 = term.getSubterm(1);
      IStrategoList annos152 = term.getAnnotations();
      l_133 = annos152;
      term = d_26.invoke(context, j_133);
      if(term == null)
        break Fail180;
      m_133 = term;
      term = e_26.invoke(context, k_133);
      if(term == null)
        break Fail180;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consrange_2, new IStrategoTerm[]{m_133, term}), checkListAnnos(termFactory, l_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}