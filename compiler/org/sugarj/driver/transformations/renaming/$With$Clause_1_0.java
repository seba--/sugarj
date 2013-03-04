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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WithClause_1_0");
    Fail265:
    { 
      IStrategoTerm c_178 = null;
      IStrategoTerm b_178 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWithClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail265;
      b_178 = term.getSubterm(0);
      IStrategoList annos212 = term.getAnnotations();
      c_178 = annos212;
      term = t_41.invoke(context, b_178);
      if(term == null)
        break Fail265;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWithClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_178));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}