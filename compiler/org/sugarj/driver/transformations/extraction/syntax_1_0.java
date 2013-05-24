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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("syntax_1_0");
    Fail739:
    { 
      IStrategoTerm c_425 = null;
      IStrategoTerm b_425 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conssyntax_1 != ((IStrategoAppl)term).getConstructor())
        break Fail739;
      b_425 = term.getSubterm(0);
      IStrategoList annos11 = term.getAnnotations();
      c_425 = annos11;
      term = c_334.invoke(context, b_425);
      if(term == null)
        break Fail739;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conssyntax_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_425));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}