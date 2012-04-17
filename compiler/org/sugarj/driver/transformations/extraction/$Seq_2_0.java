package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Seq_2_0 extends Strategy 
{ 
  public static $Seq_2_0 instance = new $Seq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_22, Strategy t_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Seq_2_0");
    Fail117:
    { 
      IStrategoTerm s_121 = null;
      IStrategoTerm p_121 = null;
      IStrategoTerm q_121 = null;
      IStrategoTerm t_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail117;
      p_121 = term.getSubterm(0);
      q_121 = term.getSubterm(1);
      IStrategoList annos92 = term.getAnnotations();
      s_121 = annos92;
      term = s_22.invoke(context, p_121);
      if(term == null)
        break Fail117;
      t_121 = term;
      term = t_22.invoke(context, q_121);
      if(term == null)
        break Fail117;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSeq_2, new IStrategoTerm[]{t_121, term}), checkListAnnos(termFactory, s_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}