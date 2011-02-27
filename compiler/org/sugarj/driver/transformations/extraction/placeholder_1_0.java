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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("placeholder_1_0");
    Fail261:
    { 
      IStrategoTerm q_148 = null;
      IStrategoTerm p_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consplaceholder_1 != ((IStrategoAppl)term).getConstructor())
        break Fail261;
      p_148 = term.getSubterm(0);
      IStrategoList annos216 = term.getAnnotations();
      q_148 = annos216;
      term = o_29.invoke(context, p_148);
      if(term == null)
        break Fail261;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consplaceholder_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}