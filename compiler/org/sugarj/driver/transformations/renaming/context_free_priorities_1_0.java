package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class context_free_priorities_1_0 extends Strategy 
{ 
  public static context_free_priorities_1_0 instance = new context_free_priorities_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_priorities_1_0");
    Fail37:
    { 
      IStrategoTerm v_107 = null;
      IStrategoTerm u_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._conscontext_free_priorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      u_107 = term.getSubterm(0);
      IStrategoList annos19 = term.getAnnotations();
      v_107 = annos19;
      term = p_18.invoke(context, u_107);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._conscontext_free_priorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}