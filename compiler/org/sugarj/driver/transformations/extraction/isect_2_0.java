package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class isect_2_0 extends Strategy 
{ 
  public static isect_2_0 instance = new isect_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_349, Strategy s_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("isect_2_0");
    Fail1021:
    { 
      IStrategoTerm h_465 = null;
      IStrategoTerm f_465 = null;
      IStrategoTerm g_465 = null;
      IStrategoTerm i_465 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consisect_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1021;
      f_465 = term.getSubterm(0);
      g_465 = term.getSubterm(1);
      IStrategoList annos253 = term.getAnnotations();
      h_465 = annos253;
      term = r_349.invoke(context, f_465);
      if(term == null)
        break Fail1021;
      i_465 = term;
      term = s_349.invoke(context, g_465);
      if(term == null)
        break Fail1021;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consisect_2, new IStrategoTerm[]{i_465, term}), checkListAnnos(termFactory, h_465));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}