package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class sort_1_0 extends Strategy 
{ 
  public static sort_1_0 instance = new sort_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sort_1_0");
    Fail229:
    { 
      IStrategoTerm x_140 = null;
      IStrategoTerm w_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conssort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail229;
      w_140 = term.getSubterm(0);
      IStrategoList annos187 = term.getAnnotations();
      x_140 = annos187;
      term = r_27.invoke(context, w_140);
      if(term == null)
        break Fail229;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conssort_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}