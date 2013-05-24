package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class conc_2_0 extends Strategy 
{ 
  public static conc_2_0 instance = new conc_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_349, Strategy l_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("conc_2_0");
    Fail1015:
    { 
      IStrategoTerm o_464 = null;
      IStrategoTerm m_464 = null;
      IStrategoTerm n_464 = null;
      IStrategoTerm p_464 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consconc_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1015;
      m_464 = term.getSubterm(0);
      n_464 = term.getSubterm(1);
      IStrategoList annos248 = term.getAnnotations();
      o_464 = annos248;
      term = k_349.invoke(context, m_464);
      if(term == null)
        break Fail1015;
      p_464 = term;
      term = l_349.invoke(context, n_464);
      if(term == null)
        break Fail1015;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consconc_2, new IStrategoTerm[]{p_464, term}), checkListAnnos(termFactory, o_464));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}