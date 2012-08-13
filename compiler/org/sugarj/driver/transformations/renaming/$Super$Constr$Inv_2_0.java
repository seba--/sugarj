package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Constr$Inv_2_0 extends Strategy 
{ 
  public static $Super$Constr$Inv_2_0 instance = new $Super$Constr$Inv_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_23, Strategy k_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperConstrInv_2_0");
    Fail102:
    { 
      IStrategoTerm b_121 = null;
      IStrategoTerm z_120 = null;
      IStrategoTerm a_121 = null;
      IStrategoTerm c_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperConstrInv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail102;
      z_120 = term.getSubterm(0);
      a_121 = term.getSubterm(1);
      IStrategoList annos83 = term.getAnnotations();
      b_121 = annos83;
      term = j_23.invoke(context, z_120);
      if(term == null)
        break Fail102;
      c_121 = term;
      term = k_23.invoke(context, a_121);
      if(term == null)
        break Fail102;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperConstrInv_2, new IStrategoTerm[]{c_121, term}), checkListAnnos(termFactory, b_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}