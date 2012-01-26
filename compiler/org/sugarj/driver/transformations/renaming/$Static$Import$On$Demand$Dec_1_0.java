package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Static$Import$On$Demand$Dec_1_0 extends Strategy 
{ 
  public static $Static$Import$On$Demand$Dec_1_0 instance = new $Static$Import$On$Demand$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticImportOnDemandDec_1_0");
    Fail10:
    { 
      IStrategoTerm q_98 = null;
      IStrategoTerm o_98 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStaticImportOnDemandDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail10;
      o_98 = term.getSubterm(0);
      IStrategoList annos1 = term.getAnnotations();
      q_98 = annos1;
      term = w_13.invoke(context, o_98);
      if(term == null)
        break Fail10;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consStaticImportOnDemandDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_98));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}