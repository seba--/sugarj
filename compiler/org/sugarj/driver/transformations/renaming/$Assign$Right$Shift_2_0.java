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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_21, Strategy h_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignRightShift_2_0");
    Fail105:
    { 
      IStrategoTerm f_118 = null;
      IStrategoTerm d_118 = null;
      IStrategoTerm e_118 = null;
      IStrategoTerm g_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignRightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail105;
      d_118 = term.getSubterm(0);
      e_118 = term.getSubterm(1);
      IStrategoList annos90 = term.getAnnotations();
      f_118 = annos90;
      term = g_21.invoke(context, d_118);
      if(term == null)
        break Fail105;
      g_118 = term;
      term = h_21.invoke(context, e_118);
      if(term == null)
        break Fail105;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignRightShift_2, new IStrategoTerm[]{g_118, term}), checkListAnnos(termFactory, f_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}