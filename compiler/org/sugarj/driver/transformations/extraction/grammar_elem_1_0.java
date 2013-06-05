package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("grammar_elem_1_0");
    Fail30:
    { 
      IStrategoTerm s_102 = null;
      IStrategoTerm r_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consgrammar_elem_1 != ((IStrategoAppl)term).getConstructor())
        break Fail30;
      r_102 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      s_102 = annos3;
      term = w_15.invoke(context, r_102);
      if(term == null)
        break Fail30;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consgrammar_elem_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}