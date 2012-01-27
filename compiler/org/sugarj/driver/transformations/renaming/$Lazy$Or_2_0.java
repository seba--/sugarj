package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lazy$Or_2_0 extends Strategy 
{ 
  public static $Lazy$Or_2_0 instance = new $Lazy$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_22, Strategy d_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LazyOr_2_0");
    Fail116:
    { 
      IStrategoTerm r_120 = null;
      IStrategoTerm p_120 = null;
      IStrategoTerm q_120 = null;
      IStrategoTerm s_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLazyOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail116;
      p_120 = term.getSubterm(0);
      q_120 = term.getSubterm(1);
      IStrategoList annos101 = term.getAnnotations();
      r_120 = annos101;
      term = c_22.invoke(context, p_120);
      if(term == null)
        break Fail116;
      s_120 = term;
      term = d_22.invoke(context, q_120);
      if(term == null)
        break Fail116;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLazyOr_2, new IStrategoTerm[]{s_120, term}), checkListAnnos(termFactory, r_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}