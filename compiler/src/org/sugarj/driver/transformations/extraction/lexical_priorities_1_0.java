package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_priorities_1_0 extends Strategy 
{ 
  public static lexical_priorities_1_0 instance = new lexical_priorities_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_priorities_1_0");
    Fail257:
    { 
      IStrategoTerm h_146 = null;
      IStrategoTerm g_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conslexical_priorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail257;
      g_146 = term.getSubterm(0);
      IStrategoList annos209 = term.getAnnotations();
      h_146 = annos209;
      term = x_28.invoke(context, g_146);
      if(term == null)
        break Fail257;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conslexical_priorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}