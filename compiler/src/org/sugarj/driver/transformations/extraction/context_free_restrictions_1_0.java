package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class context_free_restrictions_1_0 extends Strategy 
{ 
  public static context_free_restrictions_1_0 instance = new context_free_restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_restrictions_1_0");
    Fail242:
    { 
      IStrategoTerm a_145 = null;
      IStrategoTerm z_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conscontext_free_restrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail242;
      z_144 = term.getSubterm(0);
      IStrategoList annos197 = term.getAnnotations();
      a_145 = annos197;
      term = t_28.invoke(context, z_144);
      if(term == null)
        break Fail242;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conscontext_free_restrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}