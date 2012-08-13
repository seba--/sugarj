package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Throws$Dec_1_0 extends Strategy 
{ 
  public static $Throws$Dec_1_0 instance = new $Throws$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ThrowsDec_1_0");
    Fail110:
    { 
      IStrategoTerm s_122 = null;
      IStrategoTerm r_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consThrowsDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail110;
      r_122 = term.getSubterm(0);
      IStrategoList annos90 = term.getAnnotations();
      s_122 = annos90;
      term = y_23.invoke(context, r_122);
      if(term == null)
        break Fail110;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consThrowsDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}