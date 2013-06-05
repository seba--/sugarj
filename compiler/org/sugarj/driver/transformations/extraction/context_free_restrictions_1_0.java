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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_restrictions_1_0");
    Fail253:
    { 
      IStrategoTerm d_145 = null;
      IStrategoTerm c_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conscontext_free_restrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail253;
      c_145 = term.getSubterm(0);
      IStrategoList annos205 = term.getAnnotations();
      d_145 = annos205;
      term = s_28.invoke(context, c_145);
      if(term == null)
        break Fail253;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conscontext_free_restrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}