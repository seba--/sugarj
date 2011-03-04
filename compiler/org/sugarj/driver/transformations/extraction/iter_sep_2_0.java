package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class iter_sep_2_0 extends Strategy 
{ 
  public static iter_sep_2_0 instance = new iter_sep_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_28, Strategy b_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_sep_2_0");
    Fail223:
    { 
      IStrategoTerm s_142 = null;
      IStrategoTerm q_142 = null;
      IStrategoTerm r_142 = null;
      IStrategoTerm t_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consiter_sep_2 != ((IStrategoAppl)term).getConstructor())
        break Fail223;
      q_142 = term.getSubterm(0);
      r_142 = term.getSubterm(1);
      IStrategoList annos184 = term.getAnnotations();
      s_142 = annos184;
      term = a_28.invoke(context, q_142);
      if(term == null)
        break Fail223;
      t_142 = term;
      term = b_28.invoke(context, r_142);
      if(term == null)
        break Fail223;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consiter_sep_2, new IStrategoTerm[]{t_142, term}), checkListAnnos(termFactory, s_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}