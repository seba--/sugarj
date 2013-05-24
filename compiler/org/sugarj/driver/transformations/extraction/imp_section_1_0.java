package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class imp_section_1_0 extends Strategy 
{ 
  public static imp_section_1_0 instance = new imp_section_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("imp_section_1_0");
    Fail1056:
    { 
      IStrategoTerm y_469 = null;
      IStrategoTerm x_469 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consimp_section_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1056;
      x_469 = term.getSubterm(0);
      IStrategoList annos283 = term.getAnnotations();
      y_469 = annos283;
      term = l_351.invoke(context, x_469);
      if(term == null)
        break Fail1056;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consimp_section_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_469));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}