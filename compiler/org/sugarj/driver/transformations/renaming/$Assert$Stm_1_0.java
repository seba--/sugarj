package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assert$Stm_1_0 extends Strategy 
{ 
  public static $Assert$Stm_1_0 instance = new $Assert$Stm_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssertStm_1_0");
    Fail136:
    { 
      IStrategoTerm k_128 = null;
      IStrategoTerm j_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssertStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      j_128 = term.getSubterm(0);
      IStrategoList annos114 = term.getAnnotations();
      k_128 = annos114;
      term = b_26.invoke(context, j_128);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssertStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}