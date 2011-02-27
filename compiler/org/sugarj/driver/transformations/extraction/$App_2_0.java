package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $App_2_0 extends Strategy 
{ 
  public static $App_2_0 instance = new $App_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_24, Strategy g_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("App_2_0");
    Fail144:
    { 
      IStrategoTerm g_126 = null;
      IStrategoTerm e_126 = null;
      IStrategoTerm f_126 = null;
      IStrategoTerm h_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail144;
      e_126 = term.getSubterm(0);
      f_126 = term.getSubterm(1);
      IStrategoList annos117 = term.getAnnotations();
      g_126 = annos117;
      term = f_24.invoke(context, e_126);
      if(term == null)
        break Fail144;
      h_126 = term;
      term = g_24.invoke(context, f_126);
      if(term == null)
        break Fail144;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consApp_2, new IStrategoTerm[]{h_126, term}), checkListAnnos(termFactory, g_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}