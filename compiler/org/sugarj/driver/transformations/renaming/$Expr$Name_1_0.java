package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Expr$Name_1_0 extends Strategy 
{ 
  public static $Expr$Name_1_0 instance = new $Expr$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprName_1_0");
    Fail167:
    { 
      IStrategoTerm v_130 = null;
      IStrategoTerm t_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExprName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail167;
      t_130 = term.getSubterm(0);
      IStrategoList annos151 = term.getAnnotations();
      v_130 = annos151;
      term = l_25.invoke(context, t_130);
      if(term == null)
        break Fail167;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExprName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}