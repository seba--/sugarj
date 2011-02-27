package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $All_1_0 extends Strategy 
{ 
  public static $All_1_0 instance = new $All_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("All_1_0");
    Fail112:
    { 
      IStrategoTerm s_120 = null;
      IStrategoTerm r_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consAll_1 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      r_120 = term.getSubterm(0);
      IStrategoList annos88 = term.getAnnotations();
      s_120 = annos88;
      term = k_22.invoke(context, r_120);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consAll_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}