package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Match_1_0");
    Fail102:
    { 
      IStrategoTerm m_108 = null;
      IStrategoTerm l_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMatch_1 != ((IStrategoAppl)term).getConstructor())
        break Fail102;
      l_108 = term.getSubterm(0);
      IStrategoList annos95 = term.getAnnotations();
      m_108 = annos95;
      term = m_16.invoke(context, l_108);
      if(term == null)
        break Fail102;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMatch_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}