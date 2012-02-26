package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_22, Strategy k_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail115:
    { 
      IStrategoTerm n_120 = null;
      IStrategoTerm l_120 = null;
      IStrategoTerm m_120 = null;
      IStrategoTerm o_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      l_120 = term.getSubterm(0);
      m_120 = term.getSubterm(1);
      IStrategoList annos97 = term.getAnnotations();
      n_120 = annos97;
      term = j_22.invoke(context, l_120);
      if(term == null)
        break Fail115;
      o_120 = term;
      term = k_22.invoke(context, m_120);
      if(term == null)
        break Fail115;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssign_2, new IStrategoTerm[]{o_120, term}), checkListAnnos(termFactory, n_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}