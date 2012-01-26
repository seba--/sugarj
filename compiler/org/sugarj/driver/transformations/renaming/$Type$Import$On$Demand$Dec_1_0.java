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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeImportOnDemandDec_1_0");
    Fail12:
    { 
      IStrategoTerm a_99 = null;
      IStrategoTerm z_98 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeImportOnDemandDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail12;
      z_98 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      a_99 = annos3;
      term = z_13.invoke(context, z_98);
      if(term == null)
        break Fail12;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeImportOnDemandDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}