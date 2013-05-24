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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_start_symbols_1_0");
    Fail1004:
    { 
      IStrategoTerm o_463 = null;
      IStrategoTerm n_463 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conslexical_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1004;
      n_463 = term.getSubterm(0);
      IStrategoList annos241 = term.getAnnotations();
      o_463 = annos241;
      term = b_349.invoke(context, n_463);
      if(term == null)
        break Fail1004;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conslexical_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_463));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}