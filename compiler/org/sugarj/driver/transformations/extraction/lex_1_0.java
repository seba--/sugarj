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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lex_1_0");
    Fail1060:
    { 
      IStrategoTerm m_470 = null;
      IStrategoTerm l_470 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conslex_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1060;
      l_470 = term.getSubterm(0);
      IStrategoList annos287 = term.getAnnotations();
      m_470 = annos287;
      term = q_351.invoke(context, l_470);
      if(term == null)
        break Fail1060;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conslex_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_470));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}