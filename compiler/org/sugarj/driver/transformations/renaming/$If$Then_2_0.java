package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_14, Strategy h_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThen_2_0");
    Fail69:
    { 
      IStrategoTerm h_102 = null;
      IStrategoTerm f_102 = null;
      IStrategoTerm g_102 = null;
      IStrategoTerm i_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consIfThen_2 != ((IStrategoAppl)term).getConstructor())
        break Fail69;
      f_102 = term.getSubterm(0);
      g_102 = term.getSubterm(1);
      IStrategoList annos59 = term.getAnnotations();
      h_102 = annos59;
      term = g_14.invoke(context, f_102);
      if(term == null)
        break Fail69;
      i_102 = term;
      term = h_14.invoke(context, g_102);
      if(term == null)
        break Fail69;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consIfThen_2, new IStrategoTerm[]{i_102, term}), checkListAnnos(termFactory, h_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}