package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Params_1_0 extends Strategy 
{ 
  public static $Type$Params_1_0 instance = new $Type$Params_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeParams_1_0");
    Fail160:
    { 
      IStrategoTerm r_129 = null;
      IStrategoTerm q_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeParams_1 != ((IStrategoAppl)term).getConstructor())
        break Fail160;
      q_129 = term.getSubterm(0);
      IStrategoList annos139 = term.getAnnotations();
      r_129 = annos139;
      term = s_25.invoke(context, q_129);
      if(term == null)
        break Fail160;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeParams_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}