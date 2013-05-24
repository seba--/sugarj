package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class renamings_1_0 extends Strategy 
{ 
  public static renamings_1_0 instance = new renamings_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("renamings_1_0");
    Fail1046:
    { 
      IStrategoTerm k_468 = null;
      IStrategoTerm j_468 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consrenamings_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1046;
      j_468 = term.getSubterm(0);
      IStrategoList annos273 = term.getAnnotations();
      k_468 = annos273;
      term = w_350.invoke(context, j_468);
      if(term == null)
        break Fail1046;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consrenamings_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_468));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}