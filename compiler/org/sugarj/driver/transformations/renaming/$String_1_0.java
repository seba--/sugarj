package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $String_1_0 extends Strategy 
{ 
  public static $String_1_0 instance = new $String_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("String_1_0");
    Fail183:
    { 
      IStrategoTerm h_132 = null;
      IStrategoTerm g_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consString_1 != ((IStrategoAppl)term).getConstructor())
        break Fail183;
      g_132 = term.getSubterm(0);
      IStrategoList annos158 = term.getAnnotations();
      h_132 = annos158;
      term = u_25.invoke(context, g_132);
      if(term == null)
        break Fail183;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consString_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}