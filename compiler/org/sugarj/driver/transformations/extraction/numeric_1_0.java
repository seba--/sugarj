package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class numeric_1_0 extends Strategy 
{ 
  public static numeric_1_0 instance = new numeric_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("numeric_1_0");
    Fail1008:
    { 
      IStrategoTerm c_464 = null;
      IStrategoTerm b_464 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consnumeric_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1008;
      b_464 = term.getSubterm(0);
      IStrategoList annos245 = term.getAnnotations();
      c_464 = annos245;
      term = g_349.invoke(context, b_464);
      if(term == null)
        break Fail1008;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consnumeric_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_464));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}