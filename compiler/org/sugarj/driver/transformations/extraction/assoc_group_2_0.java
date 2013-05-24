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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_350, Strategy d_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_group_2_0");
    Fail1034:
    { 
      IStrategoTerm l_466 = null;
      IStrategoTerm j_466 = null;
      IStrategoTerm k_466 = null;
      IStrategoTerm m_466 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consassoc_group_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1034;
      j_466 = term.getSubterm(0);
      k_466 = term.getSubterm(1);
      IStrategoList annos261 = term.getAnnotations();
      l_466 = annos261;
      term = c_350.invoke(context, j_466);
      if(term == null)
        break Fail1034;
      m_466 = term;
      term = d_350.invoke(context, k_466);
      if(term == null)
        break Fail1034;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consassoc_group_2, new IStrategoTerm[]{m_466, term}), checkListAnnos(termFactory, l_466));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}