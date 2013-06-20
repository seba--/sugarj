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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ci_lit_1_0");
    Fail226:
    { 
      IStrategoTerm a_140 = null;
      IStrategoTerm z_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consci_lit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail226;
      z_139 = term.getSubterm(0);
      IStrategoList annos184 = term.getAnnotations();
      a_140 = annos184;
      term = n_27.invoke(context, z_139);
      if(term == null)
        break Fail226;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consci_lit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}