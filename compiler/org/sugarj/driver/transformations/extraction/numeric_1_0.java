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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("numeric_1_0");
    Fail198:
    { 
      IStrategoTerm s_134 = null;
      IStrategoTerm r_134 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consnumeric_1 != ((IStrategoAppl)term).getConstructor())
        break Fail198;
      r_134 = term.getSubterm(0);
      IStrategoList annos162 = term.getAnnotations();
      s_134 = annos162;
      term = f_26.invoke(context, r_134);
      if(term == null)
        break Fail198;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consnumeric_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_134));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}