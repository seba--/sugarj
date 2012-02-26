package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Plus_2_0 extends Strategy 
{ 
  public static $Assign$Plus_2_0 instance = new $Assign$Plus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_22, Strategy c_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignPlus_2_0");
    Fail111:
    { 
      IStrategoTerm k_119 = null;
      IStrategoTerm i_119 = null;
      IStrategoTerm j_119 = null;
      IStrategoTerm l_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignPlus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail111;
      i_119 = term.getSubterm(0);
      j_119 = term.getSubterm(1);
      IStrategoList annos93 = term.getAnnotations();
      k_119 = annos93;
      term = b_22.invoke(context, i_119);
      if(term == null)
        break Fail111;
      l_119 = term;
      term = c_22.invoke(context, j_119);
      if(term == null)
        break Fail111;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignPlus_2, new IStrategoTerm[]{l_119, term}), checkListAnnos(termFactory, k_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}