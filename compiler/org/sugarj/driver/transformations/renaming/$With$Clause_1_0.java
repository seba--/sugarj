package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WithClause_1_0");
    Fail27:
    { 
      IStrategoTerm o_93 = null;
      IStrategoTerm m_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWithClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      m_93 = term.getSubterm(0);
      IStrategoList annos18 = term.getAnnotations();
      o_93 = annos18;
      term = g_11.invoke(context, m_93);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWithClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}