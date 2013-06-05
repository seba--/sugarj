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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_start_symbols_1_0");
    Fail259:
    { 
      IStrategoTerm m_146 = null;
      IStrategoTerm k_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conscontext_free_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail259;
      k_146 = term.getSubterm(0);
      IStrategoList annos211 = term.getAnnotations();
      m_146 = annos211;
      term = y_28.invoke(context, k_146);
      if(term == null)
        break Fail259;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conscontext_free_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}