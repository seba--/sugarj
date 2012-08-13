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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_28, Strategy t_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("URightShift_2_0");
    Fail175:
    { 
      IStrategoTerm h_139 = null;
      IStrategoTerm f_139 = null;
      IStrategoTerm g_139 = null;
      IStrategoTerm i_139 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail175;
      f_139 = term.getSubterm(0);
      g_139 = term.getSubterm(1);
      IStrategoList annos150 = term.getAnnotations();
      h_139 = annos150;
      term = s_28.invoke(context, f_139);
      if(term == null)
        break Fail175;
      i_139 = term;
      term = t_28.invoke(context, g_139);
      if(term == null)
        break Fail175;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consURightShift_2, new IStrategoTerm[]{i_139, term}), checkListAnnos(termFactory, h_139));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}