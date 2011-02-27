package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lit_1_0 extends Strategy 
{ 
  public static lit_1_0 instance = new lit_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lit_1_0");
    Fail214:
    { 
      IStrategoTerm j_139 = null;
      IStrategoTerm i_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conslit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail214;
      i_139 = term.getSubterm(0);
      IStrategoList annos176 = term.getAnnotations();
      j_139 = annos176;
      term = n_27.invoke(context, i_139);
      if(term == null)
        break Fail214;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conslit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}