package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class variables_1_0 extends Strategy 
{ 
  public static variables_1_0 instance = new variables_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("variables_1_0");
    Fail41:
    { 
      IStrategoTerm h_108 = null;
      IStrategoTerm g_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consvariables_1 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      g_108 = term.getSubterm(0);
      IStrategoList annos23 = term.getAnnotations();
      h_108 = annos23;
      term = t_18.invoke(context, g_108);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consvariables_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}