package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class syntax_1_0 extends Strategy 
{ 
  public static syntax_1_0 instance = new syntax_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("syntax_1_0");
    Fail269:
    { 
      IStrategoTerm g_148 = null;
      IStrategoTerm f_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conssyntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail269;
      f_148 = term.getSubterm(0);
      IStrategoList annos221 = term.getAnnotations();
      g_148 = annos221;
      term = i_29.invoke(context, f_148);
      if(term == null)
        break Fail269;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conssyntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}