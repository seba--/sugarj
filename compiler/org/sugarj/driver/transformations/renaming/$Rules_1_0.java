package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rules_1_0");
    Fail43:
    { 
      IStrategoTerm h_96 = null;
      IStrategoTerm g_96 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      g_96 = term.getSubterm(0);
      IStrategoList annos33 = term.getAnnotations();
      h_96 = annos33;
      term = c_12.invoke(context, g_96);
      if(term == null)
        break Fail43;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_96));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}