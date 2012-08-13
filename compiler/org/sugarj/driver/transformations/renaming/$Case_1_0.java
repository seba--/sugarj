package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Case_1_0 extends Strategy 
{ 
  public static $Case_1_0 instance = new $Case_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Case_1_0");
    Fail120:
    { 
      IStrategoTerm h_125 = null;
      IStrategoTerm f_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCase_1 != ((IStrategoAppl)term).getConstructor())
        break Fail120;
      f_125 = term.getSubterm(0);
      IStrategoList annos98 = term.getAnnotations();
      h_125 = annos98;
      term = w_24.invoke(context, f_125);
      if(term == null)
        break Fail120;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCase_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}