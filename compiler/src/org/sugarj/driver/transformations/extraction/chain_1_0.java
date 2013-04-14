package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class chain_1_0 extends Strategy 
{ 
  public static chain_1_0 instance = new chain_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_1_0");
    Fail189:
    { 
      IStrategoTerm m_135 = null;
      IStrategoTerm k_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conschain_1 != ((IStrategoAppl)term).getConstructor())
        break Fail189;
      k_135 = term.getSubterm(0);
      IStrategoList annos156 = term.getAnnotations();
      m_135 = annos156;
      term = k_26.invoke(context, k_135);
      if(term == null)
        break Fail189;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conschain_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}