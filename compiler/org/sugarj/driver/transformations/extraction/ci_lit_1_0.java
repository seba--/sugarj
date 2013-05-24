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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ci_lit_1_0");
    Fail1001:
    { 
      IStrategoTerm z_462 = null;
      IStrategoTerm y_462 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consci_lit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1001;
      y_462 = term.getSubterm(0);
      IStrategoList annos238 = term.getAnnotations();
      z_462 = annos238;
      term = v_348.invoke(context, y_462);
      if(term == null)
        break Fail1001;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consci_lit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_462));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}