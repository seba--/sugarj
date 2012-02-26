package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lazy$And_2_0 extends Strategy 
{ 
  public static $Lazy$And_2_0 instance = new $Lazy$And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_22, Strategy u_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LazyAnd_2_0");
    Fail120:
    { 
      IStrategoTerm q_121 = null;
      IStrategoTerm o_121 = null;
      IStrategoTerm p_121 = null;
      IStrategoTerm s_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLazyAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail120;
      o_121 = term.getSubterm(0);
      p_121 = term.getSubterm(1);
      IStrategoList annos102 = term.getAnnotations();
      q_121 = annos102;
      term = t_22.invoke(context, o_121);
      if(term == null)
        break Fail120;
      s_121 = term;
      term = u_22.invoke(context, p_121);
      if(term == null)
        break Fail120;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLazyAnd_2, new IStrategoTerm[]{s_121, term}), checkListAnnos(termFactory, q_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}