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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_22, Strategy c_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignURightShift_2_0");
    Fail109:
    { 
      IStrategoTerm y_118 = null;
      IStrategoTerm w_118 = null;
      IStrategoTerm x_118 = null;
      IStrategoTerm z_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignURightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail109;
      w_118 = term.getSubterm(0);
      x_118 = term.getSubterm(1);
      IStrategoList annos89 = term.getAnnotations();
      y_118 = annos89;
      term = b_22.invoke(context, w_118);
      if(term == null)
        break Fail109;
      z_118 = term;
      term = c_22.invoke(context, x_118);
      if(term == null)
        break Fail109;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignURightShift_2, new IStrategoTerm[]{z_118, term}), checkListAnnos(termFactory, y_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}