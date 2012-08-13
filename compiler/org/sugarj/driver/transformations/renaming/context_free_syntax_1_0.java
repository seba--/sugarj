package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class context_free_syntax_1_0 extends Strategy 
{ 
  public static context_free_syntax_1_0 instance = new context_free_syntax_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_syntax_1_0");
    Fail42:
    { 
      IStrategoTerm k_108 = null;
      IStrategoTerm j_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._conscontext_free_syntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      j_108 = term.getSubterm(0);
      IStrategoList annos24 = term.getAnnotations();
      k_108 = annos24;
      term = u_18.invoke(context, j_108);
      if(term == null)
        break Fail42;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._conscontext_free_syntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}