package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sugar$Dec_2_0 extends Strategy 
{ 
  public static $Sugar$Dec_2_0 instance = new $Sugar$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_30, Strategy j_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SugarDec_2_0");
    Fail276:
    { 
      IStrategoTerm t_150 = null;
      IStrategoTerm r_150 = null;
      IStrategoTerm s_150 = null;
      IStrategoTerm u_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSugarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail276;
      r_150 = term.getSubterm(0);
      s_150 = term.getSubterm(1);
      IStrategoList annos230 = term.getAnnotations();
      t_150 = annos230;
      term = i_30.invoke(context, r_150);
      if(term == null)
        break Fail276;
      u_150 = term;
      term = j_30.invoke(context, s_150);
      if(term == null)
        break Fail276;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSugarDec_2, new IStrategoTerm[]{u_150, term}), checkListAnnos(termFactory, t_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}