package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Div_2_0 extends Strategy 
{ 
  public static $Assign$Div_2_0 instance = new $Assign$Div_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_27, Strategy r_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignDiv_2_0");
    Fail161:
    { 
      IStrategoTerm b_136 = null;
      IStrategoTerm u_135 = null;
      IStrategoTerm y_135 = null;
      IStrategoTerm d_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail161;
      u_135 = term.getSubterm(0);
      y_135 = term.getSubterm(1);
      IStrategoList annos136 = term.getAnnotations();
      b_136 = annos136;
      term = q_27.invoke(context, u_135);
      if(term == null)
        break Fail161;
      d_136 = term;
      term = r_27.invoke(context, y_135);
      if(term == null)
        break Fail161;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignDiv_2, new IStrategoTerm[]{d_136, term}), checkListAnnos(termFactory, b_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}