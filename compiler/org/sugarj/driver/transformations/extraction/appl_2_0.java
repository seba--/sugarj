package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class appl_2_0 extends Strategy 
{ 
  public static appl_2_0 instance = new appl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_29, Strategy q_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("appl_2_0");
    Fail263:
    { 
      IStrategoTerm u_148 = null;
      IStrategoTerm s_148 = null;
      IStrategoTerm t_148 = null;
      IStrategoTerm v_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail263;
      s_148 = term.getSubterm(0);
      t_148 = term.getSubterm(1);
      IStrategoList annos217 = term.getAnnotations();
      u_148 = annos217;
      term = p_29.invoke(context, s_148);
      if(term == null)
        break Fail263;
      v_148 = term;
      term = q_29.invoke(context, t_148);
      if(term == null)
        break Fail263;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consappl_2, new IStrategoTerm[]{v_148, term}), checkListAnnos(termFactory, u_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}