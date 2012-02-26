package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$U$Right$Shift_2_0 extends Strategy 
{ 
  public static $Assign$U$Right$Shift_2_0 instance = new $Assign$U$Right$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_21, Strategy u_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignURightShift_2_0");
    Fail107:
    { 
      IStrategoTerm q_118 = null;
      IStrategoTerm o_118 = null;
      IStrategoTerm p_118 = null;
      IStrategoTerm r_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignURightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail107;
      o_118 = term.getSubterm(0);
      p_118 = term.getSubterm(1);
      IStrategoList annos89 = term.getAnnotations();
      q_118 = annos89;
      term = t_21.invoke(context, o_118);
      if(term == null)
        break Fail107;
      r_118 = term;
      term = u_21.invoke(context, p_118);
      if(term == null)
        break Fail107;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignURightShift_2, new IStrategoTerm[]{r_118, term}), checkListAnnos(termFactory, q_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}