package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $For$Each_3_0 extends Strategy 
{ 
  public static $For$Each_3_0 instance = new $For$Each_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_19, Strategy n_19, Strategy o_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ForEach_3_0");
    Fail79:
    { 
      IStrategoTerm o_113 = null;
      IStrategoTerm l_113 = null;
      IStrategoTerm m_113 = null;
      IStrategoTerm n_113 = null;
      IStrategoTerm q_113 = null;
      IStrategoTerm r_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consForEach_3 != ((IStrategoAppl)term).getConstructor())
        break Fail79;
      l_113 = term.getSubterm(0);
      m_113 = term.getSubterm(1);
      n_113 = term.getSubterm(2);
      IStrategoList annos67 = term.getAnnotations();
      o_113 = annos67;
      term = m_19.invoke(context, l_113);
      if(term == null)
        break Fail79;
      q_113 = term;
      term = n_19.invoke(context, m_113);
      if(term == null)
        break Fail79;
      r_113 = term;
      term = o_19.invoke(context, n_113);
      if(term == null)
        break Fail79;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consForEach_3, new IStrategoTerm[]{q_113, r_113, term}), checkListAnnos(termFactory, o_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}