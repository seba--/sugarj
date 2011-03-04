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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WhereClause_1_0");
    Fail43:
    { 
      IStrategoTerm z_106 = null;
      IStrategoTerm y_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consWhereClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      y_106 = term.getSubterm(0);
      IStrategoList annos19 = term.getAnnotations();
      z_106 = annos19;
      term = n_17.invoke(context, y_106);
      if(term == null)
        break Fail43;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consWhereClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}