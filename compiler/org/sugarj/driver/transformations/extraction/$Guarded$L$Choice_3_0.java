package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Guarded$L$Choice_3_0 extends Strategy 
{ 
  public static $Guarded$L$Choice_3_0 instance = new $Guarded$L$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_22, Strategy q_22, Strategy r_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GuardedLChoice_3_0");
    Fail115:
    { 
      IStrategoTerm j_121 = null;
      IStrategoTerm g_121 = null;
      IStrategoTerm h_121 = null;
      IStrategoTerm i_121 = null;
      IStrategoTerm m_121 = null;
      IStrategoTerm n_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consGuardedLChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      g_121 = term.getSubterm(0);
      h_121 = term.getSubterm(1);
      i_121 = term.getSubterm(2);
      IStrategoList annos91 = term.getAnnotations();
      j_121 = annos91;
      term = p_22.invoke(context, g_121);
      if(term == null)
        break Fail115;
      m_121 = term;
      term = q_22.invoke(context, h_121);
      if(term == null)
        break Fail115;
      n_121 = term;
      term = r_22.invoke(context, i_121);
      if(term == null)
        break Fail115;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consGuardedLChoice_3, new IStrategoTerm[]{m_121, n_121, term}), checkListAnnos(termFactory, j_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}