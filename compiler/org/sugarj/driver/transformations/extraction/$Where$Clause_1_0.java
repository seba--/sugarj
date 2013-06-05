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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WhereClause_1_0");
    Fail54:
    { 
      IStrategoTerm c_107 = null;
      IStrategoTerm b_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consWhereClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      b_107 = term.getSubterm(0);
      IStrategoList annos27 = term.getAnnotations();
      c_107 = annos27;
      term = m_17.invoke(context, b_107);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consWhereClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}