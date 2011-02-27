package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Int_1_0 extends Strategy 
{ 
  public static $Int_1_0 instance = new $Int_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Int_1_0");
    Fail159:
    { 
      IStrategoTerm r_128 = null;
      IStrategoTerm q_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consInt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail159;
      q_128 = term.getSubterm(0);
      IStrategoList annos132 = term.getAnnotations();
      r_128 = annos132;
      term = b_25.invoke(context, q_128);
      if(term == null)
        break Fail159;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consInt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}