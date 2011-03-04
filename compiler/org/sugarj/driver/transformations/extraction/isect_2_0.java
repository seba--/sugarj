package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class isect_2_0 extends Strategy 
{ 
  public static isect_2_0 instance = new isect_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_25, Strategy v_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("isect_2_0");
    Fail174:
    { 
      IStrategoTerm t_131 = null;
      IStrategoTerm q_131 = null;
      IStrategoTerm s_131 = null;
      IStrategoTerm v_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consisect_2 != ((IStrategoAppl)term).getConstructor())
        break Fail174;
      q_131 = term.getSubterm(0);
      s_131 = term.getSubterm(1);
      IStrategoList annos146 = term.getAnnotations();
      t_131 = annos146;
      term = u_25.invoke(context, q_131);
      if(term == null)
        break Fail174;
      v_131 = term;
      term = v_25.invoke(context, s_131);
      if(term == null)
        break Fail174;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consisect_2, new IStrategoTerm[]{v_131, term}), checkListAnnos(termFactory, t_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}