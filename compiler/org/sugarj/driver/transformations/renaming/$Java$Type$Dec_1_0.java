package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Java$Type$Dec_1_0 extends Strategy 
{ 
  public static $Java$Type$Dec_1_0 instance = new $Java$Type$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("JavaTypeDec_1_0");
    Fail24:
    { 
      IStrategoTerm r_105 = null;
      IStrategoTerm p_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consJavaTypeDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      p_105 = term.getSubterm(0);
      IStrategoList annos6 = term.getAnnotations();
      r_105 = annos6;
      term = x_17.invoke(context, p_105);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consJavaTypeDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}