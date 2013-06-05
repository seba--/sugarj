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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_start_symbols_1_0");
    Fail260:
    { 
      IStrategoTerm r_146 = null;
      IStrategoTerm q_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conslexical_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail260;
      q_146 = term.getSubterm(0);
      IStrategoList annos212 = term.getAnnotations();
      r_146 = annos212;
      term = z_28.invoke(context, q_146);
      if(term == null)
        break Fail260;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conslexical_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}