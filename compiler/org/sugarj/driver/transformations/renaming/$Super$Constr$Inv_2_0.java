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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_17, Strategy z_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperConstrInv_2_0");
    Fail54:
    { 
      IStrategoTerm l_108 = null;
      IStrategoTerm j_108 = null;
      IStrategoTerm k_108 = null;
      IStrategoTerm m_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperConstrInv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      j_108 = term.getSubterm(0);
      k_108 = term.getSubterm(1);
      IStrategoList annos42 = term.getAnnotations();
      l_108 = annos42;
      term = y_17.invoke(context, j_108);
      if(term == null)
        break Fail54;
      m_108 = term;
      term = z_17.invoke(context, k_108);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperConstrInv_2, new IStrategoTerm[]{m_108, term}), checkListAnnos(termFactory, l_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}