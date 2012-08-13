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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Chars_1_0");
    Fail233:
    { 
      IStrategoTerm v_150 = null;
      IStrategoTerm u_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consChars_1 != ((IStrategoAppl)term).getConstructor())
        break Fail233;
      u_150 = term.getSubterm(0);
      IStrategoList annos198 = term.getAnnotations();
      v_150 = annos198;
      term = t_31.invoke(context, u_150);
      if(term == null)
        break Fail233;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consChars_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}