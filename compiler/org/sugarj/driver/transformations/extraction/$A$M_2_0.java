package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_341, Strategy v_341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AM_2_0");
    Fail881:
    { 
      IStrategoTerm r_444 = null;
      IStrategoTerm p_444 = null;
      IStrategoTerm q_444 = null;
      IStrategoTerm s_444 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAM_2 != ((IStrategoAppl)term).getConstructor())
        break Fail881;
      p_444 = term.getSubterm(0);
      q_444 = term.getSubterm(1);
      IStrategoList annos127 = term.getAnnotations();
      r_444 = annos127;
      term = u_341.invoke(context, p_444);
      if(term == null)
        break Fail881;
      s_444 = term;
      term = v_341.invoke(context, q_444);
      if(term == null)
        break Fail881;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAM_2, new IStrategoTerm[]{s_444, term}), checkListAnnos(termFactory, r_444));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}