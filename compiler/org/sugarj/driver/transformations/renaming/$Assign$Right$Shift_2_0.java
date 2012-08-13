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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_27, Strategy h_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignRightShift_2_0");
    Fail156:
    { 
      IStrategoTerm f_133 = null;
      IStrategoTerm z_132 = null;
      IStrategoTerm c_133 = null;
      IStrategoTerm j_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignRightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail156;
      z_132 = term.getSubterm(0);
      c_133 = term.getSubterm(1);
      IStrategoList annos131 = term.getAnnotations();
      f_133 = annos131;
      term = g_27.invoke(context, z_132);
      if(term == null)
        break Fail156;
      j_133 = term;
      term = h_27.invoke(context, c_133);
      if(term == null)
        break Fail156;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignRightShift_2, new IStrategoTerm[]{j_133, term}), checkListAnnos(termFactory, f_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}