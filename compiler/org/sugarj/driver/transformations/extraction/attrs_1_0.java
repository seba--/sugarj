package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class attrs_1_0 extends Strategy 
{ 
  public static attrs_1_0 instance = new attrs_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("attrs_1_0");
    Fail233:
    { 
      IStrategoTerm k_144 = null;
      IStrategoTerm j_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consattrs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail233;
      j_144 = term.getSubterm(0);
      IStrategoList annos193 = term.getAnnotations();
      k_144 = annos193;
      term = p_28.invoke(context, j_144);
      if(term == null)
        break Fail233;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consattrs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}