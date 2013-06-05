package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class context_free_priorities_1_0 extends Strategy 
{ 
  public static context_free_priorities_1_0 instance = new context_free_priorities_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_priorities_1_0");
    Fail255:
    { 
      IStrategoTerm y_145 = null;
      IStrategoTerm w_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conscontext_free_priorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail255;
      w_145 = term.getSubterm(0);
      IStrategoList annos207 = term.getAnnotations();
      y_145 = annos207;
      term = u_28.invoke(context, w_145);
      if(term == null)
        break Fail255;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conscontext_free_priorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}