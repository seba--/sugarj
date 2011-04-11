package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class restrictions_1_0 extends Strategy 
{ 
  public static restrictions_1_0 instance = new restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("restrictions_1_0");
    Fail247:
    { 
      IStrategoTerm f_146 = null;
      IStrategoTerm e_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consrestrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail247;
      e_146 = term.getSubterm(0);
      IStrategoList annos202 = term.getAnnotations();
      f_146 = annos202;
      term = y_28.invoke(context, e_146);
      if(term == null)
        break Fail247;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consrestrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}