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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlays_1_0");
    Fail42:
    { 
      IStrategoTerm e_96 = null;
      IStrategoTerm d_96 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOverlays_1 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      d_96 = term.getSubterm(0);
      IStrategoList annos32 = term.getAnnotations();
      e_96 = annos32;
      term = b_12.invoke(context, d_96);
      if(term == null)
        break Fail42;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOverlays_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_96));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}