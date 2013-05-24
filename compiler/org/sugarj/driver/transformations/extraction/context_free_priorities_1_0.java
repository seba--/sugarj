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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_priorities_1_0");
    Fail746:
    { 
      IStrategoTerm x_425 = null;
      IStrategoTerm w_425 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conscontext_free_priorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail746;
      w_425 = term.getSubterm(0);
      IStrategoList annos18 = term.getAnnotations();
      x_425 = annos18;
      term = j_334.invoke(context, w_425);
      if(term == null)
        break Fail746;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conscontext_free_priorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_425));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}