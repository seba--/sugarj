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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WhereClause_1_0");
    Fail55:
    { 
      IStrategoTerm j_107 = null;
      IStrategoTerm h_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consWhereClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      h_107 = term.getSubterm(0);
      IStrategoList annos28 = term.getAnnotations();
      j_107 = annos28;
      term = o_17.invoke(context, h_107);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consWhereClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}