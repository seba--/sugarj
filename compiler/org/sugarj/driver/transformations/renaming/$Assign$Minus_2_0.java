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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_27, Strategy l_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignMinus_2_0");
    Fail158:
    { 
      IStrategoTerm q_134 = null;
      IStrategoTerm u_133 = null;
      IStrategoTerm x_133 = null;
      IStrategoTerm r_134 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignMinus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail158;
      u_133 = term.getSubterm(0);
      x_133 = term.getSubterm(1);
      IStrategoList annos133 = term.getAnnotations();
      q_134 = annos133;
      term = k_27.invoke(context, u_133);
      if(term == null)
        break Fail158;
      r_134 = term;
      term = l_27.invoke(context, x_133);
      if(term == null)
        break Fail158;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignMinus_2, new IStrategoTerm[]{r_134, term}), checkListAnnos(termFactory, q_134));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}