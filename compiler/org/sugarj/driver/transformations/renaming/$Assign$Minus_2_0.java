package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Minus_2_0 extends Strategy 
{ 
  public static $Assign$Minus_2_0 instance = new $Assign$Minus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_21, Strategy l_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignMinus_2_0");
    Fail107:
    { 
      IStrategoTerm p_118 = null;
      IStrategoTerm n_118 = null;
      IStrategoTerm o_118 = null;
      IStrategoTerm q_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignMinus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail107;
      n_118 = term.getSubterm(0);
      o_118 = term.getSubterm(1);
      IStrategoList annos92 = term.getAnnotations();
      p_118 = annos92;
      term = k_21.invoke(context, n_118);
      if(term == null)
        break Fail107;
      q_118 = term;
      term = l_21.invoke(context, o_118);
      if(term == null)
        break Fail107;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignMinus_2, new IStrategoTerm[]{q_118, term}), checkListAnnos(termFactory, p_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}