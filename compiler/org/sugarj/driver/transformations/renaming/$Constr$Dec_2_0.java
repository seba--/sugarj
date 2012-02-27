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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_18, Strategy s_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrDec_2_0");
    Fail60:
    { 
      IStrategoTerm w_109 = null;
      IStrategoTerm u_109 = null;
      IStrategoTerm v_109 = null;
      IStrategoTerm x_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      u_109 = term.getSubterm(0);
      v_109 = term.getSubterm(1);
      IStrategoList annos46 = term.getAnnotations();
      w_109 = annos46;
      term = r_18.invoke(context, u_109);
      if(term == null)
        break Fail60;
      x_109 = term;
      term = s_18.invoke(context, v_109);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrDec_2, new IStrategoTerm[]{x_109, term}), checkListAnnos(termFactory, w_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}