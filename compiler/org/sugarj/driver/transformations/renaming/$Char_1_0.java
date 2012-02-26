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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Char_1_0");
    Fail188:
    { 
      IStrategoTerm x_134 = null;
      IStrategoTerm r_134 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consChar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail188;
      r_134 = term.getSubterm(0);
      IStrategoList annos160 = term.getAnnotations();
      x_134 = annos160;
      term = l_26.invoke(context, r_134);
      if(term == null)
        break Fail188;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consChar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_134));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}