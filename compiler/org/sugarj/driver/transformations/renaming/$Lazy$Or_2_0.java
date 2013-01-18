package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lazy$Or_2_0 extends Strategy 
{ 
  public static $Lazy$Or_2_0 instance = new $Lazy$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_36, Strategy l_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LazyOr_2_0");
    Fail157:
    { 
      IStrategoTerm g_160 = null;
      IStrategoTerm e_160 = null;
      IStrategoTerm f_160 = null;
      IStrategoTerm h_160 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLazyOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail157;
      e_160 = term.getSubterm(0);
      f_160 = term.getSubterm(1);
      IStrategoList annos127 = term.getAnnotations();
      g_160 = annos127;
      term = k_36.invoke(context, e_160);
      if(term == null)
        break Fail157;
      h_160 = term;
      term = l_36.invoke(context, f_160);
      if(term == null)
        break Fail157;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLazyOr_2, new IStrategoTerm[]{h_160, term}), checkListAnnos(termFactory, g_160));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}