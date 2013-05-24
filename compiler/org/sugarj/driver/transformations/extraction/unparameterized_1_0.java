package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unparameterized_1_0 extends Strategy 
{ 
  public static unparameterized_1_0 instance = new unparameterized_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unparameterized_1_0");
    Fail1052:
    { 
      IStrategoTerm k_469 = null;
      IStrategoTerm j_469 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consunparameterized_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1052;
      j_469 = term.getSubterm(0);
      IStrategoList annos279 = term.getAnnotations();
      k_469 = annos279;
      term = g_351.invoke(context, j_469);
      if(term == null)
        break Fail1052;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consunparameterized_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_469));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}