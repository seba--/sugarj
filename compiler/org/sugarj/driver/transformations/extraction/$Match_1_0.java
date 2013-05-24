package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Match_1_0 extends Strategy 
{ 
  public static $Match_1_0 instance = new $Match_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Match_1_0");
    Fail975:
    { 
      IStrategoTerm m_459 = null;
      IStrategoTerm l_459 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consMatch_1 != ((IStrategoAppl)term).getConstructor())
        break Fail975;
      l_459 = term.getSubterm(0);
      IStrategoList annos215 = term.getAnnotations();
      m_459 = annos215;
      term = n_347.invoke(context, l_459);
      if(term == null)
        break Fail975;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consMatch_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_459));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}