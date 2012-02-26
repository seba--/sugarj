package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Or_2_0 extends Strategy 
{ 
  public static $Or_2_0 instance = new $Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_22, Strategy m_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Or_2_0");
    Fail116:
    { 
      IStrategoTerm s_120 = null;
      IStrategoTerm q_120 = null;
      IStrategoTerm r_120 = null;
      IStrategoTerm t_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail116;
      q_120 = term.getSubterm(0);
      r_120 = term.getSubterm(1);
      IStrategoList annos98 = term.getAnnotations();
      s_120 = annos98;
      term = l_22.invoke(context, q_120);
      if(term == null)
        break Fail116;
      t_120 = term;
      term = m_22.invoke(context, r_120);
      if(term == null)
        break Fail116;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consOr_2, new IStrategoTerm[]{t_120, term}), checkListAnnos(termFactory, s_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}