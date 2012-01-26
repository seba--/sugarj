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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_21, Strategy t_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignMul_2_0");
    Fail111:
    { 
      IStrategoTerm j_119 = null;
      IStrategoTerm h_119 = null;
      IStrategoTerm i_119 = null;
      IStrategoTerm k_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail111;
      h_119 = term.getSubterm(0);
      i_119 = term.getSubterm(1);
      IStrategoList annos96 = term.getAnnotations();
      j_119 = annos96;
      term = s_21.invoke(context, h_119);
      if(term == null)
        break Fail111;
      k_119 = term;
      term = t_21.invoke(context, i_119);
      if(term == null)
        break Fail111;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignMul_2, new IStrategoTerm[]{k_119, term}), checkListAnnos(termFactory, j_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}