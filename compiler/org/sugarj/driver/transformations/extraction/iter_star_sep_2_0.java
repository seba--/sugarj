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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_350, Strategy p_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_star_sep_2_0");
    Fail1042:
    { 
      IStrategoTerm r_467 = null;
      IStrategoTerm p_467 = null;
      IStrategoTerm q_467 = null;
      IStrategoTerm s_467 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consiter_star_sep_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1042;
      p_467 = term.getSubterm(0);
      q_467 = term.getSubterm(1);
      IStrategoList annos269 = term.getAnnotations();
      r_467 = annos269;
      term = o_350.invoke(context, p_467);
      if(term == null)
        break Fail1042;
      s_467 = term;
      term = p_350.invoke(context, q_467);
      if(term == null)
        break Fail1042;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consiter_star_sep_2, new IStrategoTerm[]{s_467, term}), checkListAnnos(termFactory, r_467));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}