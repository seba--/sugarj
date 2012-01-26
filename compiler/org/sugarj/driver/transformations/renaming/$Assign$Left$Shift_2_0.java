package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Left$Shift_2_0 extends Strategy 
{ 
  public static $Assign$Left$Shift_2_0 instance = new $Assign$Left$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_21, Strategy j_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignLeftShift_2_0");
    Fail106:
    { 
      IStrategoTerm k_118 = null;
      IStrategoTerm i_118 = null;
      IStrategoTerm j_118 = null;
      IStrategoTerm l_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignLeftShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail106;
      i_118 = term.getSubterm(0);
      j_118 = term.getSubterm(1);
      IStrategoList annos91 = term.getAnnotations();
      k_118 = annos91;
      term = i_21.invoke(context, i_118);
      if(term == null)
        break Fail106;
      l_118 = term;
      term = j_21.invoke(context, j_118);
      if(term == null)
        break Fail106;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignLeftShift_2, new IStrategoTerm[]{l_118, term}), checkListAnnos(termFactory, k_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}