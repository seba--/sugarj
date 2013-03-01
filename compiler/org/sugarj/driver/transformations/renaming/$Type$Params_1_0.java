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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeParams_1_0");
    Fail196:
    { 
      IStrategoTerm r_169 = null;
      IStrategoTerm q_169 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTypeParams_1 != ((IStrategoAppl)term).getConstructor())
        break Fail196;
      q_169 = term.getSubterm(0);
      IStrategoList annos165 = term.getAnnotations();
      r_169 = annos165;
      term = d_39.invoke(context, q_169);
      if(term == null)
        break Fail196;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTypeParams_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_169));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}