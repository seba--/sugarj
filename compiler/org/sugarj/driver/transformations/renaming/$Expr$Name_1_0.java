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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprName_1_0");
    Fail172:
    { 
      IStrategoTerm g_132 = null;
      IStrategoTerm f_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExprName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail172;
      f_132 = term.getSubterm(0);
      IStrategoList annos151 = term.getAnnotations();
      g_132 = annos151;
      term = i_26.invoke(context, f_132);
      if(term == null)
        break Fail172;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExprName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}