package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Exc$Or_2_0 extends Strategy 
{ 
  public static $Assign$Exc$Or_2_0 instance = new $Assign$Exc$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_21, Strategy b_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignExcOr_2_0");
    Fail102:
    { 
      IStrategoTerm q_117 = null;
      IStrategoTerm o_117 = null;
      IStrategoTerm p_117 = null;
      IStrategoTerm r_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignExcOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail102;
      o_117 = term.getSubterm(0);
      p_117 = term.getSubterm(1);
      IStrategoList annos87 = term.getAnnotations();
      q_117 = annos87;
      term = a_21.invoke(context, o_117);
      if(term == null)
        break Fail102;
      r_117 = term;
      term = b_21.invoke(context, p_117);
      if(term == null)
        break Fail102;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignExcOr_2, new IStrategoTerm[]{r_117, term}), checkListAnnos(termFactory, q_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}