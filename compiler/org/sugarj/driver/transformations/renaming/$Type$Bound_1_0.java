package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Bound_1_0 extends Strategy 
{ 
  public static $Type$Bound_1_0 instance = new $Type$Bound_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeBound_1_0");
    Fail159:
    { 
      IStrategoTerm j_129 = null;
      IStrategoTerm h_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeBound_1 != ((IStrategoAppl)term).getConstructor())
        break Fail159;
      h_129 = term.getSubterm(0);
      IStrategoList annos140 = term.getAnnotations();
      j_129 = annos140;
      term = l_25.invoke(context, h_129);
      if(term == null)
        break Fail159;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeBound_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}