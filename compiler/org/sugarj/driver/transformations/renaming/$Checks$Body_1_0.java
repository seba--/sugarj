package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Checks$Body_1_0 extends Strategy 
{ 
  public static $Checks$Body_1_0 instance = new $Checks$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ChecksBody_1_0");
    Fail40:
    { 
      IStrategoTerm w_126 = null;
      IStrategoTerm v_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consChecksBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      v_126 = term.getSubterm(0);
      IStrategoList annos17 = term.getAnnotations();
      w_126 = annos17;
      term = n_27.invoke(context, v_126);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consChecksBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}