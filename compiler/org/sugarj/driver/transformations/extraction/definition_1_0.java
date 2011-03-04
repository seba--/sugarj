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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("definition_1_0");
    Fail162:
    { 
      IStrategoTerm x_128 = null;
      IStrategoTerm w_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consdefinition_1 != ((IStrategoAppl)term).getConstructor())
        break Fail162;
      w_128 = term.getSubterm(0);
      IStrategoList annos134 = term.getAnnotations();
      x_128 = annos134;
      term = d_25.invoke(context, w_128);
      if(term == null)
        break Fail162;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consdefinition_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}