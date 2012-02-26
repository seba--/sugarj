package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Octa_1_0 extends Strategy 
{ 
  public static $Octa_1_0 instance = new $Octa_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Octa_1_0");
    Fail193:
    { 
      IStrategoTerm s_135 = null;
      IStrategoTerm p_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consOcta_1 != ((IStrategoAppl)term).getConstructor())
        break Fail193;
      p_135 = term.getSubterm(0);
      IStrategoList annos163 = term.getAnnotations();
      s_135 = annos163;
      term = o_26.invoke(context, p_135);
      if(term == null)
        break Fail193;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consOcta_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}