package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Rule_1_0 extends Strategy 
{ 
  public static $S$Rule_1_0 instance = new $S$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SRule_1_0");
    Fail86:
    { 
      IStrategoTerm s_116 = null;
      IStrategoTerm r_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail86;
      r_116 = term.getSubterm(0);
      IStrategoList annos63 = term.getAnnotations();
      s_116 = annos63;
      term = b_21.invoke(context, r_116);
      if(term == null)
        break Fail86;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}