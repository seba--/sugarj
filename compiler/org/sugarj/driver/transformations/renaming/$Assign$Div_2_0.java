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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_22, Strategy o_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignDiv_2_0");
    Fail115:
    { 
      IStrategoTerm l_120 = null;
      IStrategoTerm j_120 = null;
      IStrategoTerm k_120 = null;
      IStrategoTerm m_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      j_120 = term.getSubterm(0);
      k_120 = term.getSubterm(1);
      IStrategoList annos95 = term.getAnnotations();
      l_120 = annos95;
      term = n_22.invoke(context, j_120);
      if(term == null)
        break Fail115;
      m_120 = term;
      term = o_22.invoke(context, k_120);
      if(term == null)
        break Fail115;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignDiv_2, new IStrategoTerm[]{m_120, term}), checkListAnnos(termFactory, l_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}