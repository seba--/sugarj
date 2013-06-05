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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_1_0");
    Fail249:
    { 
      IStrategoTerm s_144 = null;
      IStrategoTerm r_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consassoc_1 != ((IStrategoAppl)term).getConstructor())
        break Fail249;
      r_144 = term.getSubterm(0);
      IStrategoList annos202 = term.getAnnotations();
      s_144 = annos202;
      term = p_28.invoke(context, r_144);
      if(term == null)
        break Fail249;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consassoc_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}