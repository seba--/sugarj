package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Overlays_1_0 extends Strategy 
{ 
  public static $Overlays_1_0 instance = new $Overlays_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlays_1_0");
    Fail279:
    { 
      IStrategoTerm g_181 = null;
      IStrategoTerm y_180 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOverlays_1 != ((IStrategoAppl)term).getConstructor())
        break Fail279;
      y_180 = term.getSubterm(0);
      IStrategoList annos226 = term.getAnnotations();
      g_181 = annos226;
      term = u_42.invoke(context, y_180);
      if(term == null)
        break Fail279;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOverlays_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_181));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}