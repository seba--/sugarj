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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_20, Strategy q_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperMethod_2_0");
    Fail72:
    { 
      IStrategoTerm s_113 = null;
      IStrategoTerm q_113 = null;
      IStrategoTerm r_113 = null;
      IStrategoTerm t_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperMethod_2 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      q_113 = term.getSubterm(0);
      r_113 = term.getSubterm(1);
      IStrategoList annos53 = term.getAnnotations();
      s_113 = annos53;
      term = p_20.invoke(context, q_113);
      if(term == null)
        break Fail72;
      t_113 = term;
      term = q_20.invoke(context, r_113);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperMethod_2, new IStrategoTerm[]{t_113, term}), checkListAnnos(termFactory, s_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}