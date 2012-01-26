package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pre$Decr_1_0 extends Strategy 
{ 
  public static $Pre$Decr_1_0 instance = new $Pre$Decr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PreDecr_1_0");
    Fail137:
    { 
      IStrategoTerm h_125 = null;
      IStrategoTerm f_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail137;
      f_125 = term.getSubterm(0);
      IStrategoList annos122 = term.getAnnotations();
      h_125 = annos122;
      term = q_23.invoke(context, f_125);
      if(term == null)
        break Fail137;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPreDecr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}