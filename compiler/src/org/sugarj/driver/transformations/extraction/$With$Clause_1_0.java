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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WithClause_1_0");
    Fail54:
    { 
      IStrategoTerm e_107 = null;
      IStrategoTerm d_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consWithClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      d_107 = term.getSubterm(0);
      IStrategoList annos27 = term.getAnnotations();
      e_107 = annos27;
      term = n_17.invoke(context, d_107);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consWithClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}