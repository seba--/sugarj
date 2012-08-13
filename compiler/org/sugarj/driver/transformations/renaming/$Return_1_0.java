package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Return_1_0 extends Strategy 
{ 
  public static $Return_1_0 instance = new $Return_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Return_1_0");
    Fail127:
    { 
      IStrategoTerm o_126 = null;
      IStrategoTerm n_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consReturn_1 != ((IStrategoAppl)term).getConstructor())
        break Fail127;
      n_126 = term.getSubterm(0);
      IStrategoList annos105 = term.getAnnotations();
      o_126 = annos105;
      term = j_25.invoke(context, n_126);
      if(term == null)
        break Fail127;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consReturn_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}