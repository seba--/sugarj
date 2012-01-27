package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$Super$Method_3_0 extends Strategy 
{ 
  public static $Q$Super$Method_3_0 instance = new $Q$Super$Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_14, Strategy n_14, Strategy o_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperMethod_3_0");
    Fail20:
    { 
      IStrategoTerm k_100 = null;
      IStrategoTerm h_100 = null;
      IStrategoTerm i_100 = null;
      IStrategoTerm j_100 = null;
      IStrategoTerm l_100 = null;
      IStrategoTerm m_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQSuperMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail20;
      h_100 = term.getSubterm(0);
      i_100 = term.getSubterm(1);
      j_100 = term.getSubterm(2);
      IStrategoList annos11 = term.getAnnotations();
      k_100 = annos11;
      term = m_14.invoke(context, h_100);
      if(term == null)
        break Fail20;
      l_100 = term;
      term = n_14.invoke(context, i_100);
      if(term == null)
        break Fail20;
      m_100 = term;
      term = o_14.invoke(context, j_100);
      if(term == null)
        break Fail20;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQSuperMethod_3, new IStrategoTerm[]{l_100, m_100, term}), checkListAnnos(termFactory, k_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}