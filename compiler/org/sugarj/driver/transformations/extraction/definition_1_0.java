package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class definition_1_0 extends Strategy 
{ 
  public static definition_1_0 instance = new definition_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("definition_1_0");
    Fail1081:
    { 
      IStrategoTerm w_472 = null;
      IStrategoTerm v_472 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consdefinition_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1081;
      v_472 = term.getSubterm(0);
      IStrategoList annos303 = term.getAnnotations();
      w_472 = annos303;
      term = n_352.invoke(context, v_472);
      if(term == null)
        break Fail1081;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consdefinition_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_472));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}