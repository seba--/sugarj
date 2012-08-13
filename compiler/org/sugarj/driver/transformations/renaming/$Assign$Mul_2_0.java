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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_27, Strategy t_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignMul_2_0");
    Fail162:
    { 
      IStrategoTerm k_136 = null;
      IStrategoTerm h_136 = null;
      IStrategoTerm j_136 = null;
      IStrategoTerm l_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail162;
      h_136 = term.getSubterm(0);
      j_136 = term.getSubterm(1);
      IStrategoList annos137 = term.getAnnotations();
      k_136 = annos137;
      term = s_27.invoke(context, h_136);
      if(term == null)
        break Fail162;
      l_136 = term;
      term = t_27.invoke(context, j_136);
      if(term == null)
        break Fail162;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignMul_2, new IStrategoTerm[]{l_136, term}), checkListAnnos(termFactory, k_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}