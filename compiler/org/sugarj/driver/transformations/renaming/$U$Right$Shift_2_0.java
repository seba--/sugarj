package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $U$Right$Shift_2_0 extends Strategy 
{ 
  public static $U$Right$Shift_2_0 instance = new $U$Right$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_23, Strategy i_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("URightShift_2_0");
    Fail127:
    { 
      IStrategoTerm e_123 = null;
      IStrategoTerm c_123 = null;
      IStrategoTerm d_123 = null;
      IStrategoTerm f_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail127;
      c_123 = term.getSubterm(0);
      d_123 = term.getSubterm(1);
      IStrategoList annos109 = term.getAnnotations();
      e_123 = annos109;
      term = h_23.invoke(context, c_123);
      if(term == null)
        break Fail127;
      f_123 = term;
      term = i_23.invoke(context, d_123);
      if(term == null)
        break Fail127;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consURightShift_2, new IStrategoTerm[]{f_123, term}), checkListAnnos(termFactory, e_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}