package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_14, Strategy e_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail64:
    { 
      IStrategoTerm r_101 = null;
      IStrategoTerm p_101 = null;
      IStrategoTerm q_101 = null;
      IStrategoTerm s_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      p_101 = term.getSubterm(0);
      q_101 = term.getSubterm(1);
      IStrategoList annos55 = term.getAnnotations();
      r_101 = annos55;
      term = d_14.invoke(context, p_101);
      if(term == null)
        break Fail64;
      s_101 = term;
      term = e_14.invoke(context, q_101);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssign_2, new IStrategoTerm[]{s_101, term}), checkListAnnos(termFactory, r_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}