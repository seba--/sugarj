package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Implements$Dec_1_0 extends Strategy 
{ 
  public static $Implements$Dec_1_0 instance = new $Implements$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImplementsDec_1_0");
    Fail81:
    { 
      IStrategoTerm l_115 = null;
      IStrategoTerm k_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consImplementsDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail81;
      k_115 = term.getSubterm(0);
      IStrategoList annos62 = term.getAnnotations();
      l_115 = annos62;
      term = f_21.invoke(context, k_115);
      if(term == null)
        break Fail81;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consImplementsDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}