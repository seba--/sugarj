package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$Var_1_0 extends Strategy 
{ 
  public static $Sort$Var_1_0 instance = new $Sort$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortVar_1_0");
    Fail140:
    { 
      IStrategoTerm t_125 = null;
      IStrategoTerm s_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSortVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      s_125 = term.getSubterm(0);
      IStrategoList annos113 = term.getAnnotations();
      t_125 = annos113;
      term = b_24.invoke(context, s_125);
      if(term == null)
        break Fail140;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSortVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}