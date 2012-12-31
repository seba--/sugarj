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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_35, Strategy p_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignRightShift_2_0");
    Fail146:
    { 
      IStrategoTerm m_157 = null;
      IStrategoTerm k_157 = null;
      IStrategoTerm l_157 = null;
      IStrategoTerm o_157 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssignRightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail146;
      k_157 = term.getSubterm(0);
      l_157 = term.getSubterm(1);
      IStrategoList annos116 = term.getAnnotations();
      m_157 = annos116;
      term = o_35.invoke(context, k_157);
      if(term == null)
        break Fail146;
      o_157 = term;
      term = p_35.invoke(context, l_157);
      if(term == null)
        break Fail146;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssignRightShift_2, new IStrategoTerm[]{o_157, term}), checkListAnnos(termFactory, m_157));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}