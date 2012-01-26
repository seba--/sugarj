package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Dec_2_0 extends Strategy 
{ 
  public static $Constr$Dec_2_0 instance = new $Constr$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_17, Strategy v_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrDec_2_0");
    Fail55:
    { 
      IStrategoTerm v_108 = null;
      IStrategoTerm t_108 = null;
      IStrategoTerm u_108 = null;
      IStrategoTerm w_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      t_108 = term.getSubterm(0);
      u_108 = term.getSubterm(1);
      IStrategoList annos46 = term.getAnnotations();
      v_108 = annos46;
      term = u_17.invoke(context, t_108);
      if(term == null)
        break Fail55;
      w_108 = term;
      term = v_17.invoke(context, u_108);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrDec_2, new IStrategoTerm[]{w_108, term}), checkListAnnos(termFactory, v_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}