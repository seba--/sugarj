package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If$Then_2_0 extends Strategy 
{ 
  public static $If$Then_2_0 instance = new $If$Then_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_344, Strategy j_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThen_2_0");
    Fail921:
    { 
      IStrategoTerm g_451 = null;
      IStrategoTerm e_451 = null;
      IStrategoTerm f_451 = null;
      IStrategoTerm h_451 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consIfThen_2 != ((IStrategoAppl)term).getConstructor())
        break Fail921;
      e_451 = term.getSubterm(0);
      f_451 = term.getSubterm(1);
      IStrategoList annos166 = term.getAnnotations();
      g_451 = annos166;
      term = i_344.invoke(context, e_451);
      if(term == null)
        break Fail921;
      h_451 = term;
      term = j_344.invoke(context, f_451);
      if(term == null)
        break Fail921;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consIfThen_2, new IStrategoTerm[]{h_451, term}), checkListAnnos(termFactory, g_451));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}