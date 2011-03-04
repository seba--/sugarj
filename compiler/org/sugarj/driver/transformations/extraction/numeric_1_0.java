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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("numeric_1_0");
    Fail187:
    { 
      IStrategoTerm p_134 = null;
      IStrategoTerm o_134 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consnumeric_1 != ((IStrategoAppl)term).getConstructor())
        break Fail187;
      o_134 = term.getSubterm(0);
      IStrategoList annos154 = term.getAnnotations();
      p_134 = annos154;
      term = g_26.invoke(context, o_134);
      if(term == null)
        break Fail187;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consnumeric_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_134));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}