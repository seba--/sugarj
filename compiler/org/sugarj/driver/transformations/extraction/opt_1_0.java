package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class opt_1_0 extends Strategy 
{ 
  public static opt_1_0 instance = new opt_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("opt_1_0");
    Fail1038:
    { 
      IStrategoTerm c_467 = null;
      IStrategoTerm b_467 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consopt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1038;
      b_467 = term.getSubterm(0);
      IStrategoList annos265 = term.getAnnotations();
      c_467 = annos265;
      term = j_350.invoke(context, b_467);
      if(term == null)
        break Fail1038;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consopt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_467));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}