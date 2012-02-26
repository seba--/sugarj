package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$And_2_0 extends Strategy 
{ 
  public static $Assign$And_2_0 instance = new $Assign$And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_21, Strategy s_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignAnd_2_0");
    Fail106:
    { 
      IStrategoTerm l_118 = null;
      IStrategoTerm j_118 = null;
      IStrategoTerm k_118 = null;
      IStrategoTerm m_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail106;
      j_118 = term.getSubterm(0);
      k_118 = term.getSubterm(1);
      IStrategoList annos88 = term.getAnnotations();
      l_118 = annos88;
      term = r_21.invoke(context, j_118);
      if(term == null)
        break Fail106;
      m_118 = term;
      term = s_21.invoke(context, k_118);
      if(term == null)
        break Fail106;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignAnd_2, new IStrategoTerm[]{m_118, term}), checkListAnnos(termFactory, l_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}