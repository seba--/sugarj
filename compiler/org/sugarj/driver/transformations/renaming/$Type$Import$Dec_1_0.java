package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Import$Dec_1_0 extends Strategy 
{ 
  public static $Type$Import$Dec_1_0 instance = new $Type$Import$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeImportDec_1_0");
    Fail64:
    { 
      IStrategoTerm c_112 = null;
      IStrategoTerm b_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeImportDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      b_112 = term.getSubterm(0);
      IStrategoList annos45 = term.getAnnotations();
      c_112 = annos45;
      term = a_20.invoke(context, b_112);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeImportDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}