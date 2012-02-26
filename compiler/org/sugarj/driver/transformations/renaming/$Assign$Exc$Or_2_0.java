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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_21, Strategy q_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignExcOr_2_0");
    Fail105:
    { 
      IStrategoTerm g_118 = null;
      IStrategoTerm e_118 = null;
      IStrategoTerm f_118 = null;
      IStrategoTerm h_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignExcOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail105;
      e_118 = term.getSubterm(0);
      f_118 = term.getSubterm(1);
      IStrategoList annos87 = term.getAnnotations();
      g_118 = annos87;
      term = p_21.invoke(context, e_118);
      if(term == null)
        break Fail105;
      h_118 = term;
      term = q_21.invoke(context, f_118);
      if(term == null)
        break Fail105;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignExcOr_2, new IStrategoTerm[]{h_118, term}), checkListAnnos(termFactory, g_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}