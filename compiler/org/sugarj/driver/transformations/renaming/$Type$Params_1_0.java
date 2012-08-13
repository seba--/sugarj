package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Params_1_0 extends Strategy 
{ 
  public static $Type$Params_1_0 instance = new $Type$Params_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeParams_1_0");
    Fail206:
    { 
      IStrategoTerm h_148 = null;
      IStrategoTerm g_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeParams_1 != ((IStrategoAppl)term).getConstructor())
        break Fail206;
      g_148 = term.getSubterm(0);
      IStrategoList annos180 = term.getAnnotations();
      h_148 = annos180;
      term = v_30.invoke(context, g_148);
      if(term == null)
        break Fail206;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeParams_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}