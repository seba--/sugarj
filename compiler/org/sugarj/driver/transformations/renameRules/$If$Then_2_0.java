package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_14, Strategy i_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThen_2_0");
    Fail65:
    { 
      IStrategoTerm i_102 = null;
      IStrategoTerm g_102 = null;
      IStrategoTerm h_102 = null;
      IStrategoTerm j_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consIfThen_2 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      g_102 = term.getSubterm(0);
      h_102 = term.getSubterm(1);
      IStrategoList annos59 = term.getAnnotations();
      i_102 = annos59;
      term = h_14.invoke(context, g_102);
      if(term == null)
        break Fail65;
      j_102 = term;
      term = i_14.invoke(context, h_102);
      if(term == null)
        break Fail65;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consIfThen_2, new IStrategoTerm[]{j_102, term}), checkListAnnos(termFactory, i_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}