package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Expr$Stm_1_0 extends Strategy 
{ 
  public static $Expr$Stm_1_0 instance = new $Expr$Stm_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprStm_1_0");
    Fail88:
    { 
      IStrategoTerm s_115 = null;
      IStrategoTerm r_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail88;
      r_115 = term.getSubterm(0);
      IStrategoList annos76 = term.getAnnotations();
      s_115 = annos76;
      term = h_20.invoke(context, r_115);
      if(term == null)
        break Fail88;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExprStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}