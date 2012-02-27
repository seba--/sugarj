package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Chars_1_0 extends Strategy 
{ 
  public static $Chars_1_0 instance = new $Chars_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Chars_1_0");
    Fail187:
    { 
      IStrategoTerm r_134 = null;
      IStrategoTerm q_134 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consChars_1 != ((IStrategoAppl)term).getConstructor())
        break Fail187;
      q_134 = term.getSubterm(0);
      IStrategoList annos157 = term.getAnnotations();
      r_134 = annos157;
      term = q_26.invoke(context, q_134);
      if(term == null)
        break Fail187;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consChars_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_134));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}