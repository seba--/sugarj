package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Where$Clause_1_0 extends Strategy 
{ 
  public static $Where$Clause_1_0 instance = new $Where$Clause_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_342)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WhereClause_1_0");
    Fail888:
    { 
      IStrategoTerm h_446 = null;
      IStrategoTerm g_446 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consWhereClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail888;
      g_446 = term.getSubterm(0);
      IStrategoList annos134 = term.getAnnotations();
      h_446 = annos134;
      term = m_342.invoke(context, g_446);
      if(term == null)
        break Fail888;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consWhereClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_446));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}