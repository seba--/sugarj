package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class imports_1_0 extends Strategy 
{ 
  public static imports_1_0 instance = new imports_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("imports_1_0");
    Fail201:
    { 
      IStrategoTerm k_137 = null;
      IStrategoTerm j_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consimports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail201;
      j_137 = term.getSubterm(0);
      IStrategoList annos165 = term.getAnnotations();
      k_137 = annos165;
      term = w_26.invoke(context, j_137);
      if(term == null)
        break Fail201;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consimports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}