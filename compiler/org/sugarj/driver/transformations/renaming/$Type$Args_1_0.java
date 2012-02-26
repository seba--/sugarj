package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Args_1_0 extends Strategy 
{ 
  public static $Type$Args_1_0 instance = new $Type$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeArgs_1_0");
    Fail164:
    { 
      IStrategoTerm h_130 = null;
      IStrategoTerm g_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail164;
      g_130 = term.getSubterm(0);
      IStrategoList annos145 = term.getAnnotations();
      h_130 = annos145;
      term = r_25.invoke(context, g_130);
      if(term == null)
        break Fail164;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}