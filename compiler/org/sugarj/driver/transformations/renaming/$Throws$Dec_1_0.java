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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ThrowsDec_1_0");
    Fail59:
    { 
      IStrategoTerm f_109 = null;
      IStrategoTerm e_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consThrowsDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      e_109 = term.getSubterm(0);
      IStrategoList annos49 = term.getAnnotations();
      f_109 = annos49;
      term = y_17.invoke(context, e_109);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consThrowsDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}