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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticImportOnDemandDec_1_0");
    Fail61:
    { 
      IStrategoTerm r_111 = null;
      IStrategoTerm q_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStaticImportOnDemandDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail61;
      q_111 = term.getSubterm(0);
      IStrategoList annos42 = term.getAnnotations();
      r_111 = annos42;
      term = w_19.invoke(context, q_111);
      if(term == null)
        break Fail61;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consStaticImportOnDemandDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}