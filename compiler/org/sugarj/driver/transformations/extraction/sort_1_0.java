package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class sort_1_0 extends Strategy 
{ 
  public static sort_1_0 instance = new sort_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sort_1_0");
    Fail228:
    { 
      IStrategoTerm m_140 = null;
      IStrategoTerm l_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conssort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail228;
      l_140 = term.getSubterm(0);
      IStrategoList annos186 = term.getAnnotations();
      m_140 = annos186;
      term = p_27.invoke(context, l_140);
      if(term == null)
        break Fail228;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conssort_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}