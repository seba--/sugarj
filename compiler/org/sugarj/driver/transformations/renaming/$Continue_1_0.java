package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Continue_1_0 extends Strategy 
{ 
  public static $Continue_1_0 instance = new $Continue_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Continue_1_0");
    Fail128:
    { 
      IStrategoTerm r_126 = null;
      IStrategoTerm q_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consContinue_1 != ((IStrategoAppl)term).getConstructor())
        break Fail128;
      q_126 = term.getSubterm(0);
      IStrategoList annos106 = term.getAnnotations();
      r_126 = annos106;
      term = k_25.invoke(context, q_126);
      if(term == null)
        break Fail128;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consContinue_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}