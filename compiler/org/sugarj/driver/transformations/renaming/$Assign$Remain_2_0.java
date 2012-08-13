package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Remain_2_0 extends Strategy 
{ 
  public static $Assign$Remain_2_0 instance = new $Assign$Remain_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_27, Strategy p_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignRemain_2_0");
    Fail160:
    { 
      IStrategoTerm m_135 = null;
      IStrategoTerm i_135 = null;
      IStrategoTerm k_135 = null;
      IStrategoTerm o_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignRemain_2 != ((IStrategoAppl)term).getConstructor())
        break Fail160;
      i_135 = term.getSubterm(0);
      k_135 = term.getSubterm(1);
      IStrategoList annos135 = term.getAnnotations();
      m_135 = annos135;
      term = o_27.invoke(context, i_135);
      if(term == null)
        break Fail160;
      o_135 = term;
      term = p_27.invoke(context, k_135);
      if(term == null)
        break Fail160;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignRemain_2, new IStrategoTerm[]{o_135, term}), checkListAnnos(termFactory, m_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}