package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lex_1_0 extends Strategy 
{ 
  public static lex_1_0 instance = new lex_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lex_1_0");
    Fail229:
    { 
      IStrategoTerm k_143 = null;
      IStrategoTerm j_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conslex_1 != ((IStrategoAppl)term).getConstructor())
        break Fail229;
      j_143 = term.getSubterm(0);
      IStrategoList annos189 = term.getAnnotations();
      k_143 = annos189;
      term = g_28.invoke(context, j_143);
      if(term == null)
        break Fail229;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conslex_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}