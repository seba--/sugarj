package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class ci_lit_1_0 extends Strategy 
{ 
  public static ci_lit_1_0 instance = new ci_lit_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ci_lit_1_0");
    Fail225:
    { 
      IStrategoTerm j_139 = null;
      IStrategoTerm i_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consci_lit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail225;
      i_139 = term.getSubterm(0);
      IStrategoList annos183 = term.getAnnotations();
      j_139 = annos183;
      term = l_27.invoke(context, i_139);
      if(term == null)
        break Fail225;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consci_lit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}