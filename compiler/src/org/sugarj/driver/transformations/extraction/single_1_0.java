package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class single_1_0 extends Strategy 
{ 
  public static single_1_0 instance = new single_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("single_1_0");
    Fail178:
    { 
      IStrategoTerm h_130 = null;
      IStrategoTerm g_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conssingle_1 != ((IStrategoAppl)term).getConstructor())
        break Fail178;
      g_130 = term.getSubterm(0);
      IStrategoList annos147 = term.getAnnotations();
      h_130 = annos147;
      term = l_25.invoke(context, g_130);
      if(term == null)
        break Fail178;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conssingle_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}