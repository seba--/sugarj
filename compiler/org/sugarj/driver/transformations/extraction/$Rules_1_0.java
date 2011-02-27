package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rules_1_0 extends Strategy 
{ 
  public static $Rules_1_0 instance = new $Rules_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rules_1_0");
    Fail56:
    { 
      IStrategoTerm x_109 = null;
      IStrategoTerm w_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      w_109 = term.getSubterm(0);
      IStrategoList annos33 = term.getAnnotations();
      x_109 = annos33;
      term = o_18.invoke(context, w_109);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}