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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("short_1_0");
    Fail1009:
    { 
      IStrategoTerm f_464 = null;
      IStrategoTerm e_464 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consshort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1009;
      e_464 = term.getSubterm(0);
      IStrategoList annos246 = term.getAnnotations();
      f_464 = annos246;
      term = h_349.invoke(context, e_464);
      if(term == null)
        break Fail1009;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consshort_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_464));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}