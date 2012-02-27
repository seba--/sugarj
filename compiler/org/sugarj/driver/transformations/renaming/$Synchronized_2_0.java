package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Synchronized_2_0 extends Strategy 
{ 
  public static $Synchronized_2_0 instance = new $Synchronized_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_20, Strategy e_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Synchronized_2_0");
    Fail79:
    { 
      IStrategoTerm v_113 = null;
      IStrategoTerm t_113 = null;
      IStrategoTerm u_113 = null;
      IStrategoTerm w_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSynchronized_2 != ((IStrategoAppl)term).getConstructor())
        break Fail79;
      t_113 = term.getSubterm(0);
      u_113 = term.getSubterm(1);
      IStrategoList annos62 = term.getAnnotations();
      v_113 = annos62;
      term = d_20.invoke(context, t_113);
      if(term == null)
        break Fail79;
      w_113 = term;
      term = e_20.invoke(context, u_113);
      if(term == null)
        break Fail79;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSynchronized_2, new IStrategoTerm[]{w_113, term}), checkListAnnos(termFactory, v_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}