package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lit_1_0 extends Strategy 
{ 
  public static lit_1_0 instance = new lit_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lit_1_0");
    Fail226:
    { 
      IStrategoTerm m_139 = null;
      IStrategoTerm l_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conslit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail226;
      l_139 = term.getSubterm(0);
      IStrategoList annos184 = term.getAnnotations();
      m_139 = annos184;
      term = m_27.invoke(context, l_139);
      if(term == null)
        break Fail226;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conslit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}