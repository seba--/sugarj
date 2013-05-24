package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class exports_1_0 extends Strategy 
{ 
  public static exports_1_0 instance = new exports_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("exports_1_0");
    Fail1050:
    { 
      IStrategoTerm e_469 = null;
      IStrategoTerm d_469 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consexports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1050;
      d_469 = term.getSubterm(0);
      IStrategoList annos277 = term.getAnnotations();
      e_469 = annos277;
      term = e_351.invoke(context, d_469);
      if(term == null)
        break Fail1050;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consexports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_469));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}