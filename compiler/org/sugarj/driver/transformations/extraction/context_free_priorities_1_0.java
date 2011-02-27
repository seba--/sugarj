package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_priorities_1_0");
    Fail243:
    { 
      IStrategoTerm u_145 = null;
      IStrategoTerm t_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conscontext_free_priorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail243;
      t_145 = term.getSubterm(0);
      IStrategoList annos199 = term.getAnnotations();
      u_145 = annos199;
      term = v_28.invoke(context, t_145);
      if(term == null)
        break Fail243;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conscontext_free_priorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}