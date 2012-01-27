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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_22, Strategy t_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("URightShift_2_0");
    Fail124:
    { 
      IStrategoTerm o_122 = null;
      IStrategoTerm k_122 = null;
      IStrategoTerm l_122 = null;
      IStrategoTerm p_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail124;
      k_122 = term.getSubterm(0);
      l_122 = term.getSubterm(1);
      IStrategoList annos109 = term.getAnnotations();
      o_122 = annos109;
      term = s_22.invoke(context, k_122);
      if(term == null)
        break Fail124;
      p_122 = term;
      term = t_22.invoke(context, l_122);
      if(term == null)
        break Fail124;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consURightShift_2, new IStrategoTerm[]{p_122, term}), checkListAnnos(termFactory, o_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}