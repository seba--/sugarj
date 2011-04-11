package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class iter_star_1_0 extends Strategy 
{ 
  public static iter_star_1_0 instance = new iter_star_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_star_1_0");
    Fail224:
    { 
      IStrategoTerm w_142 = null;
      IStrategoTerm v_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consiter_star_1 != ((IStrategoAppl)term).getConstructor())
        break Fail224;
      v_142 = term.getSubterm(0);
      IStrategoList annos185 = term.getAnnotations();
      w_142 = annos185;
      term = c_28.invoke(context, v_142);
      if(term == null)
        break Fail224;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consiter_star_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}