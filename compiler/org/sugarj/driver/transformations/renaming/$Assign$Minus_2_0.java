package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Minus_2_0 extends Strategy 
{ 
  public static $Assign$Minus_2_0 instance = new $Assign$Minus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_35, Strategy t_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignMinus_2_0");
    Fail148:
    { 
      IStrategoTerm f_158 = null;
      IStrategoTerm b_158 = null;
      IStrategoTerm c_158 = null;
      IStrategoTerm g_158 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssignMinus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail148;
      b_158 = term.getSubterm(0);
      c_158 = term.getSubterm(1);
      IStrategoList annos118 = term.getAnnotations();
      f_158 = annos118;
      term = s_35.invoke(context, b_158);
      if(term == null)
        break Fail148;
      g_158 = term;
      term = t_35.invoke(context, c_158);
      if(term == null)
        break Fail148;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssignMinus_2, new IStrategoTerm[]{g_158, term}), checkListAnnos(termFactory, f_158));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}