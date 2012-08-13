package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Local$Var$Dec$Stm_1_0 extends Strategy 
{ 
  public static $Local$Var$Dec$Stm_1_0 instance = new $Local$Var$Dec$Stm_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LocalVarDecStm_1_0");
    Fail143:
    { 
      IStrategoTerm x_129 = null;
      IStrategoTerm w_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLocalVarDecStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      w_129 = term.getSubterm(0);
      IStrategoList annos120 = term.getAnnotations();
      x_129 = annos120;
      term = n_26.invoke(context, w_129);
      if(term == null)
        break Fail143;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLocalVarDecStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}