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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("syntax_1_0");
    Fail270:
    { 
      IStrategoTerm l_148 = null;
      IStrategoTerm k_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conssyntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail270;
      k_148 = term.getSubterm(0);
      IStrategoList annos222 = term.getAnnotations();
      l_148 = annos222;
      term = k_29.invoke(context, k_148);
      if(term == null)
        break Fail270;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conssyntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}