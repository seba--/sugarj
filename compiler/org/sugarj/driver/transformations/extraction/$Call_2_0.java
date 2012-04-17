package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call_2_0 extends Strategy 
{ 
  public static $Call_2_0 instance = new $Call_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_22, Strategy i_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Call_2_0");
    Fail111:
    { 
      IStrategoTerm l_120 = null;
      IStrategoTerm j_120 = null;
      IStrategoTerm k_120 = null;
      IStrategoTerm m_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail111;
      j_120 = term.getSubterm(0);
      k_120 = term.getSubterm(1);
      IStrategoList annos86 = term.getAnnotations();
      l_120 = annos86;
      term = h_22.invoke(context, j_120);
      if(term == null)
        break Fail111;
      m_120 = term;
      term = i_22.invoke(context, k_120);
      if(term == null)
        break Fail111;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consCall_2, new IStrategoTerm[]{m_120, term}), checkListAnnos(termFactory, l_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}