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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortVar_1_0");
    Fail947:
    { 
      IStrategoTerm x_454 = null;
      IStrategoTerm w_454 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSortVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail947;
      w_454 = term.getSubterm(0);
      IStrategoList annos190 = term.getAnnotations();
      x_454 = annos190;
      term = s_345.invoke(context, w_454);
      if(term == null)
        break Fail947;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSortVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_454));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}