package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Right$Shift_2_0 extends Strategy 
{ 
  public static $Right$Shift_2_0 instance = new $Right$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_28, Strategy v_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RightShift_2_0");
    Fail176:
    { 
      IStrategoTerm m_139 = null;
      IStrategoTerm k_139 = null;
      IStrategoTerm l_139 = null;
      IStrategoTerm z_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail176;
      k_139 = term.getSubterm(0);
      l_139 = term.getSubterm(1);
      IStrategoList annos151 = term.getAnnotations();
      m_139 = annos151;
      term = u_28.invoke(context, k_139);
      if(term == null)
        break Fail176;
      z_139 = term;
      term = v_28.invoke(context, l_139);
      if(term == null)
        break Fail176;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consRightShift_2, new IStrategoTerm[]{z_139, term}), checkListAnnos(termFactory, m_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}