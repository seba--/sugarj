package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $U$Right$Shift_2_0 extends Strategy 
{ 
  public static $U$Right$Shift_2_0 instance = new $U$Right$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_23, Strategy q_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("URightShift_2_0");
    Fail129:
    { 
      IStrategoTerm m_123 = null;
      IStrategoTerm k_123 = null;
      IStrategoTerm l_123 = null;
      IStrategoTerm n_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail129;
      k_123 = term.getSubterm(0);
      l_123 = term.getSubterm(1);
      IStrategoList annos109 = term.getAnnotations();
      m_123 = annos109;
      term = p_23.invoke(context, k_123);
      if(term == null)
        break Fail129;
      n_123 = term;
      term = q_23.invoke(context, l_123);
      if(term == null)
        break Fail129;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consURightShift_2, new IStrategoTerm[]{n_123, term}), checkListAnnos(termFactory, m_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}