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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_syntax_1_0");
    Fail267:
    { 
      IStrategoTerm a_148 = null;
      IStrategoTerm z_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conscontext_free_syntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail267;
      z_147 = term.getSubterm(0);
      IStrategoList annos219 = term.getAnnotations();
      a_148 = annos219;
      term = g_29.invoke(context, z_147);
      if(term == null)
        break Fail267;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conscontext_free_syntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}