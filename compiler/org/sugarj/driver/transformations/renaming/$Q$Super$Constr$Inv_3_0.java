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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_17, Strategy h_17, Strategy i_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperConstrInv_3_0");
    Fail50:
    { 
      IStrategoTerm p_107 = null;
      IStrategoTerm j_107 = null;
      IStrategoTerm k_107 = null;
      IStrategoTerm o_107 = null;
      IStrategoTerm q_107 = null;
      IStrategoTerm r_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQSuperConstrInv_3 != ((IStrategoAppl)term).getConstructor())
        break Fail50;
      j_107 = term.getSubterm(0);
      k_107 = term.getSubterm(1);
      o_107 = term.getSubterm(2);
      IStrategoList annos41 = term.getAnnotations();
      p_107 = annos41;
      term = g_17.invoke(context, j_107);
      if(term == null)
        break Fail50;
      q_107 = term;
      term = h_17.invoke(context, k_107);
      if(term == null)
        break Fail50;
      r_107 = term;
      term = i_17.invoke(context, o_107);
      if(term == null)
        break Fail50;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQSuperConstrInv_3, new IStrategoTerm[]{q_107, r_107, term}), checkListAnnos(termFactory, p_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}