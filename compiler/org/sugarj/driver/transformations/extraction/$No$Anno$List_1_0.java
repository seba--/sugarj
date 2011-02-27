package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $No$Anno$List_1_0 extends Strategy 
{ 
  public static $No$Anno$List_1_0 instance = new $No$Anno$List_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NoAnnoList_1_0");
    Fail145:
    { 
      IStrategoTerm k_126 = null;
      IStrategoTerm j_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consNoAnnoList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail145;
      j_126 = term.getSubterm(0);
      IStrategoList annos118 = term.getAnnotations();
      k_126 = annos118;
      term = h_24.invoke(context, j_126);
      if(term == null)
        break Fail145;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consNoAnnoList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}