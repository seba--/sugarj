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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_start_symbols_1_0");
    Fail260:
    { 
      IStrategoTerm t_146 = null;
      IStrategoTerm s_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conscontext_free_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail260;
      s_146 = term.getSubterm(0);
      IStrategoList annos212 = term.getAnnotations();
      t_146 = annos212;
      term = a_29.invoke(context, s_146);
      if(term == null)
        break Fail260;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conscontext_free_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}