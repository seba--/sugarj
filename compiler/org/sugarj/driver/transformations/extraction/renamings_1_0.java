package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class renamings_1_0 extends Strategy 
{ 
  public static renamings_1_0 instance = new renamings_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("renamings_1_0");
    Fail209:
    { 
      IStrategoTerm y_138 = null;
      IStrategoTerm x_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consrenamings_1 != ((IStrategoAppl)term).getConstructor())
        break Fail209;
      x_138 = term.getSubterm(0);
      IStrategoList annos173 = term.getAnnotations();
      y_138 = annos173;
      term = j_27.invoke(context, x_138);
      if(term == null)
        break Fail209;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consrenamings_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}