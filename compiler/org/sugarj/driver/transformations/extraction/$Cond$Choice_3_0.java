package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cond$Choice_3_0 extends Strategy 
{ 
  public static $Cond$Choice_3_0 instance = new $Cond$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_20, Strategy u_20, Strategy v_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CondChoice_3_0");
    Fail95:
    { 
      IStrategoTerm g_116 = null;
      IStrategoTerm d_116 = null;
      IStrategoTerm e_116 = null;
      IStrategoTerm f_116 = null;
      IStrategoTerm h_116 = null;
      IStrategoTerm i_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consCondChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail95;
      d_116 = term.getSubterm(0);
      e_116 = term.getSubterm(1);
      f_116 = term.getSubterm(2);
      IStrategoList annos68 = term.getAnnotations();
      g_116 = annos68;
      term = t_20.invoke(context, d_116);
      if(term == null)
        break Fail95;
      h_116 = term;
      term = u_20.invoke(context, e_116);
      if(term == null)
        break Fail95;
      i_116 = term;
      term = v_20.invoke(context, f_116);
      if(term == null)
        break Fail95;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consCondChoice_3, new IStrategoTerm[]{h_116, i_116, term}), checkListAnnos(termFactory, g_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}