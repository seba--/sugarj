package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WhereClause_1_0");
    Fail25:
    { 
      IStrategoTerm l_93 = null;
      IStrategoTerm k_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWhereClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      k_93 = term.getSubterm(0);
      IStrategoList annos19 = term.getAnnotations();
      l_93 = annos19;
      term = c_11.invoke(context, k_93);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWhereClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}