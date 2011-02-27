package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Java$Type$Dec_1_0 extends Strategy 
{ 
  public static $Java$Type$Dec_1_0 instance = new $Java$Type$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("JavaTypeDec_1_0");
    Fail276:
    { 
      IStrategoTerm x_150 = null;
      IStrategoTerm w_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consJavaTypeDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail276;
      w_150 = term.getSubterm(0);
      IStrategoList annos231 = term.getAnnotations();
      x_150 = annos231;
      term = k_30.invoke(context, w_150);
      if(term == null)
        break Fail276;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consJavaTypeDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}