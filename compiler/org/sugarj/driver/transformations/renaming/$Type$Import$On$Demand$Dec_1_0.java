package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Import$On$Demand$Dec_1_0 extends Strategy 
{ 
  public static $Type$Import$On$Demand$Dec_1_0 instance = new $Type$Import$On$Demand$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeImportOnDemandDec_1_0");
    Fail17:
    { 
      IStrategoTerm y_99 = null;
      IStrategoTerm x_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeImportOnDemandDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail17;
      x_99 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      y_99 = annos3;
      term = w_14.invoke(context, x_99);
      if(term == null)
        break Fail17;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeImportOnDemandDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}