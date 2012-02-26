package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Mul_2_0 extends Strategy 
{ 
  public static $Mul_2_0 instance = new $Mul_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_23, Strategy w_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Mul_2_0");
    Fail134:
    { 
      IStrategoTerm v_124 = null;
      IStrategoTerm t_124 = null;
      IStrategoTerm u_124 = null;
      IStrategoTerm w_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail134;
      t_124 = term.getSubterm(0);
      u_124 = term.getSubterm(1);
      IStrategoList annos116 = term.getAnnotations();
      v_124 = annos116;
      term = v_23.invoke(context, t_124);
      if(term == null)
        break Fail134;
      w_124 = term;
      term = w_23.invoke(context, u_124);
      if(term == null)
        break Fail134;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMul_2, new IStrategoTerm[]{w_124, term}), checkListAnnos(termFactory, v_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}