package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Right$Shift_2_0 extends Strategy 
{ 
  public static $Assign$Right$Shift_2_0 instance = new $Assign$Right$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_21, Strategy w_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignRightShift_2_0");
    Fail108:
    { 
      IStrategoTerm v_118 = null;
      IStrategoTerm t_118 = null;
      IStrategoTerm u_118 = null;
      IStrategoTerm w_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignRightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail108;
      t_118 = term.getSubterm(0);
      u_118 = term.getSubterm(1);
      IStrategoList annos90 = term.getAnnotations();
      v_118 = annos90;
      term = v_21.invoke(context, t_118);
      if(term == null)
        break Fail108;
      w_118 = term;
      term = w_21.invoke(context, u_118);
      if(term == null)
        break Fail108;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignRightShift_2, new IStrategoTerm[]{w_118, term}), checkListAnnos(termFactory, v_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}