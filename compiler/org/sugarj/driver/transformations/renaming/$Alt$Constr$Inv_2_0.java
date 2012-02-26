package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Alt$Constr$Inv_2_0 extends Strategy 
{ 
  public static $Alt$Constr$Inv_2_0 instance = new $Alt$Constr$Inv_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_18, Strategy b_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AltConstrInv_2_0");
    Fail55:
    { 
      IStrategoTerm q_108 = null;
      IStrategoTerm o_108 = null;
      IStrategoTerm p_108 = null;
      IStrategoTerm r_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAltConstrInv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      o_108 = term.getSubterm(0);
      p_108 = term.getSubterm(1);
      IStrategoList annos43 = term.getAnnotations();
      q_108 = annos43;
      term = a_18.invoke(context, o_108);
      if(term == null)
        break Fail55;
      r_108 = term;
      term = b_18.invoke(context, p_108);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAltConstrInv_2, new IStrategoTerm[]{r_108, term}), checkListAnnos(termFactory, q_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}