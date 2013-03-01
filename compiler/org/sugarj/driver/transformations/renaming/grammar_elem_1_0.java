package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class grammar_elem_1_0 extends Strategy 
{ 
  public static grammar_elem_1_0 instance = new grammar_elem_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("grammar_elem_1_0");
    Fail26:
    { 
      IStrategoTerm x_123 = null;
      IStrategoTerm w_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consgrammar_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      w_123 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      x_123 = annos3;
      term = n_26.invoke(context, w_123);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consgrammar_elem_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}