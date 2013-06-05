package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aliases_1_0 extends Strategy 
{ 
  public static aliases_1_0 instance = new aliases_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aliases_1_0");
    Fail257:
    { 
      IStrategoTerm f_146 = null;
      IStrategoTerm e_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consaliases_1 != ((IStrategoAppl)term).getConstructor())
        break Fail257;
      e_146 = term.getSubterm(0);
      IStrategoList annos209 = term.getAnnotations();
      f_146 = annos209;
      term = w_28.invoke(context, e_146);
      if(term == null)
        break Fail257;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consaliases_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}