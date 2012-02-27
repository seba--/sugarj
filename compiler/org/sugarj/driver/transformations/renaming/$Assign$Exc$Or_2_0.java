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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_21, Strategy y_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignExcOr_2_0");
    Fail107:
    { 
      IStrategoTerm o_118 = null;
      IStrategoTerm m_118 = null;
      IStrategoTerm n_118 = null;
      IStrategoTerm p_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignExcOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail107;
      m_118 = term.getSubterm(0);
      n_118 = term.getSubterm(1);
      IStrategoList annos87 = term.getAnnotations();
      o_118 = annos87;
      term = x_21.invoke(context, m_118);
      if(term == null)
        break Fail107;
      p_118 = term;
      term = y_21.invoke(context, n_118);
      if(term == null)
        break Fail107;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignExcOr_2, new IStrategoTerm[]{p_118, term}), checkListAnnos(termFactory, o_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}