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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_18, Strategy j_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AltConstrInv_2_0");
    Fail57:
    { 
      IStrategoTerm y_108 = null;
      IStrategoTerm w_108 = null;
      IStrategoTerm x_108 = null;
      IStrategoTerm z_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAltConstrInv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      w_108 = term.getSubterm(0);
      x_108 = term.getSubterm(1);
      IStrategoList annos43 = term.getAnnotations();
      y_108 = annos43;
      term = i_18.invoke(context, w_108);
      if(term == null)
        break Fail57;
      z_108 = term;
      term = j_18.invoke(context, x_108);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAltConstrInv_2, new IStrategoTerm[]{z_108, term}), checkListAnnos(termFactory, y_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}