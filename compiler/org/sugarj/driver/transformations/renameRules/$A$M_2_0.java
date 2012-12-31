package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $A$M_2_0 extends Strategy 
{ 
  public static $A$M_2_0 instance = new $A$M_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_14, Strategy b_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AM_2_0");
    Fail62:
    { 
      IStrategoTerm r_101 = null;
      IStrategoTerm p_101 = null;
      IStrategoTerm q_101 = null;
      IStrategoTerm s_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAM_2 != ((IStrategoAppl)term).getConstructor())
        break Fail62;
      p_101 = term.getSubterm(0);
      q_101 = term.getSubterm(1);
      IStrategoList annos56 = term.getAnnotations();
      r_101 = annos56;
      term = a_14.invoke(context, p_101);
      if(term == null)
        break Fail62;
      s_101 = term;
      term = b_14.invoke(context, q_101);
      if(term == null)
        break Fail62;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAM_2, new IStrategoTerm[]{s_101, term}), checkListAnnos(termFactory, r_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}