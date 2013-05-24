package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class real_1_0 extends Strategy 
{ 
  public static real_1_0 instance = new real_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("real_1_0");
    Fail1070:
    { 
      IStrategoTerm q_471 = null;
      IStrategoTerm p_471 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consreal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1070;
      p_471 = term.getSubterm(0);
      IStrategoList annos295 = term.getAnnotations();
      q_471 = annos295;
      term = b_352.invoke(context, p_471);
      if(term == null)
        break Fail1070;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consreal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_471));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}