package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Remain_2_0 extends Strategy 
{ 
  public static $Remain_2_0 instance = new $Remain_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_37, Strategy l_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Remain_2_0");
    Fail170:
    { 
      IStrategoTerm h_164 = null;
      IStrategoTerm d_164 = null;
      IStrategoTerm g_164 = null;
      IStrategoTerm i_164 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRemain_2 != ((IStrategoAppl)term).getConstructor())
        break Fail170;
      d_164 = term.getSubterm(0);
      g_164 = term.getSubterm(1);
      IStrategoList annos140 = term.getAnnotations();
      h_164 = annos140;
      term = k_37.invoke(context, d_164);
      if(term == null)
        break Fail170;
      i_164 = term;
      term = l_37.invoke(context, g_164);
      if(term == null)
        break Fail170;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRemain_2, new IStrategoTerm[]{i_164, term}), checkListAnnos(termFactory, h_164));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}