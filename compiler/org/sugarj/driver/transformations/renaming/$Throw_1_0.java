package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Throw_1_0 extends Strategy 
{ 
  public static $Throw_1_0 instance = new $Throw_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Throw_1_0");
    Fail126:
    { 
      IStrategoTerm l_126 = null;
      IStrategoTerm k_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consThrow_1 != ((IStrategoAppl)term).getConstructor())
        break Fail126;
      k_126 = term.getSubterm(0);
      IStrategoList annos104 = term.getAnnotations();
      l_126 = annos104;
      term = i_25.invoke(context, k_126);
      if(term == null)
        break Fail126;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consThrow_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}