package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rules_1_0");
    Fail39:
    { 
      IStrategoTerm i_96 = null;
      IStrategoTerm h_96 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      h_96 = term.getSubterm(0);
      IStrategoList annos33 = term.getAnnotations();
      i_96 = annos33;
      term = d_12.invoke(context, h_96);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_96));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}