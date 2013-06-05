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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_22, Strategy p_22, Strategy q_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GuardedLChoice_3_0");
    Fail127:
    { 
      IStrategoTerm o_121 = null;
      IStrategoTerm j_121 = null;
      IStrategoTerm m_121 = null;
      IStrategoTerm n_121 = null;
      IStrategoTerm p_121 = null;
      IStrategoTerm q_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consGuardedLChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail127;
      j_121 = term.getSubterm(0);
      m_121 = term.getSubterm(1);
      n_121 = term.getSubterm(2);
      IStrategoList annos99 = term.getAnnotations();
      o_121 = annos99;
      term = o_22.invoke(context, j_121);
      if(term == null)
        break Fail127;
      p_121 = term;
      term = p_22.invoke(context, m_121);
      if(term == null)
        break Fail127;
      q_121 = term;
      term = q_22.invoke(context, n_121);
      if(term == null)
        break Fail127;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consGuardedLChoice_3, new IStrategoTerm[]{p_121, q_121, term}), checkListAnnos(termFactory, o_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}