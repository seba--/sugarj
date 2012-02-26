package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Right$Shift_2_0 extends Strategy 
{ 
  public static $Right$Shift_2_0 instance = new $Right$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_23, Strategy k_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RightShift_2_0");
    Fail128:
    { 
      IStrategoTerm j_123 = null;
      IStrategoTerm h_123 = null;
      IStrategoTerm i_123 = null;
      IStrategoTerm k_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail128;
      h_123 = term.getSubterm(0);
      i_123 = term.getSubterm(1);
      IStrategoList annos110 = term.getAnnotations();
      j_123 = annos110;
      term = j_23.invoke(context, h_123);
      if(term == null)
        break Fail128;
      k_123 = term;
      term = k_23.invoke(context, i_123);
      if(term == null)
        break Fail128;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consRightShift_2, new IStrategoTerm[]{k_123, term}), checkListAnnos(termFactory, j_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}