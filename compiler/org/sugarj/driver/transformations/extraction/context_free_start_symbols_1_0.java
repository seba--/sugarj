package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class context_free_start_symbols_1_0 extends Strategy 
{ 
  public static context_free_start_symbols_1_0 instance = new context_free_start_symbols_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_start_symbols_1_0");
    Fail1005:
    { 
      IStrategoTerm r_463 = null;
      IStrategoTerm q_463 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conscontext_free_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1005;
      q_463 = term.getSubterm(0);
      IStrategoList annos242 = term.getAnnotations();
      r_463 = annos242;
      term = c_349.invoke(context, q_463);
      if(term == null)
        break Fail1005;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conscontext_free_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_463));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}