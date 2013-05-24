package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Outliner_2_0 extends Strategy 
{ 
  public static $Outliner_2_0 instance = new $Outliner_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_337, Strategy j_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Outliner_2_0");
    Fail810:
    { 
      IStrategoTerm l_433 = null;
      IStrategoTerm j_433 = null;
      IStrategoTerm k_433 = null;
      IStrategoTerm m_433 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOutliner_2 != ((IStrategoAppl)term).getConstructor())
        break Fail810;
      j_433 = term.getSubterm(0);
      k_433 = term.getSubterm(1);
      IStrategoList annos59 = term.getAnnotations();
      l_433 = annos59;
      term = i_337.invoke(context, j_433);
      if(term == null)
        break Fail810;
      m_433 = term;
      term = j_337.invoke(context, k_433);
      if(term == null)
        break Fail810;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOutliner_2, new IStrategoTerm[]{m_433, term}), checkListAnnos(termFactory, l_433));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}