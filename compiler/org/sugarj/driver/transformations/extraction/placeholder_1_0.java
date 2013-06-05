package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class placeholder_1_0 extends Strategy 
{ 
  public static placeholder_1_0 instance = new placeholder_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("placeholder_1_0");
    Fail273:
    { 
      IStrategoTerm t_148 = null;
      IStrategoTerm s_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consplaceholder_1 != ((IStrategoAppl)term).getConstructor())
        break Fail273;
      s_148 = term.getSubterm(0);
      IStrategoList annos224 = term.getAnnotations();
      t_148 = annos224;
      term = n_29.invoke(context, s_148);
      if(term == null)
        break Fail273;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consplaceholder_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}