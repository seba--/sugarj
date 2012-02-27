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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_18, Strategy e_18, Strategy f_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperConstrInv_3_0");
    Fail55:
    { 
      IStrategoTerm n_108 = null;
      IStrategoTerm k_108 = null;
      IStrategoTerm l_108 = null;
      IStrategoTerm m_108 = null;
      IStrategoTerm o_108 = null;
      IStrategoTerm p_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQSuperConstrInv_3 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      k_108 = term.getSubterm(0);
      l_108 = term.getSubterm(1);
      m_108 = term.getSubterm(2);
      IStrategoList annos41 = term.getAnnotations();
      n_108 = annos41;
      term = d_18.invoke(context, k_108);
      if(term == null)
        break Fail55;
      o_108 = term;
      term = e_18.invoke(context, l_108);
      if(term == null)
        break Fail55;
      p_108 = term;
      term = f_18.invoke(context, m_108);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQSuperConstrInv_3, new IStrategoTerm[]{o_108, p_108, term}), checkListAnnos(termFactory, n_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}