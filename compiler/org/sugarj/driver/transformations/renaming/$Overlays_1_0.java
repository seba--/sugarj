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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlays_1_0");
    Fail29:
    { 
      IStrategoTerm r_106 = null;
      IStrategoTerm q_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consOverlays_1 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      q_106 = term.getSubterm(0);
      IStrategoList annos11 = term.getAnnotations();
      r_106 = annos11;
      term = h_18.invoke(context, q_106);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consOverlays_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}