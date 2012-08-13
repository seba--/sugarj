package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$Super$Constr$Inv_3_0 extends Strategy 
{ 
  public static $Q$Super$Constr$Inv_3_0 instance = new $Q$Super$Constr$Inv_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_23, Strategy h_23, Strategy i_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperConstrInv_3_0");
    Fail101:
    { 
      IStrategoTerm t_120 = null;
      IStrategoTerm q_120 = null;
      IStrategoTerm r_120 = null;
      IStrategoTerm s_120 = null;
      IStrategoTerm v_120 = null;
      IStrategoTerm x_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQSuperConstrInv_3 != ((IStrategoAppl)term).getConstructor())
        break Fail101;
      q_120 = term.getSubterm(0);
      r_120 = term.getSubterm(1);
      s_120 = term.getSubterm(2);
      IStrategoList annos82 = term.getAnnotations();
      t_120 = annos82;
      term = g_23.invoke(context, q_120);
      if(term == null)
        break Fail101;
      v_120 = term;
      term = h_23.invoke(context, r_120);
      if(term == null)
        break Fail101;
      x_120 = term;
      term = i_23.invoke(context, s_120);
      if(term == null)
        break Fail101;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQSuperConstrInv_3, new IStrategoTerm[]{v_120, x_120, term}), checkListAnnos(termFactory, t_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}