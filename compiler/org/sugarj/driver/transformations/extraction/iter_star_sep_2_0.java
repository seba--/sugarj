package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class iter_star_sep_2_0 extends Strategy 
{ 
  public static iter_star_sep_2_0 instance = new iter_star_sep_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_27, Strategy z_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_star_sep_2_0");
    Fail221:
    { 
      IStrategoTerm n_142 = null;
      IStrategoTerm l_142 = null;
      IStrategoTerm m_142 = null;
      IStrategoTerm o_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consiter_star_sep_2 != ((IStrategoAppl)term).getConstructor())
        break Fail221;
      l_142 = term.getSubterm(0);
      m_142 = term.getSubterm(1);
      IStrategoList annos183 = term.getAnnotations();
      n_142 = annos183;
      term = y_27.invoke(context, l_142);
      if(term == null)
        break Fail221;
      o_142 = term;
      term = z_27.invoke(context, m_142);
      if(term == null)
        break Fail221;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consiter_star_sep_2, new IStrategoTerm[]{o_142, term}), checkListAnnos(termFactory, n_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}