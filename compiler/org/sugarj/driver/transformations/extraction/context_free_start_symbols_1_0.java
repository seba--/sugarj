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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_start_symbols_1_0");
    Fail247:
    { 
      IStrategoTerm i_146 = null;
      IStrategoTerm h_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conscontext_free_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail247;
      h_146 = term.getSubterm(0);
      IStrategoList annos203 = term.getAnnotations();
      i_146 = annos203;
      term = z_28.invoke(context, h_146);
      if(term == null)
        break Fail247;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conscontext_free_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}