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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_priorities_1_0");
    Fail256:
    { 
      IStrategoTerm e_146 = null;
      IStrategoTerm c_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conscontext_free_priorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail256;
      c_146 = term.getSubterm(0);
      IStrategoList annos208 = term.getAnnotations();
      e_146 = annos208;
      term = w_28.invoke(context, c_146);
      if(term == null)
        break Fail256;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conscontext_free_priorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}