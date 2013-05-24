package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_333)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlays_1_0");
    Fail734:
    { 
      IStrategoTerm l_424 = null;
      IStrategoTerm k_424 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOverlays_1 != ((IStrategoAppl)term).getConstructor())
        break Fail734;
      k_424 = term.getSubterm(0);
      IStrategoList annos6 = term.getAnnotations();
      l_424 = annos6;
      term = w_333.invoke(context, k_424);
      if(term == null)
        break Fail734;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOverlays_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_424));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}