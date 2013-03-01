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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WhereClause_1_0");
    Fail266:
    { 
      IStrategoTerm f_178 = null;
      IStrategoTerm e_178 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWhereClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail266;
      e_178 = term.getSubterm(0);
      IStrategoList annos213 = term.getAnnotations();
      f_178 = annos213;
      term = u_41.invoke(context, e_178);
      if(term == null)
        break Fail266;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWhereClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_178));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}