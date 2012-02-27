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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_22, Strategy g_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignLeftShift_2_0");
    Fail111:
    { 
      IStrategoTerm i_119 = null;
      IStrategoTerm g_119 = null;
      IStrategoTerm h_119 = null;
      IStrategoTerm j_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignLeftShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail111;
      g_119 = term.getSubterm(0);
      h_119 = term.getSubterm(1);
      IStrategoList annos91 = term.getAnnotations();
      i_119 = annos91;
      term = f_22.invoke(context, g_119);
      if(term == null)
        break Fail111;
      j_119 = term;
      term = g_22.invoke(context, h_119);
      if(term == null)
        break Fail111;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignLeftShift_2, new IStrategoTerm[]{j_119, term}), checkListAnnos(termFactory, i_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}