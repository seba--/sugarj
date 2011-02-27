package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Match_1_0 extends Strategy 
{ 
  public static $Match_1_0 instance = new $Match_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Match_1_0");
    Fail119:
    { 
      IStrategoTerm f_122 = null;
      IStrategoTerm e_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consMatch_1 != ((IStrategoAppl)term).getConstructor())
        break Fail119;
      e_122 = term.getSubterm(0);
      IStrategoList annos95 = term.getAnnotations();
      f_122 = annos95;
      term = x_22.invoke(context, e_122);
      if(term == null)
        break Fail119;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consMatch_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}