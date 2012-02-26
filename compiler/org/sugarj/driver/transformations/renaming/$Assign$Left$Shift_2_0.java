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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_21, Strategy y_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignLeftShift_2_0");
    Fail109:
    { 
      IStrategoTerm a_119 = null;
      IStrategoTerm y_118 = null;
      IStrategoTerm z_118 = null;
      IStrategoTerm b_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignLeftShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail109;
      y_118 = term.getSubterm(0);
      z_118 = term.getSubterm(1);
      IStrategoList annos91 = term.getAnnotations();
      a_119 = annos91;
      term = x_21.invoke(context, y_118);
      if(term == null)
        break Fail109;
      b_119 = term;
      term = y_21.invoke(context, z_118);
      if(term == null)
        break Fail109;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignLeftShift_2, new IStrategoTerm[]{b_119, term}), checkListAnnos(termFactory, a_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}