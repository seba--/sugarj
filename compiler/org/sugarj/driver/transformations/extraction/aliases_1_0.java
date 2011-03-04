package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aliases_1_0 extends Strategy 
{ 
  public static aliases_1_0 instance = new aliases_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aliases_1_0");
    Fail246:
    { 
      IStrategoTerm c_146 = null;
      IStrategoTerm a_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consaliases_1 != ((IStrategoAppl)term).getConstructor())
        break Fail246;
      a_146 = term.getSubterm(0);
      IStrategoList annos201 = term.getAnnotations();
      c_146 = annos201;
      term = x_28.invoke(context, a_146);
      if(term == null)
        break Fail246;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consaliases_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}