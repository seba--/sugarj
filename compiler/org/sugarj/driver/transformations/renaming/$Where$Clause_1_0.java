package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WhereClause_1_0");
    Fail29:
    { 
      IStrategoTerm k_93 = null;
      IStrategoTerm j_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWhereClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      j_93 = term.getSubterm(0);
      IStrategoList annos19 = term.getAnnotations();
      k_93 = annos19;
      term = b_11.invoke(context, j_93);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWhereClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}