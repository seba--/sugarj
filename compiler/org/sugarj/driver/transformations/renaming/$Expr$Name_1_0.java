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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprName_1_0");
    Fail218:
    { 
      IStrategoTerm z_149 = null;
      IStrategoTerm y_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExprName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail218;
      y_149 = term.getSubterm(0);
      IStrategoList annos192 = term.getAnnotations();
      z_149 = annos192;
      term = l_31.invoke(context, y_149);
      if(term == null)
        break Fail218;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExprName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}