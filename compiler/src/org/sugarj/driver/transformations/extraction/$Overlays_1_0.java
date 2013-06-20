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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlays_1_0");
    Fail68:
    { 
      IStrategoTerm c_110 = null;
      IStrategoTerm b_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consOverlays_1 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      b_110 = term.getSubterm(0);
      IStrategoList annos41 = term.getAnnotations();
      c_110 = annos41;
      term = o_18.invoke(context, b_110);
      if(term == null)
        break Fail68;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consOverlays_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}