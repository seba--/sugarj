package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class char_class_1_0 extends Strategy 
{ 
  public static char_class_1_0 instance = new char_class_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("char_class_1_0");
    Fail168:
    { 
      IStrategoTerm h_130 = null;
      IStrategoTerm g_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conschar_class_1 != ((IStrategoAppl)term).getConstructor())
        break Fail168;
      g_130 = term.getSubterm(0);
      IStrategoList annos140 = term.getAnnotations();
      h_130 = annos140;
      term = n_25.invoke(context, g_130);
      if(term == null)
        break Fail168;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conschar_class_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}