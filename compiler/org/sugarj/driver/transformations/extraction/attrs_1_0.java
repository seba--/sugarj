package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class attrs_1_0 extends Strategy 
{ 
  public static attrs_1_0 instance = new attrs_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("attrs_1_0");
    Fail1076:
    { 
      IStrategoTerm m_472 = null;
      IStrategoTerm l_472 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consattrs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1076;
      l_472 = term.getSubterm(0);
      IStrategoList annos301 = term.getAnnotations();
      m_472 = annos301;
      term = j_352.invoke(context, l_472);
      if(term == null)
        break Fail1076;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consattrs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_472));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}