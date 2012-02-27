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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_22, Strategy e_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignRightShift_2_0");
    Fail110:
    { 
      IStrategoTerm d_119 = null;
      IStrategoTerm b_119 = null;
      IStrategoTerm c_119 = null;
      IStrategoTerm e_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignRightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail110;
      b_119 = term.getSubterm(0);
      c_119 = term.getSubterm(1);
      IStrategoList annos90 = term.getAnnotations();
      d_119 = annos90;
      term = d_22.invoke(context, b_119);
      if(term == null)
        break Fail110;
      e_119 = term;
      term = e_22.invoke(context, c_119);
      if(term == null)
        break Fail110;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignRightShift_2, new IStrategoTerm[]{e_119, term}), checkListAnnos(termFactory, d_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}