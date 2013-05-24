package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class hiddens_1_0 extends Strategy 
{ 
  public static hiddens_1_0 instance = new hiddens_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("hiddens_1_0");
    Fail1051:
    { 
      IStrategoTerm h_469 = null;
      IStrategoTerm g_469 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conshiddens_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1051;
      g_469 = term.getSubterm(0);
      IStrategoList annos278 = term.getAnnotations();
      h_469 = annos278;
      term = f_351.invoke(context, g_469);
      if(term == null)
        break Fail1051;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conshiddens_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_469));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}