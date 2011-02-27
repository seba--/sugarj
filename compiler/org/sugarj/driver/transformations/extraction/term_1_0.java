package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class term_1_0 extends Strategy 
{ 
  public static term_1_0 instance = new term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("term_1_0");
    Fail240:
    { 
      IStrategoTerm v_144 = null;
      IStrategoTerm u_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consterm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail240;
      u_144 = term.getSubterm(0);
      IStrategoList annos196 = term.getAnnotations();
      v_144 = annos196;
      term = s_28.invoke(context, u_144);
      if(term == null)
        break Fail240;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consterm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}