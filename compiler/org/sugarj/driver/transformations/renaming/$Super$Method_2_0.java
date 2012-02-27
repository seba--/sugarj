package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Method_2_0 extends Strategy 
{ 
  public static $Super$Method_2_0 instance = new $Super$Method_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_15, Strategy n_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperMethod_2_0");
    Fail26:
    { 
      IStrategoTerm q_101 = null;
      IStrategoTerm o_101 = null;
      IStrategoTerm p_101 = null;
      IStrategoTerm r_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperMethod_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      o_101 = term.getSubterm(0);
      p_101 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      q_101 = annos12;
      term = m_15.invoke(context, o_101);
      if(term == null)
        break Fail26;
      r_101 = term;
      term = n_15.invoke(context, p_101);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperMethod_2, new IStrategoTerm[]{r_101, term}), checkListAnnos(termFactory, q_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}