package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Deci_1_0 extends Strategy 
{ 
  public static $Deci_1_0 instance = new $Deci_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Deci_1_0");
    Fail192:
    { 
      IStrategoTerm r_134 = null;
      IStrategoTerm q_134 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDeci_1 != ((IStrategoAppl)term).getConstructor())
        break Fail192;
      q_134 = term.getSubterm(0);
      IStrategoList annos165 = term.getAnnotations();
      r_134 = annos165;
      term = b_26.invoke(context, q_134);
      if(term == null)
        break Fail192;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDeci_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_134));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}