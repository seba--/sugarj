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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExprName_1_0");
    Fail208:
    { 
      IStrategoTerm v_171 = null;
      IStrategoTerm u_171 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExprName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail208;
      u_171 = term.getSubterm(0);
      IStrategoList annos177 = term.getAnnotations();
      v_171 = annos177;
      term = t_39.invoke(context, u_171);
      if(term == null)
        break Fail208;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExprName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_171));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}