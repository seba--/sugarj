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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_star_1_0");
    Fail235:
    { 
      IStrategoTerm z_142 = null;
      IStrategoTerm y_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consiter_star_1 != ((IStrategoAppl)term).getConstructor())
        break Fail235;
      y_142 = term.getSubterm(0);
      IStrategoList annos193 = term.getAnnotations();
      z_142 = annos193;
      term = b_28.invoke(context, y_142);
      if(term == null)
        break Fail235;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consiter_star_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}