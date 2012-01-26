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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeBound_1_0");
    Fail156:
    { 
      IStrategoTerm o_128 = null;
      IStrategoTerm n_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeBound_1 != ((IStrategoAppl)term).getConstructor())
        break Fail156;
      n_128 = term.getSubterm(0);
      IStrategoList annos140 = term.getAnnotations();
      o_128 = annos140;
      term = w_24.invoke(context, n_128);
      if(term == null)
        break Fail156;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeBound_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}