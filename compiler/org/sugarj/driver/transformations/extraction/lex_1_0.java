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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lex_1_0");
    Fail240:
    { 
      IStrategoTerm o_143 = null;
      IStrategoTerm m_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conslex_1 != ((IStrategoAppl)term).getConstructor())
        break Fail240;
      m_143 = term.getSubterm(0);
      IStrategoList annos197 = term.getAnnotations();
      o_143 = annos197;
      term = f_28.invoke(context, m_143);
      if(term == null)
        break Fail240;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conslex_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}