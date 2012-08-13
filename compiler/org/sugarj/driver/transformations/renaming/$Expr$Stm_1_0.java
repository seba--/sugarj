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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprStm_1_0");
    Fail139:
    { 
      IStrategoTerm b_129 = null;
      IStrategoTerm a_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExprStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail139;
      a_129 = term.getSubterm(0);
      IStrategoList annos117 = term.getAnnotations();
      b_129 = annos117;
      term = h_26.invoke(context, a_129);
      if(term == null)
        break Fail139;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExprStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}