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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeImportDec_1_0");
    Fail13:
    { 
      IStrategoTerm d_99 = null;
      IStrategoTerm c_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeImportDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail13;
      c_99 = term.getSubterm(0);
      IStrategoList annos4 = term.getAnnotations();
      d_99 = annos4;
      term = a_14.invoke(context, c_99);
      if(term == null)
        break Fail13;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeImportDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}