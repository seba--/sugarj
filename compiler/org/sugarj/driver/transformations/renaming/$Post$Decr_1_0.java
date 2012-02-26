package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Post$Decr_1_0 extends Strategy 
{ 
  public static $Post$Decr_1_0 instance = new $Post$Decr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PostDecr_1_0");
    Fail144:
    { 
      IStrategoTerm j_126 = null;
      IStrategoTerm i_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail144;
      i_126 = term.getSubterm(0);
      IStrategoList annos126 = term.getAnnotations();
      j_126 = annos126;
      term = j_24.invoke(context, i_126);
      if(term == null)
        break Fail144;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPostDecr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}