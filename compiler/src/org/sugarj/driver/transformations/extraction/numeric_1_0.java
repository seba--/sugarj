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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("numeric_1_0");
    Fail199:
    { 
      IStrategoTerm f_135 = null;
      IStrategoTerm d_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consnumeric_1 != ((IStrategoAppl)term).getConstructor())
        break Fail199;
      d_135 = term.getSubterm(0);
      IStrategoList annos163 = term.getAnnotations();
      f_135 = annos163;
      term = h_26.invoke(context, d_135);
      if(term == null)
        break Fail199;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consnumeric_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}