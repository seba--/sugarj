package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_start_symbols_1_0 extends Strategy 
{ 
  public static lexical_start_symbols_1_0 instance = new lexical_start_symbols_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_start_symbols_1_0");
    Fail248:
    { 
      IStrategoTerm o_146 = null;
      IStrategoTerm n_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conslexical_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail248;
      n_146 = term.getSubterm(0);
      IStrategoList annos204 = term.getAnnotations();
      o_146 = annos204;
      term = a_29.invoke(context, n_146);
      if(term == null)
        break Fail248;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conslexical_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}