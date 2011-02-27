package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class assoc_1_0 extends Strategy 
{ 
  public static assoc_1_0 instance = new assoc_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_1_0");
    Fail237:
    { 
      IStrategoTerm p_144 = null;
      IStrategoTerm o_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consassoc_1 != ((IStrategoAppl)term).getConstructor())
        break Fail237;
      o_144 = term.getSubterm(0);
      IStrategoList annos194 = term.getAnnotations();
      p_144 = annos194;
      term = q_28.invoke(context, o_144);
      if(term == null)
        break Fail237;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consassoc_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}