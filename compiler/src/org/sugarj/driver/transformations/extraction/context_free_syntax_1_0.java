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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_syntax_1_0");
    Fail268:
    { 
      IStrategoTerm f_148 = null;
      IStrategoTerm e_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conscontext_free_syntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail268;
      e_148 = term.getSubterm(0);
      IStrategoList annos220 = term.getAnnotations();
      f_148 = annos220;
      term = i_29.invoke(context, e_148);
      if(term == null)
        break Fail268;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conscontext_free_syntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}