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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_19, Strategy h_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Synchronized_2_0");
    Fail74:
    { 
      IStrategoTerm v_112 = null;
      IStrategoTerm t_112 = null;
      IStrategoTerm u_112 = null;
      IStrategoTerm w_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSynchronized_2 != ((IStrategoAppl)term).getConstructor())
        break Fail74;
      t_112 = term.getSubterm(0);
      u_112 = term.getSubterm(1);
      IStrategoList annos62 = term.getAnnotations();
      v_112 = annos62;
      term = g_19.invoke(context, t_112);
      if(term == null)
        break Fail74;
      w_112 = term;
      term = h_19.invoke(context, u_112);
      if(term == null)
        break Fail74;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSynchronized_2, new IStrategoTerm[]{w_112, term}), checkListAnnos(termFactory, v_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}