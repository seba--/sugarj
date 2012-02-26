package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Left$Shift_2_0 extends Strategy 
{ 
  public static $Left$Shift_2_0 instance = new $Left$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_23, Strategy m_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LeftShift_2_0");
    Fail129:
    { 
      IStrategoTerm o_123 = null;
      IStrategoTerm m_123 = null;
      IStrategoTerm n_123 = null;
      IStrategoTerm p_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail129;
      m_123 = term.getSubterm(0);
      n_123 = term.getSubterm(1);
      IStrategoList annos111 = term.getAnnotations();
      o_123 = annos111;
      term = l_23.invoke(context, m_123);
      if(term == null)
        break Fail129;
      p_123 = term;
      term = m_23.invoke(context, n_123);
      if(term == null)
        break Fail129;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLeftShift_2, new IStrategoTerm[]{p_123, term}), checkListAnnos(termFactory, o_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}