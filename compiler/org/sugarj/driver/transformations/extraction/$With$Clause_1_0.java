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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_342)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WithClause_1_0");
    Fail889:
    { 
      IStrategoTerm k_446 = null;
      IStrategoTerm j_446 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consWithClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail889;
      j_446 = term.getSubterm(0);
      IStrategoList annos135 = term.getAnnotations();
      k_446 = annos135;
      term = n_342.invoke(context, j_446);
      if(term == null)
        break Fail889;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consWithClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_446));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}