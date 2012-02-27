package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Mul_2_0 extends Strategy 
{ 
  public static $Assign$Mul_2_0 instance = new $Assign$Mul_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_22, Strategy q_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignMul_2_0");
    Fail116:
    { 
      IStrategoTerm q_120 = null;
      IStrategoTerm o_120 = null;
      IStrategoTerm p_120 = null;
      IStrategoTerm r_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail116;
      o_120 = term.getSubterm(0);
      p_120 = term.getSubterm(1);
      IStrategoList annos96 = term.getAnnotations();
      q_120 = annos96;
      term = p_22.invoke(context, o_120);
      if(term == null)
        break Fail116;
      r_120 = term;
      term = q_22.invoke(context, p_120);
      if(term == null)
        break Fail116;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignMul_2, new IStrategoTerm[]{r_120, term}), checkListAnnos(termFactory, q_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}