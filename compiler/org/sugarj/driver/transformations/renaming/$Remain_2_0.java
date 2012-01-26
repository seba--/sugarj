package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Remain_2_0 extends Strategy 
{ 
  public static $Remain_2_0 instance = new $Remain_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_23, Strategy d_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Remain_2_0");
    Fail129:
    { 
      IStrategoTerm n_123 = null;
      IStrategoTerm l_123 = null;
      IStrategoTerm m_123 = null;
      IStrategoTerm o_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consRemain_2 != ((IStrategoAppl)term).getConstructor())
        break Fail129;
      l_123 = term.getSubterm(0);
      m_123 = term.getSubterm(1);
      IStrategoList annos114 = term.getAnnotations();
      n_123 = annos114;
      term = c_23.invoke(context, l_123);
      if(term == null)
        break Fail129;
      o_123 = term;
      term = d_23.invoke(context, m_123);
      if(term == null)
        break Fail129;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consRemain_2, new IStrategoTerm[]{o_123, term}), checkListAnnos(termFactory, n_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}