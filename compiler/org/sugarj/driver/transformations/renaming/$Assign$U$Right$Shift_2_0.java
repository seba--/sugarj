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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_21, Strategy f_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignURightShift_2_0");
    Fail104:
    { 
      IStrategoTerm a_118 = null;
      IStrategoTerm y_117 = null;
      IStrategoTerm z_117 = null;
      IStrategoTerm b_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignURightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail104;
      y_117 = term.getSubterm(0);
      z_117 = term.getSubterm(1);
      IStrategoList annos89 = term.getAnnotations();
      a_118 = annos89;
      term = e_21.invoke(context, y_117);
      if(term == null)
        break Fail104;
      b_118 = term;
      term = f_21.invoke(context, z_117);
      if(term == null)
        break Fail104;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignURightShift_2, new IStrategoTerm[]{b_118, term}), checkListAnnos(termFactory, a_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}