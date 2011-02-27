package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class context_free_syntax_1_0 extends Strategy 
{ 
  public static context_free_syntax_1_0 instance = new context_free_syntax_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_syntax_1_0");
    Fail255:
    { 
      IStrategoTerm x_147 = null;
      IStrategoTerm w_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conscontext_free_syntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail255;
      w_147 = term.getSubterm(0);
      IStrategoList annos211 = term.getAnnotations();
      x_147 = annos211;
      term = h_29.invoke(context, w_147);
      if(term == null)
        break Fail255;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conscontext_free_syntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}