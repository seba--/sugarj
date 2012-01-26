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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_17, Strategy m_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AltConstrInv_2_0");
    Fail52:
    { 
      IStrategoTerm a_108 = null;
      IStrategoTerm y_107 = null;
      IStrategoTerm z_107 = null;
      IStrategoTerm b_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAltConstrInv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      y_107 = term.getSubterm(0);
      z_107 = term.getSubterm(1);
      IStrategoList annos43 = term.getAnnotations();
      a_108 = annos43;
      term = l_17.invoke(context, y_107);
      if(term == null)
        break Fail52;
      b_108 = term;
      term = m_17.invoke(context, z_107);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAltConstrInv_2, new IStrategoTerm[]{b_108, term}), checkListAnnos(termFactory, a_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}