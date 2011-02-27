package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort_2_0 extends Strategy 
{ 
  public static $Sort_2_0 instance = new $Sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_23, Strategy z_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sort_2_0");
    Fail137:
    { 
      IStrategoTerm m_125 = null;
      IStrategoTerm k_125 = null;
      IStrategoTerm l_125 = null;
      IStrategoTerm n_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail137;
      k_125 = term.getSubterm(0);
      l_125 = term.getSubterm(1);
      IStrategoList annos111 = term.getAnnotations();
      m_125 = annos111;
      term = y_23.invoke(context, k_125);
      if(term == null)
        break Fail137;
      n_125 = term;
      term = z_23.invoke(context, l_125);
      if(term == null)
        break Fail137;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSort_2, new IStrategoTerm[]{n_125, term}), checkListAnnos(termFactory, m_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}