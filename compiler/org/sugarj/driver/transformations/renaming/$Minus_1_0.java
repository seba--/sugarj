package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Minus_1_0 extends Strategy 
{ 
  public static $Minus_1_0 instance = new $Minus_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Minus_1_0");
    Fail144:
    { 
      IStrategoTerm l_126 = null;
      IStrategoTerm k_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMinus_1 != ((IStrategoAppl)term).getConstructor())
        break Fail144;
      k_126 = term.getSubterm(0);
      IStrategoList annos124 = term.getAnnotations();
      l_126 = annos124;
      term = p_24.invoke(context, k_126);
      if(term == null)
        break Fail144;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMinus_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}