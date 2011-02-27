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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("syntax_1_0");
    Fail257:
    { 
      IStrategoTerm d_148 = null;
      IStrategoTerm c_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conssyntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail257;
      c_148 = term.getSubterm(0);
      IStrategoList annos213 = term.getAnnotations();
      d_148 = annos213;
      term = j_29.invoke(context, c_148);
      if(term == null)
        break Fail257;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conssyntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}