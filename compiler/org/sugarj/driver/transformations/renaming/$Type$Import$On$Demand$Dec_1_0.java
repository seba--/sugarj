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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeImportOnDemandDec_1_0");
    Fail63:
    { 
      IStrategoTerm z_111 = null;
      IStrategoTerm y_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeImportOnDemandDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      y_111 = term.getSubterm(0);
      IStrategoList annos44 = term.getAnnotations();
      z_111 = annos44;
      term = z_19.invoke(context, y_111);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeImportOnDemandDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}