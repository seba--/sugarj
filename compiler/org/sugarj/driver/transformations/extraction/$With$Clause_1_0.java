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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WithClause_1_0");
    Fail53:
    { 
      IStrategoTerm z_106 = null;
      IStrategoTerm y_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consWithClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      y_106 = term.getSubterm(0);
      IStrategoList annos26 = term.getAnnotations();
      z_106 = annos26;
      term = l_17.invoke(context, y_106);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consWithClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}