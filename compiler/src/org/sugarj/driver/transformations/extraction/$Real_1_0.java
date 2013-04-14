package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Real_1_0 extends Strategy 
{ 
  public static $Real_1_0 instance = new $Real_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Real_1_0");
    Fail159:
    { 
      IStrategoTerm m_128 = null;
      IStrategoTerm l_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consReal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail159;
      l_128 = term.getSubterm(0);
      IStrategoList annos131 = term.getAnnotations();
      m_128 = annos131;
      term = a_25.invoke(context, l_128);
      if(term == null)
        break Fail159;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consReal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}