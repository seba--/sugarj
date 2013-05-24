package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class placeholder_1_0 extends Strategy 
{ 
  public static placeholder_1_0 instance = new placeholder_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("placeholder_1_0");
    Fail1073:
    { 
      IStrategoTerm b_472 = null;
      IStrategoTerm a_472 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consplaceholder_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1073;
      a_472 = term.getSubterm(0);
      IStrategoList annos298 = term.getAnnotations();
      b_472 = annos298;
      term = f_352.invoke(context, a_472);
      if(term == null)
        break Fail1073;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consplaceholder_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_472));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}