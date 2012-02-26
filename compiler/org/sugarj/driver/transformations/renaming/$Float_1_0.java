package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Float_1_0 extends Strategy 
{ 
  public static $Float_1_0 instance = new $Float_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Float_1_0");
    Fail192:
    { 
      IStrategoTerm k_135 = null;
      IStrategoTerm i_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFloat_1 != ((IStrategoAppl)term).getConstructor())
        break Fail192;
      i_135 = term.getSubterm(0);
      IStrategoList annos162 = term.getAnnotations();
      k_135 = annos162;
      term = n_26.invoke(context, i_135);
      if(term == null)
        break Fail192;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFloat_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}