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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_22, Strategy i_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignMul_2_0");
    Fail114:
    { 
      IStrategoTerm g_120 = null;
      IStrategoTerm z_119 = null;
      IStrategoTerm c_120 = null;
      IStrategoTerm j_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail114;
      z_119 = term.getSubterm(0);
      c_120 = term.getSubterm(1);
      IStrategoList annos96 = term.getAnnotations();
      g_120 = annos96;
      term = h_22.invoke(context, z_119);
      if(term == null)
        break Fail114;
      j_120 = term;
      term = i_22.invoke(context, c_120);
      if(term == null)
        break Fail114;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignMul_2, new IStrategoTerm[]{j_120, term}), checkListAnnos(termFactory, g_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}