package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class comp_1_0 extends Strategy 
{ 
  public static comp_1_0 instance = new comp_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("comp_1_0");
    Fail187:
    { 
      IStrategoTerm h_132 = null;
      IStrategoTerm g_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conscomp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail187;
      g_132 = term.getSubterm(0);
      IStrategoList annos156 = term.getAnnotations();
      h_132 = annos156;
      term = x_25.invoke(context, g_132);
      if(term == null)
        break Fail187;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conscomp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}