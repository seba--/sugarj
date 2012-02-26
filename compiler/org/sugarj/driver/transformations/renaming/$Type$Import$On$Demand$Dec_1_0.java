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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeImportOnDemandDec_1_0");
    Fail15:
    { 
      IStrategoTerm q_99 = null;
      IStrategoTerm p_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeImportOnDemandDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail15;
      p_99 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      q_99 = annos3;
      term = o_14.invoke(context, p_99);
      if(term == null)
        break Fail15;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeImportOnDemandDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}