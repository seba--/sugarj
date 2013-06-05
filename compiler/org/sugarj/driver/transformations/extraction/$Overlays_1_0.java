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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlays_1_0");
    Fail67:
    { 
      IStrategoTerm x_109 = null;
      IStrategoTerm w_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consOverlays_1 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      w_109 = term.getSubterm(0);
      IStrategoList annos40 = term.getAnnotations();
      x_109 = annos40;
      term = m_18.invoke(context, w_109);
      if(term == null)
        break Fail67;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consOverlays_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}