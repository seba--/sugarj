package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Checks$Body_1_0 extends Strategy 
{ 
  public static $Checks$Body_1_0 instance = new $Checks$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ChecksBody_1_0");
    Fail54:
    { 
      IStrategoTerm h_110 = null;
      IStrategoTerm g_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consChecksBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      g_110 = term.getSubterm(0);
      IStrategoList annos36 = term.getAnnotations();
      h_110 = annos36;
      term = l_19.invoke(context, g_110);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consChecksBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}