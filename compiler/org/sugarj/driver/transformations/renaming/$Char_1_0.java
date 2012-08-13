package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Char_1_0 extends Strategy 
{ 
  public static $Char_1_0 instance = new $Char_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Char_1_0");
    Fail236:
    { 
      IStrategoTerm g_151 = null;
      IStrategoTerm f_151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consChar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail236;
      f_151 = term.getSubterm(0);
      IStrategoList annos201 = term.getAnnotations();
      g_151 = annos201;
      term = w_31.invoke(context, f_151);
      if(term == null)
        break Fail236;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consChar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}