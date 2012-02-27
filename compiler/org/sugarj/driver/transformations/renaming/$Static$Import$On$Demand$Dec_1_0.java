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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticImportOnDemandDec_1_0");
    Fail15:
    { 
      IStrategoTerm q_99 = null;
      IStrategoTerm p_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStaticImportOnDemandDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail15;
      p_99 = term.getSubterm(0);
      IStrategoList annos1 = term.getAnnotations();
      q_99 = annos1;
      term = t_14.invoke(context, p_99);
      if(term == null)
        break Fail15;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consStaticImportOnDemandDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}