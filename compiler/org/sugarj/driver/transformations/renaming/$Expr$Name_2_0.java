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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_25, Strategy z_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprName_2_0");
    Fail169:
    { 
      IStrategoTerm s_131 = null;
      IStrategoTerm l_131 = null;
      IStrategoTerm q_131 = null;
      IStrategoTerm t_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExprName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail169;
      l_131 = term.getSubterm(0);
      q_131 = term.getSubterm(1);
      IStrategoList annos150 = term.getAnnotations();
      s_131 = annos150;
      term = y_25.invoke(context, l_131);
      if(term == null)
        break Fail169;
      t_131 = term;
      term = z_25.invoke(context, q_131);
      if(term == null)
        break Fail169;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExprName_2, new IStrategoTerm[]{t_131, term}), checkListAnnos(termFactory, s_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}