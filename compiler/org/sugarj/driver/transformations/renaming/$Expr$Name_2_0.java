package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Expr$Name_2_0 extends Strategy 
{ 
  public static $Expr$Name_2_0 instance = new $Expr$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_25, Strategy k_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprName_2_0");
    Fail166:
    { 
      IStrategoTerm m_130 = null;
      IStrategoTerm j_130 = null;
      IStrategoTerm k_130 = null;
      IStrategoTerm o_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExprName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail166;
      j_130 = term.getSubterm(0);
      k_130 = term.getSubterm(1);
      IStrategoList annos150 = term.getAnnotations();
      m_130 = annos150;
      term = j_25.invoke(context, j_130);
      if(term == null)
        break Fail166;
      o_130 = term;
      term = k_25.invoke(context, k_130);
      if(term == null)
        break Fail166;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExprName_2, new IStrategoTerm[]{o_130, term}), checkListAnnos(termFactory, m_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}