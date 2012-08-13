package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Left$Shift_2_0 extends Strategy 
{ 
  public static $Left$Shift_2_0 instance = new $Left$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_28, Strategy x_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LeftShift_2_0");
    Fail177:
    { 
      IStrategoTerm j_140 = null;
      IStrategoTerm e_140 = null;
      IStrategoTerm f_140 = null;
      IStrategoTerm k_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail177;
      e_140 = term.getSubterm(0);
      f_140 = term.getSubterm(1);
      IStrategoList annos152 = term.getAnnotations();
      j_140 = annos152;
      term = w_28.invoke(context, e_140);
      if(term == null)
        break Fail177;
      k_140 = term;
      term = x_28.invoke(context, f_140);
      if(term == null)
        break Fail177;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLeftShift_2, new IStrategoTerm[]{k_140, term}), checkListAnnos(termFactory, j_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}