package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class short_1_0 extends Strategy 
{ 
  public static short_1_0 instance = new short_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("short_1_0");
    Fail185:
    { 
      IStrategoTerm s_133 = null;
      IStrategoTerm p_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consshort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail185;
      p_133 = term.getSubterm(0);
      IStrategoList annos153 = term.getAnnotations();
      s_133 = annos153;
      term = f_26.invoke(context, p_133);
      if(term == null)
        break Fail185;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consshort_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}