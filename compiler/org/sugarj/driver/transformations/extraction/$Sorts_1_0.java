package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sorts_1_0 extends Strategy 
{ 
  public static $Sorts_1_0 instance = new $Sorts_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sorts_1_0");
    Fail142:
    { 
      IStrategoTerm z_125 = null;
      IStrategoTerm y_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSorts_1 != ((IStrategoAppl)term).getConstructor())
        break Fail142;
      y_125 = term.getSubterm(0);
      IStrategoList annos115 = term.getAnnotations();
      z_125 = annos115;
      term = d_24.invoke(context, y_125);
      if(term == null)
        break Fail142;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSorts_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}