package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Rule_1_0 extends Strategy 
{ 
  public static $S$Rule_1_0 instance = new $S$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SRule_1_0");
    Fail308:
    { 
      IStrategoTerm m_187 = null;
      IStrategoTerm l_187 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail308;
      l_187 = term.getSubterm(0);
      IStrategoList annos255 = term.getAnnotations();
      m_187 = annos255;
      term = e_45.invoke(context, l_187);
      if(term == null)
        break Fail308;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_187));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}