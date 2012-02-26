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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprStm_1_0");
    Fail91:
    { 
      IStrategoTerm i_116 = null;
      IStrategoTerm h_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail91;
      h_116 = term.getSubterm(0);
      IStrategoList annos76 = term.getAnnotations();
      i_116 = annos76;
      term = w_20.invoke(context, h_116);
      if(term == null)
        break Fail91;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExprStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}