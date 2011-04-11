package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class ci_lit_1_0 extends Strategy 
{ 
  public static ci_lit_1_0 instance = new ci_lit_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ci_lit_1_0");
    Fail214:
    { 
      IStrategoTerm g_139 = null;
      IStrategoTerm f_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consci_lit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail214;
      f_139 = term.getSubterm(0);
      IStrategoList annos175 = term.getAnnotations();
      g_139 = annos175;
      term = m_27.invoke(context, f_139);
      if(term == null)
        break Fail214;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consci_lit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}