package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $With$Clause_1_0 extends Strategy 
{ 
  public static $With$Clause_1_0 instance = new $With$Clause_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WithClause_1_0");
    Fail41:
    { 
      IStrategoTerm v_106 = null;
      IStrategoTerm u_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consWithClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      u_106 = term.getSubterm(0);
      IStrategoList annos18 = term.getAnnotations();
      v_106 = annos18;
      term = m_17.invoke(context, u_106);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consWithClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}