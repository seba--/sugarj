package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class int_1_0 extends Strategy 
{ 
  public static int_1_0 instance = new int_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("int_1_0");
    Fail277:
    { 
      IStrategoTerm h_149 = null;
      IStrategoTerm g_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consint_1 != ((IStrategoAppl)term).getConstructor())
        break Fail277;
      g_149 = term.getSubterm(0);
      IStrategoList annos228 = term.getAnnotations();
      h_149 = annos228;
      term = s_29.invoke(context, g_149);
      if(term == null)
        break Fail277;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consint_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}