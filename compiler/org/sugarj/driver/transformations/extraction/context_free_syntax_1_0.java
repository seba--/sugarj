package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_syntax_1_0");
    Fail741:
    { 
      IStrategoTerm i_425 = null;
      IStrategoTerm h_425 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conscontext_free_syntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail741;
      h_425 = term.getSubterm(0);
      IStrategoList annos13 = term.getAnnotations();
      i_425 = annos13;
      term = e_334.invoke(context, h_425);
      if(term == null)
        break Fail741;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conscontext_free_syntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_425));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}