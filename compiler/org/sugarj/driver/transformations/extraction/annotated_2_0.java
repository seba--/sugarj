package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class annotated_2_0 extends Strategy 
{ 
  public static annotated_2_0 instance = new annotated_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_352, Strategy h_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("annotated_2_0");
    Fail1074:
    { 
      IStrategoTerm f_472 = null;
      IStrategoTerm d_472 = null;
      IStrategoTerm e_472 = null;
      IStrategoTerm g_472 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consannotated_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1074;
      d_472 = term.getSubterm(0);
      e_472 = term.getSubterm(1);
      IStrategoList annos299 = term.getAnnotations();
      f_472 = annos299;
      term = g_352.invoke(context, d_472);
      if(term == null)
        break Fail1074;
      g_472 = term;
      term = h_352.invoke(context, e_472);
      if(term == null)
        break Fail1074;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consannotated_2, new IStrategoTerm[]{g_472, term}), checkListAnnos(termFactory, f_472));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}