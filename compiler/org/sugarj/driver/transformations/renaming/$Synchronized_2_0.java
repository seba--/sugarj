package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Synchronized_2_0 extends Strategy 
{ 
  public static $Synchronized_2_0 instance = new $Synchronized_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_25, Strategy h_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Synchronized_2_0");
    Fail125:
    { 
      IStrategoTerm h_126 = null;
      IStrategoTerm f_126 = null;
      IStrategoTerm g_126 = null;
      IStrategoTerm i_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSynchronized_2 != ((IStrategoAppl)term).getConstructor())
        break Fail125;
      f_126 = term.getSubterm(0);
      g_126 = term.getSubterm(1);
      IStrategoList annos103 = term.getAnnotations();
      h_126 = annos103;
      term = g_25.invoke(context, f_126);
      if(term == null)
        break Fail125;
      i_126 = term;
      term = h_25.invoke(context, g_126);
      if(term == null)
        break Fail125;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSynchronized_2, new IStrategoTerm[]{i_126, term}), checkListAnnos(termFactory, h_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}