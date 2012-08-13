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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_31, Strategy k_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprName_2_0");
    Fail217:
    { 
      IStrategoTerm v_149 = null;
      IStrategoTerm t_149 = null;
      IStrategoTerm u_149 = null;
      IStrategoTerm w_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExprName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail217;
      t_149 = term.getSubterm(0);
      u_149 = term.getSubterm(1);
      IStrategoList annos191 = term.getAnnotations();
      v_149 = annos191;
      term = j_31.invoke(context, t_149);
      if(term == null)
        break Fail217;
      w_149 = term;
      term = k_31.invoke(context, u_149);
      if(term == null)
        break Fail217;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExprName_2, new IStrategoTerm[]{w_149, term}), checkListAnnos(termFactory, v_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}