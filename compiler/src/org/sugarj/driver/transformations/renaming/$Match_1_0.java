package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Match_1_0 extends Strategy 
{ 
  public static $Match_1_0 instance = new $Match_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Match_1_0");
    Fail105:
    { 
      IStrategoTerm r_108 = null;
      IStrategoTerm q_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMatch_1 != ((IStrategoAppl)term).getConstructor())
        break Fail105;
      q_108 = term.getSubterm(0);
      IStrategoList annos95 = term.getAnnotations();
      r_108 = annos95;
      term = r_16.invoke(context, q_108);
      if(term == null)
        break Fail105;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMatch_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}