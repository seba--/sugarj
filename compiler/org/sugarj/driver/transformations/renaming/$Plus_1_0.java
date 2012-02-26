package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Plus_1_0 extends Strategy 
{ 
  public static $Plus_1_0 instance = new $Plus_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Plus_1_0");
    Fail143:
    { 
      IStrategoTerm g_126 = null;
      IStrategoTerm f_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPlus_1 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      f_126 = term.getSubterm(0);
      IStrategoList annos125 = term.getAnnotations();
      g_126 = annos125;
      term = i_24.invoke(context, f_126);
      if(term == null)
        break Fail143;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPlus_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}