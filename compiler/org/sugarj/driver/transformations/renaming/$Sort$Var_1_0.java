package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortVar_1_0");
    Fail125:
    { 
      IStrategoTerm c_112 = null;
      IStrategoTerm b_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail125;
      b_112 = term.getSubterm(0);
      IStrategoList annos113 = term.getAnnotations();
      c_112 = annos113;
      term = v_17.invoke(context, b_112);
      if(term == null)
        break Fail125;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}