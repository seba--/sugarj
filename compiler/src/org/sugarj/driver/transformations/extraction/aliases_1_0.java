package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aliases_1_0 extends Strategy 
{ 
  public static aliases_1_0 instance = new aliases_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aliases_1_0");
    Fail258:
    { 
      IStrategoTerm k_146 = null;
      IStrategoTerm j_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consaliases_1 != ((IStrategoAppl)term).getConstructor())
        break Fail258;
      j_146 = term.getSubterm(0);
      IStrategoList annos210 = term.getAnnotations();
      k_146 = annos210;
      term = y_28.invoke(context, j_146);
      if(term == null)
        break Fail258;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consaliases_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}