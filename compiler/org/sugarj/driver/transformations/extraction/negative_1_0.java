package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class negative_1_0 extends Strategy 
{ 
  public static negative_1_0 instance = new negative_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("negative_1_0");
    Fail1068:
    { 
      IStrategoTerm k_471 = null;
      IStrategoTerm j_471 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consnegative_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1068;
      j_471 = term.getSubterm(0);
      IStrategoList annos293 = term.getAnnotations();
      k_471 = annos293;
      term = z_351.invoke(context, j_471);
      if(term == null)
        break Fail1068;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consnegative_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_471));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}