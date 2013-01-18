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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_37, Strategy d_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RightShift_2_0");
    Fail166:
    { 
      IStrategoTerm o_162 = null;
      IStrategoTerm k_162 = null;
      IStrategoTerm n_162 = null;
      IStrategoTerm p_162 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail166;
      k_162 = term.getSubterm(0);
      n_162 = term.getSubterm(1);
      IStrategoList annos136 = term.getAnnotations();
      o_162 = annos136;
      term = c_37.invoke(context, k_162);
      if(term == null)
        break Fail166;
      p_162 = term;
      term = d_37.invoke(context, n_162);
      if(term == null)
        break Fail166;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRightShift_2, new IStrategoTerm[]{p_162, term}), checkListAnnos(termFactory, o_162));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}